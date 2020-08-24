package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import eqcare.pages.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class IndividualPayingPatientRegisteration extends BaseClass {

	RegistrationPage register;

	@Test(priority = 0)
	public void verifyPage() {

		register = PageFactory.initElements(driver, RegistrationPage.class);

		logger = report.createTest("Registration Page URL validation");

		logger.info("Validating Register now link");

		register.verifyUrlBeforeRegister();

		logger.info("Validated Registeration URL");

	}

	@Test(priority = 1, enabled = false)
	public void signInRedirectionTest() {
		register = PageFactory.initElements(driver, RegistrationPage.class);

		logger = report.createTest("Registration Page URL validation");

		register.signInRedirectionTest();
		
		logger.info("Valided redirection to the Sign in page");
	}

	@Test(priority = 1, dependsOnMethods = "verifyPage", enabled = false)
	public void validInputRegisterationTest() {

		logger = report.createTest("Individual-paying Patient Registers with EQ Care");

		register.notEnrolledUser();

		logger.info("Validated not Enrolled link");

		register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 2, 0),

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				DataProviderFactory.getExcel().getCellData("Users", 2, 10), true);

		// register.registerationWithInValidInput();

		logger.info("Registeration complete for self-paying patient - "
				+ DataProviderFactory.getExcel().getCellData("Users", 1, 0) + " with EQ Care");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage", enabled = false)
	public void invalidInputRegisterationTest() {

		logger = report.createTest("Register Patient with existing Email Id for EQCare Services");

		register.notEnrolledUser();

		logger.info("Validated not Enrolled link");

		register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 2, 0),

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
				+ DataProviderFactory.getExcel().getCellData("Users", 1, 0));
	}

	@Test(priority = 1, dependsOnMethods = "verifyPage", enabled = false)
	public void validInputRegisterationWithRequiredFields() {
		logger = report.createTest("Individual-paying Patient Registers with EQ Care by entering only required fields");

		register.notEnrolledUser();

		logger.info("Validated not Enrolled link");

		register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 2, 0),

				DataProviderFactory.getExcel().getCellData("Users", 2, 1),
				DataProviderFactory.getExcel().getCellData("Users", 2, 2),

				DataProviderFactory.getExcel().getCellData("Users", 2, 4),

				DataProviderFactory.getExcel().getCellData("Users", 2, 5),
				DataProviderFactory.getExcel().getCellData("Users", 2, 6),

				DataProviderFactory.getExcel().getCellData("Users", 2, 7),
				DataProviderFactory.getExcel().getCellData("Users", 2, 8),

				DataProviderFactory.getExcel().getCellData("Users", 2, 9),
				DataProviderFactory.getExcel().getCellData("Users", 2, 10), false);

		// register.registerationWithInValidInput();

		logger.info("Registeration complete for Not Enrolled User - "
				+ DataProviderFactory.getExcel().getCellData("Users", 1, 0) + " ,Register in EQCare as Patient");

	}

	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void verifyNotEnrolledUserRegisterToApplicationWithEmptyFields() {
		
		logger = report.createTest("Validating Error messages");
		
		register.notEnrolledUser();
		
		logger.info("Registeration without providing email, firstname, lastname, sex at birth");

		register.emptyFieldsTest();
		
		logger.info("Displayed valid error messages");

	}

}