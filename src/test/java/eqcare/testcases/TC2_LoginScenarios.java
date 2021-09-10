package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ExtraNotRequiredClasses.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class TC2_LoginScenarios extends BaseClass{
	
	//  2. Patient login to the application to EQ Care

	LoginPage login;
	HomePage home;

	@Test(priority = 0)
	public void verifyPage() throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		home = PageFactory.initElements(driver, HomePage.class);

		logger = report.createTest("Pony Web Application Login URL validation");

		login.verifyUrlBeforeLogin();

		logger.info("Validating url");
		
		//login.peerji();
		
		//login.runTestResults("29754173");

	}

	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void loginToApplicationWithValidInput() throws Exception {

		logger = report.createTest("Login as patient wgith valid inputs");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		login.loginToApplication("sarikaqa7+t1@gmail.com", "Sarika#123");

		login.verifyUrlAfterLogin();
		
		//login.runTestResults(DataProviderFactory.getExcel().getCellData("Practitest", 1, 0));
		
		//login.peerji();

		logger.info("Patient Logged in");
	}

	@Test(priority = 2, dependsOnMethods = "loginToApplicationWithValidInput", enabled=false)
	public void logoutFromApplication() {
		logger = report.createTest("Patient Logout from Application");

		// home.startVideoConsultation();

		login.logOutFromApplication();

		logger.info("Logout done");

	}

	@Test(priority = 3, dependsOnMethods = "verifyPage", enabled=false)
	public void verifyShowHideLink() {

		logger = report.createTest("Verify Show password link on login page");

		// login.loginToApplication("automationsaru@gmail.com", "Abcde#123");

		//login.navigateToLoginPage();

		login.validateShowPasswordLink();

		logger.info("Validated Show password link");

	}

	@Test(priority = 4, dependsOnMethods = "verifyPage", enabled = false)
	public void verifyLanguageLink() {

		logger = report.createTest("Verify langauge link on login page");

		// login.loginToApplication("automationsaru@gmail.com", "Abcde#123");

		login.validatelanguageLink();

		logger.info("Validated langauge link");

	}

	@Test(priority = 5, enabled = false)
	public void signInRedirectionTest() {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Verifying register link on Login page");

		logger.info("Validate register link");

		login.signUpRedirectionTest();

		logger.info("Validated redirection to the registeration page");
	}

	@Test(priority = 6, dependsOnMethods = "verifyPage", enabled=false)
	public void loginToApplicationWithBlankInput() {

		logger = report.createTest("Login without providing email and password");

		//login.navigateToLoginPage();

		login.loginToApplication("", "");

		// login.loginToApplication("automationsaru@gmail.com", "Abcde#123");

		login.emptyFieldsTest();

		logger.info("Patient not able to login.");

		logger.info("Displayed valid error message to user.");
	}

	@Test(priority = 7, dependsOnMethods = "verifyPage", enabled=false)
	public void loginToApplicationWithNonRegisteredEmailId() {

		logger = report.createTest("Login as patient with non registered email id");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		login.loginToApplication("automationsaru@gmail.com", "Sarika#123");

		login.errorMessagesIncorrectEmailPassword();

		logger.info("Patient not able to login.");

		logger.info("Displayed valid error message to user.");
	}
	
	@Test(priority = 5)
	public void verifyHomeFooter() throws Exception {

		logger.info("Verify Start a Consultation link display to use");

		login.verifyHomeFooter();

		logger.info("Validated Start a Consultation link displayed to patient");

	}

}