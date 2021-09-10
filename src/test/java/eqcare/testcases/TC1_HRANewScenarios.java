	package eqcare.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.HRAHomePage;
import eqcare.pages.HRAHomePageNew;
import eqcare.pages.HRAHomePageNew2;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class TC1_HRANewScenarios extends BaseClass {

	LoginPage login;
	HRAHomePageNew home;
	LifeJourneyIntakeFormPage intakeForm;
	ClinicPage clinic;
	HRAHomePageNew2 homeNew;

	@Parameters({"Email","Password"})
	@Test(priority = 1)
	public void verifyPage(String email, String password) throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication(email,
				password);

		home = PageFactory.initElements(driver, HRAHomePageNew.class);
		
		homeNew = PageFactory.initElements(driver, HRAHomePageNew2.class);
		
		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		home.verifyUrl();
		
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void verifyHRAIntroPage() throws Exception {
		
		home.calculateHealthScoreLink();

		home.verifyHRAIntroductionPage();
		
		System.out.println("*******PEERJI HRA START***********");

	}
	
	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage")
	public void verifyPhysicalQues1() throws Exception {
		
		home.verifyHRAPhysicalIntakeFormsQues1();
		
		System.out.println("1-verifyHRAPhysicalIntakeFormsQues1");

	}
	
	@Test(priority = 4, dependsOnMethods = "verifyPhysicalQues1")
	public void verifyPhysicalQues2() throws Exception {
		
		home.verifyHRAPhysicalIntakeFormsQues2();
		
		System.out.println("2-verifyHRAPhysicalIntakeFormsQues2");

	}
	
	@Test(priority = 5, dependsOnMethods = "verifyPhysicalQues2")
	public void verifyPhysicalQues3() throws Exception {
		
		home.verifyHRAPhysicalIntakeFormsQues3();
		
		System.out.println("3-verifyHRAPhysicalIntakeFormsQues3");

	}
	
	@Test(priority = 6, dependsOnMethods = "verifyPhysicalQues3")
	public void verifyLifeStyleQuesSleep1() throws Exception {
		
		home.verifyHRALifeStyleQuesSleep1();
		
		System.out.println("4-verifyHRALifeStyleQuesSleep1");

	}
	
	
	@Test(priority = 7, dependsOnMethods = "verifyLifeStyleQuesSleep1")
	public void verifyLifeStyleQuesSmoking2() throws Exception {
		
		home.verifyHRALifeStyleQuesSmoking2();
		
		System.out.println("5-verifyHRALifeStyleQuesSmoking2");

	}
	
	@Test(priority = 8, dependsOnMethods = "verifyLifeStyleQuesSmoking2")
	public void verifyLifeStyleQuesDrinking1() throws Exception {
		
		home.verifyHRALifeStyleQuesDrinking1();
		
		System.out.println("6-verifyLifeStyleQuesDrinking1");

	}
	
	@Test(priority = 9, dependsOnMethods = "verifyLifeStyleQuesDrinking1")
	public void verifyLifeStyleQuesStressHappiness1() throws Exception {
		
		home.verifyHRALifeStyleQuesStressHappiness();
		
		System.out.println("7-verifyHRALifeStyleQuesStressHappiness");

	}
	
	@Test(priority = 10, dependsOnMethods = "verifyLifeStyleQuesStressHappiness1")
	public void verifyMedical() throws Exception {
		
		home.verifyMedical();
		
		System.out.println("8-verifyMedical");

	}
	
	
	@Test(priority = 11, dependsOnMethods = "verifyLifeStyleQuesStressHappiness1")
	public void verifyHRACompletition() throws Exception {
		
		String scoreLabel = "There’s room for improvement.";
		
		homeNew.hraCompletionPage(scoreLabel);
		
		System.out.println("9-HRA Completition");
		
		System.out.println("*******END***********");

	}
	
	
	
	
	
	
	@Test(priority = 3, dependsOnMethods = "verifyPage", enabled=false)
	public void verifyHRAPhysicalIntakeForms() throws Exception {

		home.verifyHRAPhysicalIntakeForms();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}
	
	
	@Test(priority = 2, dependsOnMethods = "verifyPage", enabled=false)
	public void verifyHRAPages() throws Exception {
		
		//home.navigateToHRAContentLibrary();
		
		//home.verifyHRAContentLibrary();
		
		home.navigateToHRAIntakePage();

		home.verifyHRAPhysicalIntakeForms();
		
		home.verifyHRALifeStyle();
		
		home.verifyMedical();

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