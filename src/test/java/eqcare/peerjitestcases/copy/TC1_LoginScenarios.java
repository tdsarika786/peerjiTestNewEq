package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class TC1_LoginScenarios extends BaseClass {

	// Patient login to the application to EQ Care

	LoginPage login;
	HomePage home;

	@Test(priority = 0)
	public void verifyPage() throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		home = PageFactory.initElements(driver, HomePage.class);

		login.verifyUrlBeforeLogin();

	}

	@Parameters({ "AppURL" })
	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void verifyShowHideLink(String appurl) {

		login.navigateToLoginPage(appurl);

		login.validateShowPasswordLink();

	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void verifyLanguageLink() {

		login.validatelanguageLink();

	}

	@Test(priority = 5, enabled = false)
	public void signInRedirectionTest() {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Verifying register link on Login page");

		logger.info("Validate register link");

		login.signUpRedirectionTest();

		logger.info("Validated redirection to the registeration page");
	}

	@Parameters({ "AppURL" })
	@Test(priority = 3, dependsOnMethods = "verifyPage")
	public void loginToApplicationWithBlankInput(String appurl) {

		login.navigateToLoginPage(appurl);

		login.loginToApplication("", "");

		// login.loginToApplication("automationsaru@gmail.com", "Abcde#123");

		login.emptyFieldsTest();
	}

	@Test(priority = 4, dependsOnMethods = "verifyPage")
	public void loginToApplicationWithNonRegisteredEmailId() {

		login.loginToApplication("automationsaru@gmail.com", "Sarika#123");

		login.errorMessagesIncorrectEmailPassword();

	}

	@Test(priority = 5, dependsOnMethods = "verifyPage")
	public void verifyHomeFooter() throws Exception {

		login.verifyHomeFooter();

	}

	@Parameters({ "Email", "Password" })
	@Test(priority = 6, dependsOnMethods = "verifyPage")
	public void loginToApplication(String email, String password) throws Exception {

		login.loginToApplication(email, password);

		login.verifyUrlAfterLogin();

	}

	@Test(priority = 7, dependsOnMethods = "loginToApplication")
	public void logoutFromApplication() {

		login.logOutFromApplication();

	}

}