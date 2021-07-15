package eqcare.peerjitestcases.copy1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.ForgotPasswordPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class TC2_ForgotPasswordScenarios extends BaseClass {

	// 2. Patient login to the application to EQ Care

	ForgotPasswordPage forgot;
	HomePage home;
	LoginPage login;

	@Test(priority = 0)
	public void verifyPage() {

		forgot = PageFactory.initElements(driver, ForgotPasswordPage.class);

		forgot.navigateToForgortPasswordModal();

		forgot.verifyResetPasswordModal();

	}

	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void resetPasswordWithInValidInput() {

		//logger = report.createTest("Login as patient with valid inputs");

		forgot.navigateToForgortPasswordModal();

		forgot.errorMessageEmptyEmail();

		//logger.info("Patient ");
	}

	@Parameters({"Email"})
	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void resetPasswordWithValidInput(String email) {

		//logger = report.createTest("Login as patient with valid inputs");
		
		forgot.navigateToForgortPasswordModal();

		forgot.resetPasswordNotification(email);

		//logger.info("Patient ");
	}

	@Test(priority = 3, enabled=false)
	public void resetPassword() {

		//logger = report.createTest("Login as patient with valid inputs");

		forgot.navigateToPasswordResetPage();

		forgot.resetPassword();
	}

}