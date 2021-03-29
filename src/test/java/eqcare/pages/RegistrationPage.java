package eqcare.pages;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.practitest.examples.runWithAttachments;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class RegistrationPage extends runWithAttachments {

	WebDriver driver;

	public RegistrationPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	By registerLink = By.xpath("//*[@data-role='register-button']");

	By signInLink = By.xpath("//a[contains(text(),'Sign in')]");

	By password = By.name("password");

	By password1 = By.xpath("(//*[@name='password'])[2]");

	By loginButton = By.xpath("//*[@data-role='login-button']");

	By emailAddress = By.xpath("//*[@placeholder='Enter your e-mail']");

	By firstName = By.xpath("//*[@placeholder='Enter your First Name']");

	By lastName = By.xpath("//*[@placeholder='Enter your Last Name']");

	By address = By.xpath("(//*[@placeholder='Enter your address'])[1]");

	By address2 = By.xpath("(//*[@placeholder='Enter your address'])[2]");

	By city = By.xpath("//*[@placeholder='Enter your city']");

	By postalCode = By.xpath("//*[@placeholder='Enter your Postal Code']");

	By dob = By.xpath("//*[@placeholder='yyyy-mm-dd']");

	By phoneNumber = By.xpath("//*[@placeholder='Enter your phone number']");

	By healthCardNumber = By.xpath("//*[@placeholder='Enter your health card number']");

	// By nextBtn = By.xpath("//*[@placeholder='account-info-step-next-button']");

//	By emailAdd = By.xpath("//*[@placeholder='Enter your phone number']");

//	By termsCond = By.xpath("//*[@placeholder='Enter your phone number']");

	By gender = By.xpath("//*[@for='gender-female']");

	By nextBtn = By.xpath("//*[@data-role='patient-info-step-next-button']");

	By checkBox1 = By.xpath("(//*[@name='checkboxFieldInput'])[1]");

	By checkBox2 = By.xpath("(//*[@name='checkboxFieldInput'])[2]");

	By confirmButton = By.xpath("//*[@data-role='confirmation-step-register-button']");

	By notCoverageButton = By.xpath("//*[@data-role='not-covered-button']");

	By accountInfoBtn = By.xpath("//*[@data-role='account-info-step-next-button']");

	By nextBtn2 = By.xpath("//*[@data-role='password-step-next-button']");

	By confirmationEmailText = By.xpath("//h2[text()='One last step']");

	By uploadProfilePic = By.xpath("(//input[@type='file'])[1]");

	By uploadGovtID = By.xpath("(//input[@type='file'])[2]");

	// Coverage

	By coverageButton = By.xpath("//*[@data-role='covered-button']");

	By groupNoInput = By.xpath("//*[@placeholder='Enter your Group Number']");

	By groupNumberLink = By.xpath("//a[@data-role='validate-group-number']");

	By coverageIdentifierInput = By.xpath("//*[@data-role='coverage-token']/input");

	By checkCoverageLink = By.xpath("//a[@data-role='validate-coverage-token-button']");

	By planTypeNextBtn = By.xpath("//a[@data-role='plan-type-next']");

	By serverErrorElement = By.xpath("//p[@data-role='error']");

	By divCoverage = By.xpath("//div[contains(text(),'Coverage')]");

	By divProfile = By.xpath("//div[contains(text(),'Profile')]");

	By divSecurity = By.xpath("//div[contains(text(),'Security')]");

	By divConfirm = By.xpath("//div[contains(text(),'Confirm')]");

	public void verifyUrlBeforeRegister()

	{
		//clickOnRegisterButton();

		Utility.verifyURLContains(driver, "register");

	}

	public void verifyFB()

	{
		System.out.println(driver.findElement(By.xpath("//a[2]//img[1]")).isDisplayed());
	}

	public void verifyUrlAfterLogin() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Dashboard does not contain dashboard keyword");
	}

	public void clickOnRegisterButton() {
		Utility.waitForWebElement(driver, registerLink).click();

	}

	public void EnrolledUser_TC1() {

		// navigateToRegistrationPage();

		clickOnRegisterButton();

		EnrolledUser();
	}

	public void EnrolledUser() {

		navigateToRegisterationPage();

		Utility.waitForWebElement(driver, coverageButton).click(); // New EQCare
	}

	public void EnrolledUserWithValidInput(String coveragetoken, String coverageidentifier) {

		//Utility.waitForWebElement(driver, groupNoInput).sendKeys("7171");
		
		//Bell Test Sarika , Gp No - 7710
		
		//Utility.waitForWebElement(driver, groupNoInput).sendKeys("77");
		
		Utility.waitForWebElement(driver, groupNoInput).sendKeys(coveragetoken);

		Utility.waitForWebElement(driver, groupNumberLink).click();

		// PEERJI
		//Utility.waitForWebElement(driver, coverageIdentifierInput).sendKeys("b2");
		
		Utility.waitForWebElement(driver, coverageIdentifierInput).sendKeys(coverageidentifier);

		Utility.wait(2);

		Utility.waitForWebElement(driver, checkCoverageLink).click();

		Utility.wait(2);

		Utility.waitForWebElement(driver, planTypeNextBtn).click();

	}

	public void registerationWithInvalidGroupNo() {

		Utility.waitForWebElement(driver, groupNoInput).sendKeys("12377777775555");

		Utility.waitForWebElement(driver, groupNumberLink).click();

		WebElement ele = Utility.waitForWebElement(driver, serverErrorElement);
		String confirmationText = ele.getText();
		Assert.assertEquals(confirmationText, "This Group Number is invalid.");

	}

	public void registerationWithInvalidCoverageIdentifier() {

		Utility.waitForWebElement(driver, groupNoInput).sendKeys("7727");

		Utility.waitForWebElement(driver, groupNumberLink).click();

		Utility.waitForWebElement(driver, coverageIdentifierInput).sendKeys("S1S2TEST");

		Utility.waitForWebElement(driver, checkCoverageLink).click();

		WebElement ele = Utility.waitForWebElement(driver, serverErrorElement);
		String confirmationText = ele.getText();
		Assert.assertEquals(confirmationText,
				"The coverage token you provided is invalid. Please contact your provider.");

	}

	public void registerationWithAlreadyAssociatedCoverageIdentifier() {

		Utility.waitForWebElement(driver, groupNoInput).sendKeys("7710");

		Utility.waitForWebElement(driver, groupNumberLink).click();

		Utility.waitForWebElement(driver, coverageIdentifierInput).sendKeys("77270");

		Utility.waitForWebElement(driver, checkCoverageLink).click();

		WebElement ele = Utility.waitForWebElement(driver, serverErrorElement);
		String confirmationText = ele.getText();
		Assert.assertEquals(confirmationText, "The coverage token you provided is already associated to an account.");

	}

	public void notEnrolledUser() {

		navigateToRegisterationPage();

		Utility.waitForWebElement(driver, notCoverageButton).click();

	}

	public void Registeration(String email, String userFirstName, String userLastName, String Address, String City,
			String PostalCode, String DOB, String PhoneNo, String HealthCardNumber, String Password, boolean optional) {

		Utility.waitForWebElement(driver, emailAddress).sendKeys(email);

		if (optional == true) {

			WebElement fileButtonProfielPic = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].style.display='block';", fileButtonProfielPic);

			Utility.waitForWebElement(driver, uploadProfilePic)
					.sendKeys(System.getProperty("user.dir") + "/TestData/sai-pic.jpeg");

		}

		// Utility.waitForWebElement(driver,
		// uploadProfilePic).sendKeys("/Users/sarikadhall/Downloads/OIP-2.jpeg");

		// Utility.waitForWebElement(driver,
		// uploadProfilePic).sendKeys(System.getProperty("user.dir") +
		// "/TestData/medical-card.jpeg");

		Utility.waitForWebElement(driver, firstName).sendKeys(userFirstName);

		Utility.waitForWebElement(driver, lastName).sendKeys(userLastName);

		Utility.waitForWebElement(driver, gender).click();

		WebElement fileButtonGovtID = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		JavascriptExecutor executorGovtID = (JavascriptExecutor) driver;
		executorGovtID.executeScript("arguments[0].style.display='block';", fileButtonGovtID);

		Utility.waitForWebElement(driver, uploadGovtID)
				.sendKeys(System.getProperty("user.dir") + "/TestData/medical-card.jpeg");

		// Utility.waitForWebElement(driver,
		// uploadGovtID).sendKeys("/Users/sarikadhall/Downloads/OIP-2.jpeg");

		Utility.waitForWebElement(driver, nextBtn).click();

		Utility.waitForWebElement(driver, address).sendKeys(Address);

		if (optional == true) {

			Utility.waitForWebElement(driver, address2).sendKeys(Address);

			Utility.waitForWebElement(driver, healthCardNumber).sendKeys(HealthCardNumber);
		}

		Utility.waitForWebElement(driver, city).sendKeys(City);

		Utility.waitForWebElement(driver, postalCode).sendKeys(PostalCode);

		Utility.waitForWebElement(driver, dob).sendKeys(DOB);

		Utility.waitForWebElement(driver, phoneNumber).sendKeys(PhoneNo);

		Utility.waitForWebElement(driver, accountInfoBtn).click();

		Utility.waitForWebElement(driver, password).sendKeys(Password);

		Utility.waitForWebElement(driver, password1).sendKeys(Password);

		Utility.waitForWebElement(driver, nextBtn2).click();

		WebElement button = driver.findElement(By.xpath("//div[@checkbox-field-id=\"email_confirmation\"]/div/input"));

		WebElement button2 = driver.findElement(By.xpath("//div[@checkbox-field-id=\"terms_and_privacy\"]/div/input"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button);

		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click()", button2);

		
		// FOR COLE TICKETS
		
		if (optional == true) {

			WebElement button3 = driver.findElement(By.xpath("//div[@checkbox-field-id=\"mailing_list\"]/div/input"));

			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("arguments[0].click()", button3);

		}
		
		
		

		// WebDriverWait wait1=new WebDriverWait(driver,10);
		// wait1.until(ExpectedConditions.elementToBeClickable(ele5));

		// Utility.highLightElement1(driver, checkBox1);

		// Utility.waitForWebElement(driver, checkBox1).click();

		// Utility.waitForWebElement(driver, checkBox2).click();

		// PEERJI
		Utility.waitForWebElement(driver, confirmButton).click();

	}

	public void registerationCompleteWithValidInput() {
		
		Utility.wait(2);

		WebElement ele = Utility.waitForWebElement(driver, confirmationEmailText);
		String confirmationText = ele.getText();
		Assert.assertEquals(confirmationText, "One last step");

	}

	public void registerationWithInValidInput() {

		WebElement ele = Utility.waitForWebElement(driver, serverErrorElement);
		String confirmationText = ele.getText();
		Assert.assertEquals(confirmationText, "This email is already in use.");

	}

	public void signInRedirectionTest() {

		Utility.waitForWebElement(driver, signInLink).click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String handle : allWindows) {
			driver.switchTo().window(handle);
		}

		String expectedURL = DataProviderFactory.getConfig().getValue("ponyEnv");

		String actualURL = driver.getCurrentUrl();
		// System.out.println(actualURL);
		Assert.assertEquals(actualURL, expectedURL);

	}

	public void emptyFieldsTest() {

		Utility.waitForWebElement(driver, nextBtn).click();

		List<WebElement> errors = Utility.waitForWebElements(driver, serverErrorElement);

		boolean errorDisplayed = true;

		for (WebElement e : errors) {
			System.out.println(e.getText());
			if (!e.isDisplayed()) {
				errorDisplayed = false; // one of the messages isn't displayed
			}
		}
		Assert.assertEquals(errorDisplayed, true);
	}

	public void verifyElementsOnPage() {

		Utility.waitForWebElement(driver, divCoverage);
		Utility.waitForWebElement(driver, divProfile);
		Utility.waitForWebElement(driver, divSecurity);
		Utility.waitForWebElement(driver, divConfirm);

		Utility.waitForWebElement(driver, coverageButton);
		Utility.waitForWebElement(driver, notCoverageButton);

	}

	public void navigateToRegisterationPage() {

		Utility.navigateToURL(driver, DataProviderFactory.getConfig().getValue("ponyRegister"));
	}

}