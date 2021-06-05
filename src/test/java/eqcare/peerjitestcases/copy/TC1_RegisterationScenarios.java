package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.FeedbackPage;
import eqcare.pages.HelpPage;
import eqcare.pages.HomePage;
import eqcare.pages.InboxPage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.RegistrationPage;
import eqcare.pages.VisitPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.AccountPage;
import eqcare.pages.Base;
import eqcare.pages.BaseClass;

public class TC1_RegisterationScenarios extends BaseClass {

	LoginPage login;
	HomePage home;
	AccountPage account;
	IntakeFormPage intake;
	VisitPage visit;
	FeedbackPage feedback;
	HelpPage help;
	InboxPage inbox;
	RegistrationPage register;


	@Test(priority = 0)
	public void verifyPage() {

		register = PageFactory.initElements(driver, RegistrationPage.class);

		register.verifyUrlBeforeRegister();

	}
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier"})
	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest(String email, String coveragetoken, String coverageidentifier, String FileType) {
		
		register.EnrolledUserWithValidInput(coveragetoken,coverageidentifier);
		
		register.Registeration1(email,

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				DataProviderFactory.getExcel().getCellData("Users", 2, 10), false, "pdf");

		register.registerationCompleteWithValidInput();

	}

}