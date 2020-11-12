package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.ForgotPasswordPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.AccountPage;
import eqcare.pages.BaseClass;

public class TC1_AccountScenarios extends BaseClass {

	// Home Scenarios

	// thats it for now and more and more automated test cases i will create day by
	// day.
	// Thanks you

	// PAssing to next person

	LoginPage login;
	HomePage home;
	ClinicPage clinic;
	AccountPage account;

	@Test(priority = 0)
	public void verifyPage() {
		login = PageFactory.initElements(driver, LoginPage.class);

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Account Page URL validation");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		login.loginToApplication("sarikaqa7+er4@gmail.com", "Sarika#123");

		logger.info("Patient logs In");

		account.navigateToProfilePage();

		account.verifyUrlAfterLogin();

		logger.info("Validated account page URL");
	}

	@Test(priority = 1, dependsOnMethods = "verifyPage", enabled = false)
	public void editPersonalInformation() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Edits Personal Information ");

		// account.navigateToProfilePage();

		logger.info("Patint logged in and navigates to Account Page");

		// account.verifyUrlAfterLogin();

		logger.info("Patint editing user personal information");

		account.editUserPersonalInfo();

		logger.info("Patint saved user personal information");

	}

	@Test(priority = 2, dependsOnMethods = "verifyPage", enabled = false)
	public void editAccountInformation() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Edits user account information");

		// account.navigateToProfilePage();

		logger.info("Patient logged and navigates to Account Page");

		// account.verifyUrlAfterLogin();

		// logger.info("Validating Account Page Url");

		logger.info("Patient editing user account information");

		account.editUserAccountInfo();

		logger.info("Patint saved user account information");

	}

	@Test(priority = 3, dependsOnMethods = "verifyPage")
	public void uploadProfilePic() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Uploads profile pic");

		// account.navigateToProfilePage();

		logger.info("Patint logged and navigates to Account Page");

		logger.info("Patient uploading profile pic");

		account.uploadProfilePic();

		logger.info("Patint uploaded profile pic");

	}

	@Test(priority = 4, dependsOnMethods = "verifyPage")
	public void uploadGovernmentID() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Uploads government ID");

		// account.navigateToProfilePage();

		logger.info("Patient logged and navigates to Account Page");

		logger.info("Patient uploading government ID");

		account.uploadGovtID();

		logger.info("Patient uploaded Govt ID");

	}

	@Test(priority = 4, dependsOnMethods = "loginToApplication", enabled = false)
	public void patientSwitchProfile() {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Starts Video Consultation");

		account.navigateToProfilePage();

		logger.info("Patint logged and navigates to Account Page");

		logger.info("Patint uploading government ID");

		account.switchProfile();

		logger.info("Patint uploaded Govt ID");

	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication", enabled = false)
	public void logoutFromApplication() {
		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Starts Video Consultation");

		account.navigateToProfilePage();

		account.logOutFromApplication();

		logger.info("Logout done");

	}

	@Test(priority = 5, dependsOnMethods = "verifyPage")
	public void familyTab() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Verify Family Tab");

		// account.navigateToProfilePage();

		logger.info("Patient logged and navigates to Family Tab");

		account.createFamily();

		logger.info("Create a family link validated");

	}

	@Test(priority = 6, dependsOnMethods = "verifyPage")
	public void addChild() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Verify Family Tab");

		// account.navigateToProfilePage();

		logger.info("Patient logged and navigates to Family Tab");

		account.addChild();

		logger.info("Create a family link validated");

	}

	@Test(priority = 6, dependsOnMethods = "verifyPage")
	public void deleteChild() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Verify Family Tab");

		// account.navigateToProfilePage();

		logger.info("Patient logged and navigates to Family Tab");

		account.deleteChild();

		logger.info("Create a family link validated");

	}

	@Test(priority = 6, dependsOnMethods = "verifyPage", enabled = false)
	public void passwordTab() {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Verify Password Tab");

		// account.navigateToProfilePage();

		logger.info("Patient logged and navigates to Password Tab");

		logger.info("Patient resetting password");

		account.resetPassword();

		logger.info("Patient resetted password");


	}

	@Test(priority = 7, dependsOnMethods = "verifyPage", enabled = false)
	public void resetPasswordWithInvalidInput() {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Reset Password With Invalid Input");

		account.navigateToProfilePage();

		logger.info("Patient logged and navigates to Password Page");

		logger.info("Patient entered invalid inputs");

		account.invalidCurrentPassword();

		logger.info("Patient not able to reset password");

		// home.logOutFromApplication();

		// logger.info("Logout done");

	}

	@Test(priority = 4, dependsOnMethods = "loginToApplication", enabled = false)
	public void resetPasswordWithPrevUsedPassword() {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Reset Password With Previous Used Password");

		account.navigateToProfilePage();

		logger.info("Patint logged and navigates to Password Page");

		logger.info("Patient entered invalid inputs");

		account.previouslyUsedPasswordInputFields();

		logger.info("Patient not able to reset password");
		;

	}

	@Test(priority = 4, dependsOnMethods = "loginToApplication", enabled = false)
	public void resetPasswordwithBlankInput() {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Reset Password With Empty Input fields");

		account.navigateToProfilePage();

		logger.info("Patint logged and navigates to Password Page");

		logger.info("Patient provided empty input to passwords fields");

		account.blankPasswordInputFields();

		logger.info("Patient not able to reset password");
		;

	}

	@Test(priority = 4, dependsOnMethods = "loginToApplication", enabled = false)
	public void verifyShowPasswordLink() {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Verify Show Password Link");

		account.navigateToProfilePage();

		logger.info("Patint logged and navigates to Password Page");

		logger.info("Patint viewing password");

		account.validateShowPasswordLink();

		logger.info("Patint resetted password");

		// home.logOutFromApplication();

		// logger.info("Logout done");

	}

}