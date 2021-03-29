package AutomatedTests;

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

public class TC2_RegisterationScenarios extends BaseClass {

	LoginPage login;
	HomePage home;
	AccountPage account;
	IntakeFormPage intake;
	VisitPage visit;
	FeedbackPage feedback;
	HelpPage help;
	InboxPage inbox;
	RegistrationPage register;

	// 1. Individual Paying Patient register to EQ Care using automation

	@Test(priority = 0)
	public void verifyPage() {

		register = PageFactory.initElements(driver, RegistrationPage.class);

		logger = report.createTest("Registration Page URL validation");

		logger.info("Validating Register now link");

		register.verifyUrlBeforeRegister();

		logger.info("Validated Registeration URL and Register now link");

	}
	
	//sarikaqa7+b1@gmail.com  = Individual
	//sarikaqa7+c1@gmail.com  = Covered Single

	@Test(priority = 1, dependsOnMethods = "verifyPage", enabled=false)
	public void validInputRegisterationTest() {

		register = PageFactory.initElements(driver, RegistrationPage.class);

		logger = report.createTest("Individual-paying Patient Register with required and optional fields");

		register.notEnrolledUser();
		
		//register.EnrolledUser();

		logger.info("Validated not Enrolled link");

		// register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 2,
		// 0),
		
		//paying customer
		
		//sarikaqa7+accvir1@gmail.com
		
		//QA1 - sarikaqa7+envqa1nen@gmail.com
		// -  sarikaqa7+envqa1en1@gmail.com

		register.Registeration("sarikaqa7+envne@gmail.com",

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				DataProviderFactory.getExcel().getCellData("Users", 2, 10), true);

		register.registerationCompleteWithValidInput();

		logger.info("Required fields entered by user");

		logger.info("Optional fields - Profile Pic, Address 2, Health Card entered by user");

		logger.info("Registeration complete for self-paying patient - "
				// + DataProviderFactory.getExcel().getCellData("Users", 1, 0) + " with EQ
				// Care");
				+ "sarikaqa7+i1@gmail.com" + " with EQ Care");

		register.runTestResults("29754305", "0");

	}
	
	
	@Parameters({"Email","CoverageToken","CoverageIdentifier"})
	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest(String email, String coveragetoken, String coverageidentifier) {

		logger = report.createTest("Enrolled Patient Register with required and optional fields");

		register.EnrolledUser();

		logger.info("Validated Enrolled link");
		
		register.EnrolledUserWithValidInput(coveragetoken,coverageidentifier);
		
		//LJ - sarikaqa7+ljno1@gmail.com - Life Journey None
		
		register.Registeration(email,

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				DataProviderFactory.getExcel().getCellData("Users", 2, 10), true);

		register.registerationCompleteWithValidInput();

		logger.info("Required fields entered by user");

		logger.info("Optional fields - Profile Pic, Medical Card, Address 2, Health Card entered by user");

		logger.info("Registeration complete for self-paying patient - "
				// + DataProviderFactory.getExcel().getCellData("Users", 1, 0) + " with EQ
				// Care");
				+ "sarikaqa7+enro2@gmail.com" + " with EQ Care");
		
		//register.runTestResults("29754306","0");
	}

}