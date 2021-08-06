package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;

import eqcare.pages.HRAHomePageNew2;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class TC1_HRANewScenariosDifferentInput extends BaseClass {

	LoginPage login;
	HRAHomePageNew2 home;
	LifeJourneyIntakeFormPage intakeForm;
	ClinicPage clinic;

	@Parameters({ "Email", "Password" })
	@Test(priority = 1)
	public void verifyPage(String email, String password) throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication(email, password);

		home = PageFactory.initElements(driver, HRAHomePageNew2.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		home.verifyUrl();

	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void verifyHRAIntroPage() throws Exception {

		home.calculateHealthScoreLink();

		home.verifyHRAIntroductionPage();

		System.out.println("*******PEERJI HRA START Scenario 1***********");

	}
	
	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage")
	public void hraKeepItScenario() throws Exception {
		
		//Keep it up.
		//72%

		home.verifyHRAPhysicalIntakeFormsQues1("154", "40", "80");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRAPhysicalIntakeFormsQues2("option3");

		System.out.println("verifyHRAPhysicalIntakeFormsQues3");

		home.verifyHRAPhysicalIntakeFormsQues3("option1");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRALifeStyleQuesSleep1("2");

		System.out.println("verifyHRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2("option2", "10");

		System.out.println("verifyHRALifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1("option2", "10");

		System.out.println("verifyLifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress("option2");

		System.out.println("verifyHRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness("option2");

		System.out.println("verifyHRALifeStyleQuesHappiness");

		home.verifyMedical("Med1", "Yes", "No");
		
		home.verifyMedical("Med2", "Yes", "No");
		
		home.verifyMedical("Med3", "Yes", "Yes");

		home.verifyMedical("Med4", "Yes", "Yes");
		
		home.verifyMedical("Med5", "Yes", "Yes");
		
		home.verifyMedical("Med6", "Yes", "Yes");
		
		home.verifyMedical("Med7", "No", "No");
		
		home.verifyMedical("Med8", "No", "No");
		
		System.out.println("verifyMedical");

		home.hraCompletionPage();

		System.out.println("HRA Completition");

		System.out.println("*******END***********");

	}
	
	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage")
	public void hraKeepItUpScenario() throws Exception {
		
		//Keep it up.
		//72%

		home.verifyHRAPhysicalIntakeFormsQues1("154", "40", "80");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRAPhysicalIntakeFormsQues2("option3");

		System.out.println("verifyHRAPhysicalIntakeFormsQues3");

		home.verifyHRAPhysicalIntakeFormsQues3("option1");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRALifeStyleQuesSleep1("2");

		System.out.println("verifyHRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2("option2", "10");

		System.out.println("verifyHRALifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1("option2", "10");

		System.out.println("verifyLifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress("option2");

		System.out.println("verifyHRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness("option2");

		System.out.println("verifyHRALifeStyleQuesHappiness");

		home.verifyMedical("Med1", "Yes", "No");
		
		home.verifyMedical("Med2", "Yes", "No");
		
		home.verifyMedical("Med3", "No", "No");

		home.verifyMedical("Med4", "No", "No");
		
		home.verifyMedical("Med5", "No", "No");
		
		home.verifyMedical("Med6", "No", "No");
		
		home.verifyMedical("Med7", "No", "No");
		
		home.verifyMedical("Med8", "No", "No");
		
		System.out.println("verifyMedical");

		home.hraCompletionPage();

		System.out.println("HRA Completition");

		System.out.println("*******END***********");

	}

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled=false)
	public void hraDoingVeryWellScenario() throws Exception {
		
		//Percentage 59 percentage = Keep an eye on it.

		home.verifyHRAPhysicalIntakeFormsQues1("250", "125", "87");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRAPhysicalIntakeFormsQues2("option3");

		System.out.println("verifyHRAPhysicalIntakeFormsQues3");

		home.verifyHRAPhysicalIntakeFormsQues3("option1");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRALifeStyleQuesSleep1("9");

		System.out.println("verifyHRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2("option1", "0");

		System.out.println("verifyHRALifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1("option1", "0");

		System.out.println("verifyLifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress("option1");

		System.out.println("verifyHRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness("option1");

		System.out.println("verifyHRALifeStyleQuesHappiness");

		home.verifyMedical("Med1", "No", "No");
		
		home.verifyMedical("Med2", "No", "No");
		
		home.verifyMedical("Med3", "No", "No");

		home.verifyMedical("Med4", "No", "No");
		
		home.verifyMedical("Med5", "No", "No");
		
		home.verifyMedical("Med6", "No", "No");
		
		home.verifyMedical("Med7", "No", "No");
		
		home.verifyMedical("Med8", "No", "No");
		
		System.out.println("verifyMedical");

		home.hraCompletionPage();

		System.out.println("HRA Completition");

		System.out.println("*******END***********");

	}

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled=false)
	public void bestScenario() throws Exception {
		
		//Percentage 59 percentage = Keep an eye on it.

		home.verifyHRAPhysicalIntakeFormsQues1("60", "157", "87");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRAPhysicalIntakeFormsQues2("option3");

		System.out.println("verifyHRAPhysicalIntakeFormsQues2");

		home.verifyHRAPhysicalIntakeFormsQues3("option1");

		System.out.println("verifyHRAPhysicalIntakeFormsQues3");

		home.verifyHRALifeStyleQuesSleep1("8");

		System.out.println("verifyHRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2("option1", "0");

		System.out.println("verifyHRALifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1("option1", "0");

		System.out.println("verifyLifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress("option1");

		System.out.println("verifyHRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness("option1");

		System.out.println("verifyHRALifeStyleQuesHappiness");

		home.verifyMedical("Med1", "No", "No");
		
		home.verifyMedical("Med2", "No", "No");
		
		home.verifyMedical("Med3", "No", "No");

		home.verifyMedical("Med4", "No", "No");
		
		home.verifyMedical("Med5", "No", "No");
		
		home.verifyMedical("Med6", "No", "No");
		
		home.verifyMedical("Med7", "No", "No");
		
		home.verifyMedical("Med8", "No", "No");
		
		System.out.println("verifyMedical");

		home.hraCompletionPage();

		System.out.println("HRA Completition");

		System.out.println("*******END***********");

	}


	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled=false)
	public void bestScenario2() throws Exception {
		
		//Percentage 59 percentage = Keep an eye on it., option =2
		

		//home.calculateHealthScoreLink();

		//home.verifyHRAIntroductionPage();

		System.out.println("*******PEERJI HRA START Scenario 1***********");

		home.verifyHRAPhysicalIntakeFormsQues1("60", "157", "87");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRAPhysicalIntakeFormsQues2("option2");

		System.out.println("verifyHRAPhysicalIntakeFormsQues2");

		home.verifyHRAPhysicalIntakeFormsQues3("option2");

		System.out.println("verifyHRAPhysicalIntakeFormsQues3");

		home.verifyHRALifeStyleQuesSleep1("2");

		System.out.println("verifyHRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2("option2", "10");

		System.out.println("verifyHRALifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1("option2", "10");

		System.out.println("verifyLifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress("option2");

		System.out.println("verifyHRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness("option2");

		System.out.println("verifyHRALifeStyleQuesHappiness");

		home.verifyMedical("Med1", "No", "No");
		
		home.verifyMedical("Med2", "No", "No");
		
		home.verifyMedical("Med3", "No", "No");

		home.verifyMedical("Med4", "No", "No");
		
		home.verifyMedical("Med5", "No", "No");
		
		home.verifyMedical("Med6", "No", "No");
		
		home.verifyMedical("Med7", "No", "No");
		
		home.verifyMedical("Med8", "No", "No");
		
		System.out.println("verifyMedical");

		home.hraCompletionPage();

		System.out.println("HRA Completition");

		System.out.println("*******END***********");

	}
	
	
	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled=false)
	public void bestScenario3() throws Exception {
		
		//There’s room for improvement.
		//34%, option =3
		

		//home.calculateHealthScoreLink();

		//home.verifyHRAIntroductionPage();

		System.out.println("*******PEERJI HRA START Scenario 3***********");

		home.verifyHRAPhysicalIntakeFormsQues1("60", "157", "87");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRAPhysicalIntakeFormsQues2("option3");

		System.out.println("verifyHRAPhysicalIntakeFormsQues2");

		home.verifyHRAPhysicalIntakeFormsQues3("option3");

		System.out.println("verifyHRAPhysicalIntakeFormsQues3");

		home.verifyHRALifeStyleQuesSleep1("1");

		System.out.println("verifyHRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2("option3", "10");

		System.out.println("verifyHRALifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1("option3", "10");

		System.out.println("verifyLifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress("option3");

		System.out.println("verifyHRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness("option3");

		System.out.println("verifyHRALifeStyleQuesHappiness");

		home.verifyMedical("Med1", "No", "No");
		
		home.verifyMedical("Med2", "No", "No");
		
		home.verifyMedical("Med3", "No", "No");

		home.verifyMedical("Med4", "No", "No");
		
		home.verifyMedical("Med5", "No", "No");
		
		home.verifyMedical("Med6", "No", "No");
		
		home.verifyMedical("Med7", "No", "No");
		
		home.verifyMedical("Med8", "No", "No");
		
		System.out.println("verifyMedical");

		home.hraCompletionPage();

		System.out.println("HRA Completition");

		System.out.println("*******END***********");

	}
	
	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled=false)
	public void bestScenario4() throws Exception {
		
		//There’s room for improvement.
		//23%, option =3
		

		//home.calculateHealthScoreLink();

		//home.verifyHRAIntroductionPage();

		System.out.println("*******PEERJI HRA START Scenario 3***********");

		home.verifyHRAPhysicalIntakeFormsQues1("65", "175", "85");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRAPhysicalIntakeFormsQues2("option3");

		System.out.println("verifyHRAPhysicalIntakeFormsQues2");

		home.verifyHRAPhysicalIntakeFormsQues3("option4");

		System.out.println("verifyHRAPhysicalIntakeFormsQues3");

		home.verifyHRALifeStyleQuesSleep1("1");

		System.out.println("verifyHRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2("option4", "10");

		System.out.println("verifyHRALifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1("option3", "10");

		System.out.println("verifyLifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress("option3");

		System.out.println("verifyHRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness("option3");

		System.out.println("verifyHRALifeStyleQuesHappiness");

		home.verifyMedical("Med1", "Yes", "No");
		
		home.verifyMedical("Med2", "Yes", "No");
		
		home.verifyMedical("Med3", "Yes", "No");

		home.verifyMedical("Med4", "Yes", "No");
		
		home.verifyMedical("Med5", "Yes", "No");
		
		home.verifyMedical("Med6", "Yes", "No");
		
		home.verifyMedical("Med7", "Yes", "No");
		
		home.verifyMedical("Med8", "Yes", "No");
		
		System.out.println("verifyMedical");

		home.hraCompletionPage();

		System.out.println("HRA Completition");

		System.out.println("*******END***********");

	}
	
	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled=false)
	public void bestScenario5() throws Exception {
		
		//There’s room for improvement.
		//27%, option =3
		

		//home.calculateHealthScoreLink();

		//home.verifyHRAIntroductionPage();

		System.out.println("*******PEERJI HRA START Scenario 3***********");

		home.verifyHRAPhysicalIntakeFormsQues1("65", "175", "85");

		System.out.println("verifyHRAPhysicalIntakeFormsQues1");

		home.verifyHRAPhysicalIntakeFormsQues2("option3");

		System.out.println("verifyHRAPhysicalIntakeFormsQues2");

		home.verifyHRAPhysicalIntakeFormsQues3("option4");

		System.out.println("verifyHRAPhysicalIntakeFormsQues3");

		home.verifyHRALifeStyleQuesSleep1("1");

		System.out.println("verifyHRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2("option4", "10");

		System.out.println("verifyHRALifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1("option3", "10");

		System.out.println("verifyLifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress("option4");

		System.out.println("verifyHRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness("option4");

		System.out.println("verifyHRALifeStyleQuesHappiness");

		home.verifyMedical("Med1", "Yes", "Yes");
		
		home.verifyMedical("Med2", "Yes", "Yes");
		
		home.verifyMedical("Med3", "Yes", "Yes");

		home.verifyMedical("Med4", "Yes", "Yes");
		
		home.verifyMedical("Med5", "Yes", "Yes");
		
		home.verifyMedical("Med6", "Yes", "Yes");
		
		home.verifyMedical("Med7", "Yes", "No");
		
		home.verifyMedical("Med8", "Yes", "No");
		
		System.out.println("verifyMedical");

		home.hraCompletionPage();

		System.out.println("HRA Completition");

		System.out.println("*******END***********");

	}
	
	
	@Test(priority = 3, dependsOnMethods = "verifyPage", enabled = false)
	public void verifyHRAPhysicalIntakeForms() throws Exception {

		home.verifyHRAPhysicalIntakeForms();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage", enabled = false)
	public void verifyHRAPages() throws Exception {

		// home.navigateToHRAContentLibrary();

		// home.verifyHRAContentLibrary();

		home.navigateToHRAIntakePage();

		home.verifyHRAPhysicalIntakeForms();

		home.verifyHRALifeStyle();

		// home.verifyMedical();

	}

	@Test(priority = 2, enabled = false)
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

	@Test(priority = 3, dependsOnMethods = "verifyPage", enabled = false)
	public void verifyEQMedicalClinic() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		intakeForm.fillIntakeForm();
	}

	@Test(priority = 4, dependsOnMethods = "verifyPage", enabled = false)
	public void verifyflowerInformation() throws Exception {

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		intakeForm.flowerInformationCheck();

	}

}