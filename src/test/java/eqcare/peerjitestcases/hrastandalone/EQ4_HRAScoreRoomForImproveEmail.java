package eqcare.peerjitestcases.hrastandalone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ExtraNotRequiredClasses.ContactUsPage;
import eqcare.pages.HRAHomePageNew2;
import eqcare.pages.HomePage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class EQ4_HRAScoreRoomForImproveEmail extends BaseClass {

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

		login.loginToApplication("sarikaqa7+emp73@gmail.com", "Sarika#123");

		home = PageFactory.initElements(driver, HRAHomePageNew2.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		home.verifyUrl();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("***********************************************************");

		System.out.println("########## START EQ4_HRAScoreRoomForImproveEmail ######### sarikaqa7+emp73@gmail.com ");
		System.out.println("***********************************************************");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void verifyHRAIntroPage() throws Exception {

		home.calculateHealthScoreLink();

		home.verifyHRAIntroductionPage("false");
		
		System.out.println("*******HRA Introduction Page***********");

	}

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage")
	public void roomForImprovementScenario3() throws Exception {

		// There’s room for improvement.
		// 34%, option =3

		// home.calculateHealthScoreLink();

		// home.verifyHRAIntroductionPage();

		String height = "154";
		String weight = "100";
		String waist = "87";

		String[] options = { "option1", "option2", "option3", "option4", "option5" };

		String[] medQues = { "Med1", "Med2", "Med3", "Med4", "Med5", "Med6", "Med7", "Med8" };

		String[] yesNoOption = { "yes", "no" };

		String sleepHrs = "1";

		String noSmokes = "10";

		String noDrinks = "10";

		String scoreLabel = "There’s room for improvement.";

		System.out.println("Score Label should be ********HRA Room for improvement. **********");

		System.out.println("IN 1-HRA PhysicalIntakeForms Ques1" + " " + height + " " + weight + " " + waist);

		home.verifyHRAPhysicalIntakeFormsQues1(height, weight, waist);

		System.out.println("1-HRA PhysicalIntakeForms Ques1 done" + " " + height + " " + weight + " " + waist);

		home.verifyHRAPhysicalIntakeFormsQues2(options[2]);

		System.out.println("2- HRA PhysicalIntakeFormsQues2");

		home.verifyHRAPhysicalIntakeFormsQues3(options[2]);

		System.out.println("3- HRA PhysicalIntakeFormsQues3");

		home.verifyHRALifeStyleQuesSleep1(sleepHrs);

		System.out.println("4- HRA LifeStyleQuesSleep1");

		home.verifyHRALifeStyleQuesSmoking2(options[2], noSmokes);

		System.out.println("5- HRA LifeStyleQuesSmoking2");

		home.verifyHRALifeStyleQuesDrinking1(options[2], noDrinks);

		System.out.println("6- HAR LifeStyleQuesDrinking1");

		home.verifyHRALifeStyleQuesStress(options[2]);

		System.out.println("7- HRA LifeStyleQuesStress");

		home.verifyHRALifeStyleQuesHappiness(options[2]);

		System.out.println("8- HRA LifeStyleQuesHappiness");

		home.verifyMedical(medQues[0], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[1], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[2], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[3], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[4], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[5], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[6], yesNoOption[0], yesNoOption[0]);

		home.verifyMedical(medQues[7], yesNoOption[0], yesNoOption[0]);

		System.out.println("9- HRA Medical");

		home.hraCompletionPage(scoreLabel);

		System.out.println("10- HRA Completition Form");

	}

	@Parameters({ "Coverage" })
	@Test(priority = 4, dependsOnMethods = "roomForImprovementScenario3")
	public void verifyTalkToCare(String coverage) throws Exception {
		
		try {

		System.out.println("********EQ - HRA Form Complete View Score Modal In modal CLICK TALK TO CARE ADVOCATE");

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		home1 = PageFactory.initElements(driver, HomePage.class);

		home.talkToCare();

		// String coverage = "LJ";

		if (coverage.equalsIgnoreCase("EQ")) {

			System.out.println("Covergae Type " + coverage);

			home1.deviceCheckHRA();

			System.out.println("11-Device check page");

			intake.fillIntakeForm();

			System.out.println("12- Regular Fill Intake form");

		} else if (coverage.equalsIgnoreCase("LJ")) {

			System.out.println("Covergae Type " + coverage);

			intakeForm.startLifeJourneyTalkToCareMethod();
			
			
			//intakeForm.startLifeJourneyMethod();
			

			//intakeForm.hraLifeJourneyVisit();

			System.out.println("11-Life Journey Device check page");

			System.out.println("12- Life Journey Fill Intake form");

		}

		System.out.println("############### END EQ4_HRAScoreRoomForImproveEmail ############");

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