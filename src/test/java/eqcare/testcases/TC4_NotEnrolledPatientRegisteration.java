package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ExtraNotRequiredClasses.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class TC4_NotEnrolledPatientRegisteration extends BaseClass {
	
	
	//1. Individual Paying Patient register to EQ Care using automation

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
	public void validInputRegisterationTest() {

		logger = report.createTest("Individual-paying Patient Register with required and optional fields");

		register.notEnrolledUser();

		logger.info("Validated not Enrolled link");

		//register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 2, 0),
		
		register.Registeration("sarikaqa7+in4@gmail.com",

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
			//	+ DataProviderFactory.getExcel().getCellData("Users", 1, 0) + " with EQ Care");
		+ "sarikaqa7+nro5@gmail.com" + " with EQ Care");
	}
	
	@Test(priority = 3, dependsOnMethods = "verifyPage")
	public void validInputRegisterationWithRequiredFields() {
		logger = report.createTest("Individual-paying Patient Registers with EQ Care by entering only required fields");

		register.notEnrolledUser();

		logger.info("Validated not Enrolled link");

		//register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 2, 0),
		register.Registeration("sarikaqa7+nr7@gmail.com",

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				DataProviderFactory.getExcel().getCellData("Users", 2, 10), false);

		register.registerationCompleteWithValidInput();
		
		logger.info("Required fields entered by user");

		logger.info("Registeration complete for Not Enrolled User - "
				+ "sarikaqa7+nr6@gmail.com" + " with EQ Care");

	}

	@Test(priority = 4, dependsOnMethods = "verifyPage", enabled=false)
	public void invalidInputRegisterationTest() {

		logger = report.createTest("Register Patient with existing Email Id for EQCare Services");

		register.notEnrolledUser();

		logger.info("Validated not Enrolled link");

		//register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 2, 0),
		
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

		logger.info("Registeration not complete due to existing email Id -  "
				+ "sarikaqa7+nro1@gmail.com" + " with EQ Care");
	}

	@Test(priority = 5, dependsOnMethods = "verifyPage")
	public void verifyNotEnrolledUserRegisterToApplicationWithEmptyFields() {

		logger = report.createTest("Validating Error messages for Step -2 profile");

		register.notEnrolledUser();

		logger.info("Registeration without providing email, firstname, lastname, sex at birth");

		register.emptyFieldsTest();

		logger.info("Displayed valid error messages");

	}
	
	@Test(priority=2,dependsOnMethods="loginToApplication", enabled=false)
	public void logoutFromApplication()
	{
		logger=report.createTest("Logout");
		
	//	logout.logOutFromApplicationWithAdminRole();
		
		logger.info("Logout done");
		
	}

}