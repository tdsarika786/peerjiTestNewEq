package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.HRAHomePage;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class TC1_HRAEndScenarios extends BaseClass {

	LoginPage login;
	HRAHomePage home;
	LifeJourneyIntakeFormPage intakeForm;
	ClinicPage clinic;

	@Parameters({"Email","Password"})
	@Test(priority = 1)
	public void verifyPage(String email, String password) throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		//logger = report.createTest("Verify Home page Url");

		login.loginToApplication(email,
				password);

		//logger.info("Logged in as patient");

		home = PageFactory.initElements(driver, HRAHomePage.class);
		
		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		//logger.info("Patint logged and navigates to Home Page");

		home.navigateToHomePage();

		home.verifyUrl();

		//logger.info("Validated Home Page Url");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage", enabled=false)
	public void verifyHRAIntroPage() throws Exception {

		home.verifyHRAIntroductionPage();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}
	
	@Test(priority = 3, dependsOnMethods = "verifyPage", enabled=false)
	public void verifyHRAPhysicalIntakeForms() throws Exception {

		home.verifyHRAPhysicalIntakeForms();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}
	
	
	@Test(priority = 4, dependsOnMethods = "verifyPage")
	public void verifyHRAPages() throws Exception {
		
		home.navigateToHRAIntakePage();

		home.verifyHRAPhysicalIntakeForms();
		
		home.verifyHRALifeStyle();

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
	
	@Test(priority = 3, dependsOnMethods = "verifyPage", enabled=false)
	public void verifyEQMedicalClinic() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);
		
		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);
		
		home.navigateToHomePage();

		intakeForm.fillIntakeForm();
	}

	@Test(priority = 4, dependsOnMethods = "verifyPage", enabled=false)
	public void verifyflowerInformation() throws Exception {
		
		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);
		
		home.navigateToHomePage();

		intakeForm.flowerInformationCheck();
		
	}
	
}