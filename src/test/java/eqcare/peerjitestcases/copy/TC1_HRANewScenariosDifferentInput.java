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
	public void hraKeepEyeOnItScenario() throws Exception {

		// Keep an eye on it.
		// 56%
		
		String height = "154";
		String weight = "40";
		String waist = "80";

		String[] options = { "option1", "option2", "option3", "option4", "option5" };

		String[] medQues = { "Med1", "Med2", "Med3", "Med4", "Med5", "Med6", "Med7", "Med8" };

		String[] yesNoOption = { "yes", "no" };
		
		String sleepHrs="2";
		
		String noSmokes="10";
		
		String noDrinks="10";
		
		
		home.verifyHRAPhysicalIntakeFormsQues1(height, weight, waist);

		System.out.println("1-HRA PhysicalIntakeForms Ques1"+" "+height+" "+weight+ " "+waist);
		

		
		home.verifyHRAPhysicalIntakeFormsQues2(options[2]);

		System.out.println("2- HRA PhysicalIntakeForms Ques2");
		

		
		home.verifyHRAPhysicalIntakeFormsQues3(options[0]);
		
		System.out.println("3- HRA PhysicalIntakeForms Ques3");
		
		
		
		home.verifyHRALifeStyleQuesSleep1(sleepHrs);

		System.out.println("4- HRALifeStyleQues Sleep1");
		
		

		home.verifyHRALifeStyleQuesSmoking2(options[1], noSmokes);

		System.out.println("5- HRA LifeStyleQues Smoking2");
		
		
		
		home.verifyHRALifeStyleQuesDrinking1(options[1], noDrinks);

		System.out.println("6- LifeStyleQues Drinking1");
			

		
		home.verifyHRALifeStyleQuesStress(options[4]);

		System.out.println("7 -HRALifeStyleQuesStress");
		
		

		home.verifyHRALifeStyleQuesHappiness(options[4]);

		System.out.println("8- HRALifeStyleQuesHappiness");
		
		
		home.verifyMedical(medQues[0], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[1], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[2], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[3], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[4], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[5], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[6], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[7], yesNoOption[0],yesNoOption[0]);
		

		System.out.println("9- HRA Medical");

		home.hraCompletionPage();
		

		System.out.println("10- HRA Completition");

		System.out.println("*******END***********");

	}

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled = false)
	public void hraKeepItUpScenario() throws Exception {

		// Keep it up.
		// 72%

		String height = "154";
		String weight = "40";
		String waist = "80";

		String[] options = { "option1", "option2", "option3", "option4", "option5" };

		String[] medQues = { "Med1", "Med2", "Med3", "Med4", "Med5", "Med6", "Med7", "Med8" };

		String[] yesNoOption = { "yes", "no" };
		
		String sleepHrs="2";
		
		String noSmokes="10";
		
		String noDrinks="10";
		

		home.verifyHRAPhysicalIntakeFormsQues1(height,weight, waist);

		System.out.println("1-HRA PhysicalIntakeForms Ques1"+" "+height+" "+weight+ " "+waist);
		

		home.verifyHRAPhysicalIntakeFormsQues2("option3");

		System.out.println("2-HRA PhysicalIntakeFormsQues2");
		
		

		home.verifyHRAPhysicalIntakeFormsQues3(options[0]);

		System.out.println("3-HRA PhysicalIntakeForms Ques3");
		
		

		home.verifyHRALifeStyleQuesSleep1(sleepHrs);

		System.out.println("4-HRALifeStyleQues Sleep1");
		
		

		home.verifyHRALifeStyleQuesSmoking2(options[1], noSmokes);

		System.out.println("5-HRA LifeStyleQues Smoking2");
		
		

		home.verifyHRALifeStyleQuesDrinking1(options[1], noDrinks);

		System.out.println("6-HRA LifeStyleQues Drinking1");
		
		

		home.verifyHRALifeStyleQuesStress(options[1]);

		System.out.println("7-HRA LifeStyleQues Stress1");
		
		

		home.verifyHRALifeStyleQuesHappiness(options[1]);

		System.out.println("8-HRA LifeStyle QuesHappiness1");
		

		home.verifyMedical(medQues[0], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[1], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[2], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[3], yesNoOption[1],yesNoOption[1]);

		home.verifyMedical(medQues[4], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[5], yesNoOption[1],yesNoOption[1]);

		home.verifyMedical(medQues[6], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[7], yesNoOption[1], yesNoOption[1]);

		System.out.println("9-HRA Medical");

		home.hraCompletionPage();
		

		System.out.println("10-HRA Completition");

		System.out.println("*******END***********");

	}

	
	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled = false)
	public void hraDoingVeryWellScenario() throws Exception {

		String height = "154";
		String weight = "40";
		String waist = "80";

		String[] options = { "option1", "option2", "option3", "option4", "option5" };

		String[] medQues = { "Med1", "Med2", "Med3", "Med4", "Med5", "Med6", "Med7", "Med8" };

		String[] yesNoOption = { "yes", "no" };
		
		String sleepHrs="2";
		
		String noSmokes="10";
		
		String noDrinks="10";

		home.verifyHRAPhysicalIntakeFormsQues1(height, weight, waist+" "+height+" "+weight+ " "+waist);

		System.out.println("1- HRAPhysicalIntakeForms Ques1");
		
		

		home.verifyHRAPhysicalIntakeFormsQues2("option3");

		System.out.println("2- HRA PhysicalIntakeFormsQues2");
		
		

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

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled = false)
	public void bestScenario() throws Exception {

		// Percentage 59 percentage = Keep an eye on it.

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

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled = false)
	public void bestScenario2() throws Exception {

		// Percentage 59 percentage = Keep an eye on it., option =2

		// home.calculateHealthScoreLink();

		// home.verifyHRAIntroductionPage();

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

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled = false)
	public void bestScenario3() throws Exception {

		// There’s room for improvement.
		// 34%, option =3

		// home.calculateHealthScoreLink();

		// home.verifyHRAIntroductionPage();

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

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled = false)
	public void bestScenario4() throws Exception {

		// There’s room for improvement.
		// 23%, option =3

		// home.calculateHealthScoreLink();

		// home.verifyHRAIntroductionPage();

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

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage", enabled = false)
	public void bestScenario5() throws Exception {

		// There’s room for improvement.
		// 27%, option =3

		// home.calculateHealthScoreLink();

		// home.verifyHRAIntroductionPage();

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