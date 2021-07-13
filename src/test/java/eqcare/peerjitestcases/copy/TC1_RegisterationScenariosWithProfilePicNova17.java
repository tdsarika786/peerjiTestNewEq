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
import eqcare.pages.copy.BaseClass;

public class TC1_RegisterationScenariosWithProfilePicNova17 extends BaseClass {

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
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest(String email, String coveragetoken, String coverageidentifier, String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("LJ1","anu");
		
		register.Registeration1("sarikaqa7+lj1@gmail.com",

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();

	}
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest1(String email, String coveragetoken, String coverageidentifier, String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("PC1","anu1");
		
		register.Registeration1("sarikaqa7+pc1@gmail.com",

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", false, "pdf");

		register.registerationCompleteWithValidInput();

	}
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest2(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("PCLJ1","anu2");
		
		register.Registeration1("sarikaqa7+pclj1@gmail.com",

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();

	}
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest3(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("PCLJ2","anu3");
		
		register.Registeration1("sarikaqa7+pclj2@gmail.com",

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();

	}


}