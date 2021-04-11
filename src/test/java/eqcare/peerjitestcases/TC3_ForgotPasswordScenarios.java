package eqcare.peerjitestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.ForgotPasswordPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class TC3_ForgotPasswordScenarios extends BaseClass {

	// 2. Patient login to the application to EQ Care

	ForgotPasswordPage forgot;
	HomePage home;
	LoginPage login;

	@Test(priority = 0)
	public void verifyPage() {

		forgot = PageFactory.initElements(driver, ForgotPasswordPage.class);

		logger = report.createTest("Forgot Password modal validation");

		forgot.navigateToForgortPasswordModal();

		forgot.verifyResetPasswordModal();

		logger.info("Validated forgot password  url");

	}

	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void resetPasswordWithInValidInput() {

		logger = report.createTest("Login as patient with valid inputs");

		forgot.navigateToForgortPasswordModal();

		forgot.errorMessageEmptyEmail();

		logger.info("Patient ");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void resetPasswordWithValidInput() {

		logger = report.createTest("Login as patient with valid inputs");
		
		forgot.navigateToForgortPasswordModal();

		forgot.resetPasswordNotification();

		logger.info("Patient ");
	}

	@Test(priority = 3)
	public void resetPassword() {

		logger = report.createTest("Login as patient with valid inputs");

		forgot.navigateToPasswordResetPage();

		forgot.resetPassword();
	}

}