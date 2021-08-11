package eqcare.peerjitestcases.hraskiptalktocare.copy;

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

public class HRAScoreDoingVeryWelllSkipToTalk extends BaseClass {

	LoginPage login;
	HRAHomePageNew2 home;
	LifeJourneyIntakeFormPage intakeForm;
	ClinicPage clinic;
	IntakeFormPage intake;
	HomePage home1;

	@Parameters({ "Email", "Password" })
	@Test(priority = 1)
	public void verifyPage(String email, String password) throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication("sarikaqa7+emp70@gmail.com", "Sarika#123");

		home = PageFactory.initElements(driver, HRAHomePageNew2.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		home.verifyUrl();
		
		System.out.println("");
		System.out.println("");
		
	System.out.println("***********************************************************");
		
		

		System.out
				.println("############# START HRAScoreDoingVeryWelllSkipToTalk ############### sarikaqa7+emp70@gmail.com");
		System.out.println("***********************************************************");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void verifyHRAIntroPage() throws Exception {

		home.calculateHealthScoreLink();

		home.verifyHRAIntroductionPage();

		System.out.println("*******HRA Introduction Page***********");

	}

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage")
	public void hraDoingVeryWellScenario() throws Exception {

		String height = "250";
		String weight = "125";
		String waist = "87";

		String[] options = { "option1", "option2", "option3", "option4", "option5" };

		String[] medQues = { "Med1", "Med2", "Med3", "Med4", "Med5", "Med6", "Med7", "Med8" };

		String[] yesNoOption = { "yes", "no" };

		String sleepHrs = "9";

		String noSmokes = "10";

		String noDrinks = "10";

		String scoreLabel = "You’re doing very well.";

		System.out.println("Score Label should be ********HRA Doing Very Well Scenario**********");

		System.out.println("IN 1-HRA PhysicalIntakeForms Ques1" + " " + height + " " + weight + " " + waist);

		home.verifyHRAPhysicalIntakeFormsQues1(height, weight, waist);

		System.out.println("1-HRA PhysicalIntakeForms Ques1 done" + " " + height + " " + weight + " " + waist);

		home.verifyHRAPhysicalIntakeFormsQues2(options[0]);

		System.out.println("2- HRA PhysicalIntakeFormsQues2");

		home.verifyHRAPhysicalIntakeFormsQues3(options[0]);

		System.out.println("3- HRA PhysicalIntakeFormsQues3");

		home.verifyHRALifeStyleQuesSleep1(sleepHrs);

		System.out.println("4- HRALifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2(options[0], null);

		System.out.println("5- HRA LifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1(options[0], null);

		System.out.println("6- HRA LifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress(options[0]);

		System.out.println("7- HRALifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness(options[0]);

		System.out.println("8- HRA LifeStyleQuesHappiness");

		home.verifyMedical(medQues[0], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[1], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[2], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[3], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[4], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[5], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[6], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[7], yesNoOption[1], yesNoOption[1]);

		System.out.println("9- HRA Medical");

		home.hraCompletionPage(scoreLabel);

		System.out.println("10- HRA Completition");

		home.scoreModalClose();

		System.out.println("11 - Score pop up close");

	}

	@Parameters({ "Coverage" })
	@Test(priority = 4, dependsOnMethods = "hraDoingVeryWellScenario")
	public void verifyTalkToCare(String coverage) throws Exception {
		
		try {

		System.out.println("// ****************** EQ 1 Talk To Care from Home Page **************************** //");

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		home1 = PageFactory.initElements(driver, HomePage.class);

		if (coverage.equalsIgnoreCase("EQ")) {

			System.out.println("Covergae Type " + coverage);
			
			home.deviceCheck();
			
			intakeForm.startLifeJourneyMethod();
			
			System.out.println("12- Regular Fill Intake form");
		}

		else if (coverage.equalsIgnoreCase("LJ")) {
			System.out.println("Covergae Type " + coverage);

			//intakeForm.deviceCheck();
			
			intakeForm.skipTalkToCareCTA();

			System.out.println("11-Life Journey Device check page");

			//intakeForm.hraLifeJourneyVisit();

			System.out.println("12- Life Journey Fill Intake form");
		}

		System.out.println("############# END HRAScoreDoingVeryWelllSkipToTalk #########");
		
		System.out.println("***********************************************************");
		
		System.out.println("***********************************************************");

		System.out.println("");
		System.out.println("");
		
		}
		
		catch(Exception ex) {
			System.out.println("******************** FAILED ***************************************");
			
			System.out.println("");
			System.out.println("");
			
			throw ex;
		}

		
	}

	

}