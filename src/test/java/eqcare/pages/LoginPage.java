package eqcare.pages;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.practitest.examples.runWithAttachments;

import eqcare.factories.DataProviderFactory;
import eqcare.factories.*;
import eqcare.helper.Utility;

public class LoginPage extends runWithAttachments {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	By user = By.name("textFieldInput");

	By password = By.name("password");

	By loginButton = By.xpath("//*[@data-role='login-button']");

	By logoutButton = By.xpath("//a[contains(text(), 'Logout')]");

	By loginErrorMessage = By.className("form-field-error");

	By errorMessages = By.xpath("//p[@data-role='error']");

	By showLink = By.xpath("//input[@name='password']/following-sibling::a");

	By showHideText = By.xpath("//span[@class='phone:hidden text-gray-500']");

	By passwordLabel = By.xpath("//*[@class='form-label']");

	By languageENLink = By.xpath("//a[contains(text(), 'EN')]");

	By languageFRLink = By.xpath("//a[contains(text(), 'FR')]");
	
	By languageLink = By.xpath("//*[@id=\"scrollable-container\"]/div[2]/div[1]/a[2]");

	By registerLink = By.xpath("//*[@data-role='register-button']");

	By logoutText = By.xpath("//a[contains(text(), 'Logout')]");
	
	By needHelpText = By.xpath("//p[contains(text(), 'Need help')]");

	By phoneNoLink = By.xpath("//a[contains(text(), '1-855-449-4994')]");

	By emailLink = By.xpath("//a[contains(text(), 'support@eqcare.com')]");
	
	By homeLink = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[1]/div[2]/a[1]");

	public void verifyUrlBeforeLogin() throws Exception {

		try {
			Utility.verifyURLContains(driver, "eqcare");

		} catch (Exception ex) {
			System.out.print("Peerji");
			// runTestResults("29754173","7");
			peerji("Login", "Failed");
			// peerji("Login2","Failed");
			throw ex;
		}

	}

	public void verifyFB()

	{
		System.out.println(driver.findElement(By.xpath("//a[2]//img[1]")).isDisplayed());
	}
	
	public void navigateToHomePage() {

		Utility.waitForWebElement(driver, homeLink).click();

	}

	public void verifyUrlAfterLogin() throws Exception {
		try {

			navigateToHomePage();
			
			String text = Utility.waitForWebElement(driver, languageLink).getText();
			
			if (text.equalsIgnoreCase("EN")) {
				
				Utility.waitForWebElement(driver, languageLink).click();
				
			}
		
			WebElement ele = Utility.waitForWebElement(driver, logoutButton);
			String contactUsHeader = ele.getText();
			Assert.assertEquals(contactUsHeader, "Logout");

			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 1, 0), "0");
		} catch (Exception ex) {
			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 1, 0), "7");
			throw ex;
		}

	}

	public void typeUserName() {
		Utility.waitForWebElement(driver, user).sendKeys("Admin");
	}

	public void typePassword() {
		Utility.waitForWebElement(driver, password).sendKeys("admin123");
	}

	public void clickOnLoginButton() {
		Utility.waitForWebElement(driver, loginButton).click();
	}

	public void loginToApplication(String userName, String passWord) {
		
		Utility.waitForWebElement(driver, user).clear();
		Utility.waitForWebElement(driver, password).clear();

		Utility.waitForWebElement(driver, user).sendKeys(userName);
		Utility.waitForWebElement(driver, password).sendKeys(passWord);
		Utility.waitForWebElement(driver, loginButton).click();
		Utility.wait(2);

	}

	public void errorMessagesIncorrectEmailPassword() {
		Utility.wait(2);
		WebElement ele = Utility.waitForWebElement(driver, loginErrorMessage);
		String loginErrorMessageText = ele.getText();
		Assert.assertEquals(loginErrorMessageText, ErrorCodesProvider.read("INCORRECT_EMAIL_PASSWORD"));
	}

	public void errorMessagesIncorrectEmail() {
		WebElement ele = Utility.waitForWebElement(driver, loginErrorMessage);
		String loginErrorMessageText = ele.getText();
		Assert.assertEquals(loginErrorMessageText, ErrorCodesProvider.read("INCORRECT_EMAIL_PASSWORD"));
	}

	public void errorMessagesIncorrectPassword() {
		WebElement ele = Utility.waitForWebElement(driver, loginErrorMessage);
		String loginErrorMessageText = ele.getText();
		Assert.assertEquals(loginErrorMessageText, ErrorCodesProvider.read("INCORRECT_EMAIL_PASSWORD"));
	}

	public void emptyFieldsTest() {

		Utility.wait(2);

		List<WebElement> errorElements = Utility.waitForWebElements(driver, errorMessages);

		List<String> errors = Arrays.asList(ErrorCodesProvider.read("ENTER_EMAIL"),
				ErrorCodesProvider.read("ENTER_PASSWORD"));

		boolean errorDisplayed = false;

		int i = 0;

		for (i = 0; i < errors.size(); i++)

			// System.out.println(errorElements.get(i).getText());

			if (errorElements.get(i).getText().equalsIgnoreCase(errors.get(i))) {

				System.out.println(errorElements.get(i).getText());

				errorDisplayed = true;

			}
		Assert.assertEquals(errorDisplayed, true);
	}

	public void validateShowPasswordLink() {

		Utility.waitForWebElement(driver, password).sendKeys("TestPassword");

		Utility.wait(2);

		Utility.verifyText(driver, showHideText, "Hide");

		Utility.verifyAttribute(driver, password, "type", "password");

		Utility.waitForWebElement(driver, showLink).click();

		Utility.verifyText(driver, showHideText, "Show");

		Utility.verifyAttribute(driver, password, "type", "text");

		Utility.wait(2);

	}

	public void signUpRedirectionTest() {

		Utility.wait(2);

		Utility.waitForWebElement(driver, registerLink).click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String handle : allWindows) {
			driver.switchTo().window(handle);
		}

		String expectedURL = "https://pony.qa.eqcarestaging.com/register";

		String actualURL = driver.getCurrentUrl();
		// System.out.println(actualURL);
		Assert.assertEquals(actualURL, expectedURL);

	}

	public void validatelanguageLink() {

		Utility.waitForWebElement(driver, languageFRLink).click();

		Utility.verifyText(driver, passwordLabel, "Mot de passe");

		Utility.wait(2);

		Utility.waitForWebElement(driver, languageENLink).click();

		Utility.verifyText(driver, passwordLabel, "Password");

		Utility.wait(2);

	}

	public void navigateToLoginPage(String appurl) {

		Utility.navigateToURL(driver,appurl);
	}

public void logOutFromApplication() {
		
		String text = Utility.waitForWebElement(driver, languageLink).getText();
		
		if (text.equalsIgnoreCase("EN")) {
			
			Utility.waitForWebElement(driver, languageLink).click();
			
		}
		
		Utility.waitForWebElement(driver, logoutText).click();
		
		Utility.wait(2);
		
	}
	
public void verifyHomeFooter() throws Exception {
		
		try {

		Utility.waitForWebElement(driver, needHelpText);

		Utility.waitForWebElement(driver, phoneNoLink);

		Utility.waitForWebElement(driver, emailLink);
		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 13, 0), "0");
		} catch (Exception ex) {
			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 13, 0), "7");
			throw ex;
		}

	}

}