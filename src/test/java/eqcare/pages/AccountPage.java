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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.practitest.examples.runWithAttachments;

import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class AccountPage extends runWithAttachments {

	WebDriver driver;

	public AccountPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	By personalInfoHeader = By.xpath("//h2[text()='Personal Information']");

	By accountInfoHeader = By.xpath("//h2[text()='Account Information']");

	By accounLink = By.xpath("//a[text()=' Account ']");

	By passwordLink = By.xpath("//a[text()=' Password ']");

	By familyLink = By.xpath("//a[text()=' Family ']");

	By personalInfoEditLink = By.xpath("(//a[text()=' Edit '])[1]");

	By accountInfoEditLink = By.xpath("(//a[text()=' Edit '])[2]");

	By languageDrpDoown = By.id("language");

	By radioSexMale = By.xpath("//label[@for='sex-male']");

	By lastNameInput = By.id("last_name");

	By firstNameInput = By.id("first_name");

	// Acc Info

	By addressInput = By.id("address");

	By address_2Input = By.id("address_2");

	By cityInput = By.id("city");

	By postal_code = By.id("postal_code");

	By date_of_birth = By.id("date_of_birth");

	By health_card = By.id("health_card");

	By provinceDropdown = By.xpath("(//select)[2]");

	By saveLink = By.xpath("//a[text()=' Save ']");

	By uploadProfilePic = By.xpath("(//input[@type='file'])[1]");

	By uploadGovtID = By.xpath("(//input[@type='file'])[2]");

	By switchProfileLink = By.xpath("//a[text()=' Switch profile ']");

	By logoutText = By.xpath("//a[contains(text(), 'Logout')]");

	//

	By currentPassword = By.xpath("(//*[@name='password'])[1]");

	By newPassword = By.xpath("(//*[@name='password'])[2]");

	By confirmPassword = By.xpath("(//*[@name='password'])[3]");

	By savePassword = By.xpath("//a[contains(text(),'Save Password')]");

	By confirmPasswordMessage = By.xpath("//p[contains(@class, 'form-confirmation-message')]");

	By showLinkCurrentPwd = By.xpath("//label[text()=' Current Password ']/following-sibling::div/a");

	By showLinkNewPwd = By.xpath("//label[text()=' New Password ']/following-sibling::div/a");

	By showLinkConfirmPwd = By.xpath("//label[text()=' Confirm New Password ']/following-sibling::div/a");

	By showHideText = By.xpath("//span[@class='phone:hidden text-gray-500']");

	By passwordErrorMessage = By.xpath("//p[contains(@class, 'form-field-error')]");

	By errorMessage = By.xpath("//p[@data-role='error']");

	By passwordNotMatchErrorMessage = By.xpath("(//p[@data-role='error'])[2]");

	/// Family

	By createFamily = By.xpath("//a[contains(text(),'Create a Family')]");

	////////

	By password = By.name("password");

	By password1 = By.xpath("(//*[@name='password'])[2]");

	By loginButton = By.xpath("//*[@data-role='login-button']");

	By emailAddress = By.xpath("//*[@placeholder='Enter your e-mail']");

	By firstName = By.xpath("//*[@placeholder='Enter your First Name']");

	By lastName = By.xpath("//*[@placeholder='Enter your Last Name']");

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

	// Coverage

	By coverageButton = By.xpath("//*[@data-role='covered-button']");

	By groupNoInput = By.xpath("//*[@placeholder='Enter your Group Number']");

	By groupNumberLink = By.xpath("//a[@data-role='validate-group-number']");

	By coverageIdentifierInput = By.xpath("//*[@data-role='coverage-token']/input");

	By checkCoverageLink = By.xpath("//a[@data-role='validate-coverage-token-button']");

	By planTypeNextBtn = By.xpath("//a[@data-role='plan-type-next']");

	By divCoverage = By.xpath("//div[contains(text(),'Coverage')]");

	By divProfile = By.xpath("//div[contains(text(),'Profile')]");

	By divSecurity = By.xpath("//div[contains(text(),'Security')]");

	By divConfirm = By.xpath("//div[contains(text(),'Confirm')]");

	By divAddFamilyMember = By.xpath("//div[contains(text(),' Add a family member ')]");

	By linkInviteChild = By.xpath("//div[2]/div/a[text()=' Invite ']");

	By childAgeNoSelect = By.xpath("//label[@for='childAge-no']");

	By childFirstName = By.xpath("//div[@text-field-id='child_first_name']/input");

	By childLastName = By.xpath("//div[@text-field-id='child_last_name']/input");

	By childDob = By.xpath("//div[@text-field-id='child_date_of_birth']/input");

	By childHealthCardNumber = By.xpath("//div[@text-field-id='child_health_card_number']/input");

	By childSexAtBirth = By.xpath("//*[@for='sex-female']");

	By addToFamilyBtn = By.xpath("//a[text()=' Add to Family ']");

	By confirmationChildAddedPopUp = By.xpath("//h2[text()='Child Added']");

	By addChildDoneLink = By.xpath("(//a[text()=' Done '])[1]");

	By deleteChildLink = By.xpath("(//a[text()=' Delete '])[1]");

	By deleteChildYesBtn = By.xpath("//a[text()=' Yes ']");
	
	By profileLink = By.xpath("//a[@href='/profile']");

	public void verifyAccountPageUrl()

	{
		// clickOnRegisterButton();

		Utility.verifyURLContains(driver, "profile");

	}

	public void clearFieldsPersonalInfo() {

		Utility.waitForWebElement(driver, firstNameInput).clear();

		Utility.waitForWebElement(driver, lastNameInput).clear();

	}

	public void clearFieldsAccountInfo() {

		Utility.waitForWebElement(driver, addressInput).clear();

		Utility.waitForWebElement(driver, address_2Input).clear();

		Utility.waitForWebElement(driver, cityInput).clear();

		Utility.waitForWebElement(driver, postal_code).clear();

		Utility.waitForWebElement(driver, date_of_birth).clear();

		Utility.waitForWebElement(driver, health_card).clear();

	}

	public void editUserPersonalInfo() throws Exception {

		try {

			navigateToProfilePage();

			Utility.waitForWebElement(driver, accounLink).click();

			Utility.waitForWebElement(driver, personalInfoEditLink).click();

			clearFieldsPersonalInfo();

			Utility.waitForWebElement(driver, personalInfoHeader);

			Utility.waitForWebElement(driver, firstNameInput).sendKeys("AakashAutomation");

			Utility.waitForWebElement(driver, lastNameInput).sendKeys("SarikaTest");

			Utility.waitForWebElement(driver, radioSexMale).click();

			WebElement languageElement = Utility.waitForWebElement(driver, languageDrpDoown);

			Select language = new Select(languageElement);

			language.selectByValue("en");

			Utility.waitForWebElement(driver, saveLink).click();

			Utility.waitForWebElement(driver, personalInfoEditLink);

			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 2, 0), "0");
		} catch (Exception ex) {
			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 2, 0), "7");
			throw ex;
		}
	}

	public void editUserAccountInfo() throws Exception {

		try {

			navigateToProfilePage();

			Utility.waitForWebElement(driver, accounLink).click();

			Utility.waitForWebElement(driver, accountInfoHeader);

			Utility.waitForWebElement(driver, accountInfoEditLink).click();

			clearFieldsAccountInfo();

			Utility.waitForWebElement(driver, addressInput).sendKeys("2177, Rue Sherbrooke");

			Utility.waitForWebElement(driver, address_2Input).sendKeys("Optional Address 2");

			Utility.waitForWebElement(driver, cityInput).sendKeys("Laval");

			Utility.waitForWebElement(driver, postal_code).sendKeys("H4K 1X7");

			Utility.waitForWebElement(driver, date_of_birth).sendKeys("2000-07-14");

			Utility.waitForWebElement(driver, health_card).sendKeys("H4K217566HKWW2");

			WebElement languageElement = Utility.waitForWebElement(driver, provinceDropdown);

			Select province = new Select(languageElement);

			province.selectByValue("AB");

			Utility.waitForWebElement(driver, saveLink).click();

			Utility.waitForWebElement(driver, accountInfoEditLink);

			runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 3,
			 0), "0");
		} catch (Exception ex) {
			 runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 3,
			 0), "7");
			throw ex;
		}
	}

	public void uploadProfilePic() throws Exception {
		try {
			WebElement fileButtonProfielPic = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].style.display='block';", fileButtonProfielPic);

			Utility.waitForWebElement(driver, uploadProfilePic)
					.sendKeys(System.getProperty("user.dir") + "/TestData/test1.jpeg");

			Utility.wait(2);
		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 4, 0), "0");
		} catch (Exception ex) {
			 runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 4,
			 0), "7");
			throw ex;
		}
	}

	public void uploadGovtID() throws Exception {

		try {

			WebElement fileButtonGovtID = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
			JavascriptExecutor executorGovtID = (JavascriptExecutor) driver;
			executorGovtID.executeScript("arguments[0].style.display='block';", fileButtonGovtID);

			Utility.waitForWebElement(driver, uploadGovtID)
					.sendKeys(System.getProperty("user.dir") + "/TestData/test2.jpeg");

			Utility.wait(2);

		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 5, 0), "0");
		} catch (Exception ex) {
			 runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 5,
			 0), "7");
			throw ex;
		}

	}

	public void resetPassword() {

		Utility.waitForWebElement(driver, passwordLink).click();

		Utility.waitForWebElement(driver, currentPassword).sendKeys("Sarika#123");

		Utility.waitForWebElement(driver, newPassword).sendKeys("Sarika#1234");

		Utility.waitForWebElement(driver, confirmPassword).sendKeys("Sarika#1234");

		Utility.waitForWebElement(driver, savePassword).click();

		Utility.wait(2);

		WebElement ele = Utility.waitForWebElement(driver, confirmPasswordMessage);
		String confirmationText = ele.getText();
		Assert.assertEquals(confirmationText, "Your password has successfully been changed.");

	}

	public void invalidCurrentPassword() {

		Utility.waitForWebElement(driver, passwordLink).click();

		Utility.waitForWebElement(driver, currentPassword).sendKeys("Abcde#123");

		Utility.waitForWebElement(driver, newPassword).sendKeys("Sarika#1234");

		Utility.waitForWebElement(driver, confirmPassword).sendKeys("Sarika#1234");

		Utility.waitForWebElement(driver, savePassword).click();

		Utility.wait(2);

		WebElement ele = Utility.waitForWebElement(driver, passwordErrorMessage);
		String errorText = ele.getText();
		Assert.assertEquals(errorText, "The current password you have entered is incorrect.");

	}

	public void passwordMatch() {

		Utility.waitForWebElement(driver, passwordLink).click();

		Utility.waitForWebElement(driver, currentPassword).sendKeys("Abcde#123");

		Utility.waitForWebElement(driver, newPassword).sendKeys("Sarika#123");

		Utility.waitForWebElement(driver, confirmPassword).sendKeys("Sarika#1234");

		Utility.waitForWebElement(driver, savePassword).click();

		Utility.wait(2);

		WebElement ele = Utility.waitForWebElement(driver, passwordNotMatchErrorMessage);
		String errorText = ele.getText();
		Assert.assertEquals(errorText, "Your password must match.");

	}

	public void blankPasswordInputFields() {

		Utility.waitForWebElement(driver, passwordLink).click();

		Utility.waitForWebElement(driver, currentPassword).clear();

		Utility.waitForWebElement(driver, newPassword).clear();

		Utility.waitForWebElement(driver, confirmPassword).clear();

		Utility.waitForWebElement(driver, savePassword).click();

		List<WebElement> errors = Utility.waitForWebElements(driver, errorMessage);

		boolean errorDisplayed = true;

		for (WebElement e : errors) {
			System.out.println(e.getText());
			if (!e.isDisplayed()) {
				errorDisplayed = false; // one of the messages isn't displayed
			}
		}
		Assert.assertEquals(errorDisplayed, true);
	}

	public void previouslyUsedPasswordInputFields() {

		Utility.waitForWebElement(driver, passwordLink).click();

		Utility.waitForWebElement(driver, currentPassword).sendKeys("Sarika#123");

		Utility.waitForWebElement(driver, newPassword).sendKeys("Sarika#123");

		Utility.waitForWebElement(driver, confirmPassword).sendKeys("Sarika#123");

		Utility.waitForWebElement(driver, savePassword).click();

		Utility.wait(2);

		WebElement ele = Utility.waitForWebElement(driver, passwordErrorMessage);
		String errorText = ele.getText();
		Assert.assertEquals(errorText,
				"You have previously used this password. For security reasons, you cannot use the last 4 passwords.");

	}

	public void validateShowPasswordLink() {

		Utility.waitForWebElement(driver, passwordLink).click();

		Utility.waitForWebElement(driver, currentPassword).sendKeys("Abcde#123");

		Utility.waitForWebElement(driver, newPassword).sendKeys("Sarika#1234");

		Utility.waitForWebElement(driver, confirmPassword).sendKeys("Sarika#1234");

		Utility.wait(2);

		Utility.verifyText(driver, showLinkCurrentPwd, "Hide");

		Utility.verifyText(driver, showLinkNewPwd, "Hide");

		Utility.verifyText(driver, showLinkConfirmPwd, "Hide");

		Utility.verifyAttribute(driver, password, "type", "password");

		Utility.waitForWebElement(driver, showLinkCurrentPwd).click();

		Utility.waitForWebElement(driver, showLinkNewPwd).click();

		Utility.waitForWebElement(driver, showLinkConfirmPwd).click();

		Utility.verifyText(driver, showLinkNewPwd, "Show");

		Utility.verifyText(driver, showLinkConfirmPwd, "Show");

		Utility.verifyText(driver, showLinkCurrentPwd, "Show");

		Utility.verifyAttribute(driver, password, "type", "text");

		Utility.wait(2);

	}

	public void switchProfile() {

		Utility.waitForWebElement(driver, switchProfileLink).click();

		Utility.verifyURLContains(driver, "choose-profile");

		Utility.wait(5);

	}

	public void logOutFromApplication() {

		Utility.waitForWebElement(driver, logoutText).click();

		Utility.wait(2);
	}

	public void createFamily() throws Exception {

		try {

			Utility.waitForWebElement(driver, familyLink).click();

			// Utility.waitForWebElement(driver, createFamily).click();

		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 6, 0), "0");
		} catch (Exception ex) {
			 runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 6,
			 0), "7");
			throw ex;
		}

	}

	public void addChild() throws Exception {
		
		try {

		Utility.waitForWebElement(driver, divAddFamilyMember).click();

		Utility.waitForWebElement(driver, linkInviteChild).click();

		Utility.waitForWebElement(driver, childAgeNoSelect).click();

		Utility.waitForWebElement(driver, childFirstName).sendKeys("Saru");

		Utility.waitForWebElement(driver, childLastName).sendKeys("Test");

		Utility.waitForWebElement(driver, childDob).sendKeys("2020-07-14");

		Utility.waitForWebElement(driver, childHealthCardNumber).sendKeys("H279780808081");

		Utility.waitForWebElement(driver, childSexAtBirth).click();

		Utility.waitForWebElement(driver, addToFamilyBtn).click();

		WebElement ele = Utility.waitForWebElement(driver, confirmationChildAddedPopUp);
		String confirmationText = ele.getText();
		Assert.assertEquals(confirmationText, "Child Added");

		Utility.waitForWebElement(driver, addChildDoneLink).click();
		
		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 7, 0), "0");
		} catch (Exception ex) {
			 runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 7,
			 0), "7");
			throw ex;
		}


	}

	public void deleteChild() throws Exception {
		
		try {

		Utility.waitForWebElement(driver, deleteChildLink).click();

		Utility.waitForWebElement(driver, deleteChildYesBtn).click();

		Utility.wait(2);

		runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 8, 0), "0");
		} catch (Exception ex) {
			 runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 8,
			 0), "7");
			throw ex;
		}

	}

	public void verifyFB()

	{
		System.out.println(driver.findElement(By.xpath("//a[2]//img[1]")).isDisplayed());
	}

	public void verifyUrlAfterLogin() {
		Assert.assertTrue(driver.getCurrentUrl().contains("profile"), "Account page does not contain profile keyword");
	}

	public void EnrolledUserWithValidInput() {

		Utility.waitForWebElement(driver, groupNoInput).sendKeys("7710");

		Utility.waitForWebElement(driver, groupNumberLink).click();

		// PEERJI
		Utility.waitForWebElement(driver, coverageIdentifierInput).sendKeys("77107");

		Utility.wait(2);

		Utility.waitForWebElement(driver, checkCoverageLink).click();

		Utility.wait(2);

		Utility.waitForWebElement(driver, planTypeNextBtn).click();

	}

	public void notEnrolledUser() {

		// navigateToRegisterationPage();

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
		// Utility.waitForWebElement(driver, confirmButton).click();

	}

	public void registerationCompleteWithValidInput() {

		// WebElement ele = Utility.waitForWebElement(driver, confirmationEmailText);
		// String confirmationText = ele.getText();
		// Assert.assertEquals(confirmationText, "One last step");

	}

	public void signInRedirectionTest() {

		// Utility.waitForWebElement(driver, signInLink).click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String handle : allWindows) {
			driver.switchTo().window(handle);
		}

		String expectedURL = DataProviderFactory.getConfig().getValue("ponyEnv");

		String actualURL = driver.getCurrentUrl();
		// System.out.println(actualURL);
		Assert.assertEquals(actualURL, expectedURL);

	}

	public void verifyElementsOnPage() {

		Utility.waitForWebElement(driver, divCoverage);
		Utility.waitForWebElement(driver, divProfile);
		Utility.waitForWebElement(driver, divSecurity);
		Utility.waitForWebElement(driver, divConfirm);

		Utility.waitForWebElement(driver, coverageButton);
		Utility.waitForWebElement(driver, notCoverageButton);

	}

	public void navigateToProfilePage() {
		
		WebElement button1 = driver.findElement(By.xpath("//a[@href='/profile']"));

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click()", button1);
		
		//Utility.waitForWebElement(driver, profileLink);

		//Utility.navigateToURL(driver, DataProviderFactory.getConfig().getValue("ponyProfile"));

		Utility.wait(2);
	}

}