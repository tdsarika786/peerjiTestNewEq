package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ExtraNotRequiredClasses.ContactUsPage;
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

public class TC1_RegisterationScenariosExisting extends BaseClass {

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
	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest(String email, String coveragetoken, String coverageidentifier, String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("LJ70","anu");
		
		register.Registeration1("sarikaqa7+lj70@gmail.com",

				"Sarika-TestLJE",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("**********************************");
		
		System.out.println("***************START REGISTER *******************");
		
		System.out.println("*************** 1- sarikaqa7+lj1@gmail.com *******************");

	}
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest1(String email, String coveragetoken, String coverageidentifier, String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("PC71","anu1");
		
		register.Registeration1("sarikaqa7+pc71@gmail.com",

				"Sarika-TestPCE",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "pdf");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 2- sarikaqa7+pc1@gmail.com *******************");

	}
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 3, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest2(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("PCLJ72","anu2");
		
		register.Registeration1("sarikaqa7+pclj72@gmail.com",

				"Sarika-TestPCLJE",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 3- sarikaqa7+pclj1@gmail.com *******************");

	}
	

	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 4, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest4(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("PCLJHRA73","anu3");
		
		register.Registeration1("sarikaqa7+pcljhra73@gmail.com",

				"Sarika-TestPCLJHRA",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 4- sarikaqa7+pcljhra1@gmail.com *******************");

	}
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 5, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest5(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("emp0001","anuemp1");
		
		register.Registeration1("sarikaqa7+anuemp1@gmail.com",

				"Sarika-TestEmpGreatE",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", false, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 5- sarikaqa7+emp70@gmail.com *******************");

	}
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 6, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest6(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("emp0001","anuemp2");
		
		register.Registeration1("sarikaqa7+anuemp2@gmail.com",

				"Sarika-TestEmpWellE",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", false, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 6- sarikaqa7+anuemp2@gmail.com *******************");

	}

	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 7, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest7(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("emp0001","anuemp3");
		
		register.Registeration1("sarikaqa7+anuemp3@gmail.com",

				"Sarika-TestEmpKeepE",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 7- sarikaqa7+anuemp3@gmail.com *******************");

	}

	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 8, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest8(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("emp0001","anuemp4");
		
		register.Registeration1("sarikaqa7+anuemp4@gmail.com",

				"Sarika-TestEmpEyeE",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 8- sarikaqa7+anuemp4@gmail.com *******************");
		
		
		System.out.println("***************END*******************");

	}

	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 9, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest9(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("emp0001","anuemp5");
		
		register.Registeration1("sarikaqa7+anuemp5@gmail.com",

				"Sarika-TestEmpImpE",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 9- sarikaqa7+anuemp5@gmail.com *******************");
		
		
		System.out.println("***************END*******************");

	}
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 10, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest10(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("AG70","anu1");
		
		register.Registeration1("sarikaqa7+ag1@gmail.com",

				"Sarika-TestEmpTestAGEE",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 10- sarikaqa7+ag1@gmail.com *******************");
		
		
		System.out.println("***************END*******************");

	}
	
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier","AppURL"})
	@Test(priority = 11, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest11(String email, String coveragetoken, String coverageidentifier,String AppUrl) {
		
		register.navigateToRegisterationPage(AppUrl);
		
		register.EnrolledUserWithValidInput("AB70","anu1");
		
		register.Registeration1("sarikaqa7+abc1@gmail.com",

				"Sarika-TestEmpTestABC",
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				"Sarika#123", true, "img");

		register.registerationCompleteWithValidInput();
		
		System.out.println("*************** 11- sarikaqa7+abc1@gmail.com *******************");
		
		
		System.out.println("***************END*******************");

	}


}