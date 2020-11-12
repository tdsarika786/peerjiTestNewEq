package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class TC7_IntakeFormScenarios extends BaseClass {

	// Home Scenarios

	// thats it for now and more and more automated test cases i will create day by
	// day.
	// Thanks you

	// PAssing to next person

	LoginPage login;
	HomePage home;
	IntakeFormPage intakeForm;
	ClinicPage clinic;

	@Test(priority = 1)
	public void verifyPage() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Verify Intake Form page Url");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		login.loginToApplication("sarikaqa7+a2@gmail.com", "Sarika#123");

		logger.info("Logged in as patient");

		home = PageFactory.initElements(driver, HomePage.class);
		
		intakeForm = PageFactory.initElements(driver, IntakeFormPage.class);
		
		intakeForm.navigateToIntakeFormPage();

		logger.info("Patint logged and navigates to Inatke Form Page");

		intakeForm.verifyIntakeFormPageUrl();

		logger.info("Validated Priimary Intake Form Page Url");
	}

	@Test(priority = 2)
	public void verifyFillIntakeForm() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Verify user can submit Intake form after entering all required fields");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		intakeForm.fillIntakeForm();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}
	
	@Test(priority = 3)
	public void verifyCancelButton() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Verify user can cancel the Intake form and redirects to Home page");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		intakeForm.cancelButton();

		logger.info("Validated Cancel Button");
	}

	@Test(priority = 3, enabled=false)
	public void verifyLanguageLink() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Verify langauge link on home page");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		home = PageFactory.initElements(driver, HomePage.class);

		logger.info("Patint logged and navigates to Home Page");

		home.validatelanguageLink();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}

	
}