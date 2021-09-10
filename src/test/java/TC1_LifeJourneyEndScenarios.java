

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ExtraNotRequiredClasses.ContactUsPage;
import eqcare.pages.LifeJourneyHomePage;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class TC1_LifeJourneyEndScenarios extends BaseClass {

	// Home Scenarios

	// thats it for now and more and more automated test cases i will create day by
	// day.
	// Thanks you

	// PAssing to next person

	LoginPage login;
	LifeJourneyHomePage home;
	LifeJourneyIntakeFormPage intakeForm;
	ClinicPage clinic;

	@Test(priority = 1)
	public void verifyPage() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Verify Home page Url");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		login.loginToApplication("sarikaqa7+ljgo@gmail.com", "Sarika#123");

		logger.info("Logged in as patient");

		home = PageFactory.initElements(driver, LifeJourneyHomePage.class);
		
		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		logger.info("Patint logged and navigates to Home Page");

		home.navigateToHomePage();

		home.verifyUrl();

		logger.info("Validated Home Page Url");
	}

	@Test(priority = 2)
	public void verifyStartLifeJourney() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);
		
		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		logger = report.createTest("Verify user can submit Intake form after entering all required fields");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		intakeForm.startLifeJourneyWithoutAnsweringQues();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}
	
	
	@Test(priority = 2, enabled=false)
	public void verifyStartLifeJourneyYesButton() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);
		
		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		logger = report.createTest("Verify user can submit Intake form after entering all required fields");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		intakeForm.startLifeJourneyAfterFillingIntakeForms();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}
	
	@Test(priority = 3)
	public void verifyEQMedicalClinic() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);
		
		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);
		
		home.navigateToHomePage();

		intakeForm.fillIntakeForm();
	}
	
	@Test(priority = 4)
	public void verifyflowerInformation() throws Exception {
		
		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);
		
		home.navigateToHomePage();

		intakeForm.flowerInformationCheck();
		
	}
	
}