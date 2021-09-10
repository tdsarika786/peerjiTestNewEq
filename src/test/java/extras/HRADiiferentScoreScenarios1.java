package extras;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;

import eqcare.pages.HRAHomePageNew2;
import eqcare.pages.HomePage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class HRADiiferentScoreScenarios1 extends BaseClass {

	LoginPage login;
	HRAHomePageNew2 home;
	LifeJourneyIntakeFormPage intakeForm;
	ClinicPage clinic;
	HomePage home1;
	IntakeFormPage intake;

	@Parameters({ "Email", "Password" })
	@Test(priority = 1)
	public void verifyPage(String email, String password) throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication(email, password);

		home = PageFactory.initElements(driver, HRAHomePageNew2.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		home.verifyUrl();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("***********************************************************");

		System.out.println("########## START HRADiiferentScoreScenarios1 ########## " + email);
		
		System.out.println("***********************************************************");

	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void verifyHRAIntroPage() throws Exception {

		home.calculateHealthScoreLink();

		//home.verifyHRAIntroductionPage();

		System.out.println("*******HRA Introduction Page***********");

	}

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage")
	public void hraDoingVeryWellScenario() throws Exception {

		String height = "150";
		String weight = "100";
		String waist = "100";

		String[] options = { "option1", "option2", "option3", "option4", "option5" };

		String[] medQues = { "Med1", "Med2", "Med3", "Med4", "Med5", "Med6", "Med7", "Med8" };

		String[] yesNoOption = { "yes", "no" };

		String sleepHrs = "7";

		String noSmokes = "7";

		String noDrinks = "7";

		//String scoreLabel = "You’re doing very well.";

		System.out.println("Score Label should be ******** HRA Doing Very Well Scenario**********");

		home.verifyHRAPhysicalIntakeFormsQues1(height, weight, waist);

		System.out.println("1-HRA PhysicalIntakeForms Ques1" + " " + height + " " + weight + " " + waist);

		home.verifyHRAPhysicalIntakeFormsQues2(options[1]);

		System.out.println("2- HRA PhysicalIntakeFormsQues2");

		home.verifyHRAPhysicalIntakeFormsQues3(options[1]);

		System.out.println("3- HRA PhysicalIntakeFormsQues3");

		home.verifyHRALifeStyleQuesSleep1(sleepHrs);

		System.out.println("4- HRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2(options[1], noSmokes);

		System.out.println("5- HRA LifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1(options[1], noDrinks);

		System.out.println("6- HRA LifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress(options[1]);

		System.out.println("7- HRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness(options[1]);

		System.out.println("8- HRA LifeStyleQuesHappiness");

		home.verifyMedical(medQues[0], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[1], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[2], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[3], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[4], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[5], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[6], yesNoOption[0], yesNoOption[1]);

		home.verifyMedical(medQues[7], yesNoOption[0], yesNoOption[1]);

		System.out.println("9- HRA Medical");

		home.hraCompletionPage();

		System.out.println("10-HRA Completition");

		System.out.println("");
		System.out.println("");


	}

	
}