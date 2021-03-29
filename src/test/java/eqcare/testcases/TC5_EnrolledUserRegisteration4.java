package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class TC5_EnrolledUserRegisteration4 extends BaseClass {
	
	//Enrolled Patient Register to EQ Care whose having coverage token

	RegistrationPage register;

	@Test(priority = 0)
	public void verifyPage() {

		register = PageFactory.initElements(driver, RegistrationPage.class);

		logger = report.createTest("Registration Page URL validation");

		logger.info("Validating Register now link");

		register.verifyUrlBeforeRegister();

		logger.info("Validated Registeration URL and Register now link");

	}

	@Test(priority = 1)
	public void signInRedirectionTest() {
		register = PageFactory.initElements(driver, RegistrationPage.class);

		logger = report.createTest("Verifying elements on Registeration page");

		register.verifyElementsOnPage();

		logger.info("Validated Coverage, profile, Security and Confirm menu links");

		logger.info("Validated Enrolled and Not Enrolled links");

		logger.info("Validating Sign In here link");

		register.signInRedirectionTest();

		logger.info("Validated redirection to the Sign in page");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void invalidGroupNoRegisteration() {

		logger = report.createTest("Verify registeration with invalid group number");

		register.EnrolledUser();

		logger.info("Validated Enrolled link");

		logger.info("Registeration by providing invalid group no");

		register.registerationWithInvalidGroupNo();

		logger.info("Displayed valid error messages");

	}

	@Test(priority = 3, dependsOnMethods = "verifyPage")
	public void invalidCoverageIdentifierRegisteration() {

		logger = report.createTest("Verify registeration with invalid coverage identifier");

		register.EnrolledUser();

		logger.info("Validated Enrolled link");

		logger.info("Registeration by providing invalid coverage identifier");

		register.registerationWithInvalidCoverageIdentifier();

		logger.info("Displayed valid error messages");

	}

	@Test(priority = 4, dependsOnMethods = "verifyPage")
	public void associatedCoverageIdentifierRegisteration() {

		logger = report.createTest("Verify registeration with already associated coverage token to an account");

		register.EnrolledUser();

		logger.info("Validated not Enrolled link");

		logger.info("Registeration by providing invalid coverage identifier");

		register.registerationWithInvalidCoverageIdentifier();

		logger.info("Displayed valid error messages");

	}
	@Parameters({"Email","CoverageToken","CoverageIdentifier"})
	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void validInputEnrolledRegisterationTest1(String email, String coveragetoken, String coverageidentifier) {

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


	@Test(priority = 7, dependsOnMethods = "verifyPage")
	public void invalidInputRegisterationTest() {

		logger = report.createTest("Register Patient with existing Email Id for EQCare Services");

		register.notEnrolledUser();

		logger.info("Validated not Enrolled link");

		// register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 2,
		// 0),

		register.Registeration("sarikaqa7+nro1@gmail.com",

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				DataProviderFactory.getExcel().getCellData("Users", 2, 10), false);

		register.registerationWithInValidInput();

		logger.info("Registeration not complete due to existing email Id -  " + "sarikaqa7+nro1@gmail.com"
				+ " with EQ Care");
	}

	@Test(priority = 8, dependsOnMethods = "verifyPage")
	public void verifyNotEnrolledUserRegisterToApplicationWithEmptyFields() {

		logger = report.createTest("Validating Error messages for Step -2 profile");

		register.notEnrolledUser();

		logger.info("Registeration without providing email, firstname, lastname, sex at birth");

		register.emptyFieldsTest();

		logger.info("Displayed valid error messages");

	}

	@Test(priority = 2, dependsOnMethods = "verifyPage", enabled = false)
	public void enrolledUserRegisterToApplication_TC1() {

		logger = report.createTest("Register Not Enrolled User for EQCare Services");

		register.EnrolledUser_TC1();
	}
}