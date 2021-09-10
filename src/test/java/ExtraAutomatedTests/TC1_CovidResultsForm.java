package ExtraAutomatedTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import eqcare.pages.CovidResultsFormPage;

import eqcare.factories.DataProviderFactory;

import eqcare.pages.BaseClass;

public class TC1_CovidResultsForm extends BaseClass {

	CovidResultsFormPage register;

	// 1. Individual Paying Patient register to EQ Care using automation

	@Test(priority = 0)
	public void verifyPage() {

		register = PageFactory.initElements(driver, CovidResultsFormPage.class);

		logger = report.createTest("Registration Page URL validation");

		logger.info("Validating Register now link");

		register.verifyUrlBeforeRegister();

		logger.info("Validated Registeration URL and Register now link");

	}

	// sarikaqa7+b1@gmail.com = Individual
	// sarikaqa7+c1@gmail.com = Covered Single

	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void validInputRegisterationTestWithRequiredFields() {

		register = PageFactory.initElements(driver, CovidResultsFormPage.class);

		logger = report.createTest("Individual-paying Patient Register with required and optional fields");

		register.Registeration(

				"sdhall@eqcare.com", "Sarika", "Test", "20200101", "5146667777", "H2378977", "202211", "Montreal",
				"2000-11-11",false
		// DataProviderFactory.getExcel().getCellData("Users", 2, 9)

		);

		logger.info("Required fields entered by user");

		logger.info("Optional fields - Profile Pic, Address 2, Health Card entered by user");

		logger.info("Registeration complete for self-paying patient - "
				// + DataProviderFactory.getExcel().getCellData("Users", 1, 0) + " with EQ
				// Care");
				+ "sarikaqa7+i1@gmail.com" + " with EQ Care");

		// register.runTestResults("29754305", "0");

	}

	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void validInputRegisteration() {

		register = PageFactory.initElements(driver, CovidResultsFormPage.class);

		logger = report.createTest("Individual-paying Patient Register with required fields");

		register.Registeration(

				"sdhall@eqcare.com", "Sarika", "Test", "20200101", "5146667777", "H2378977", "202211", "Montreal",
				"2000-11-11", true
		// DataProviderFactory.getExcel().getCellData("Users", 2, 9)

		);

		logger.info("Required fields entered by user");

		logger.info("Optional fields - Profile Pic, Address 2, Health Card entered by user");

		logger.info("Registeration complete for self-paying patient - "
				// + DataProviderFactory.getExcel().getCellData("Users", 1, 0) + " with EQ
				// Care");
				+ "sarikaqa7+i1@gmail.com" + " with EQ Care");

		// register.runTestResults("29754305", "0");

	}

}