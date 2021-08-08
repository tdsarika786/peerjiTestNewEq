package eqcare.peerjitestcases.copy;

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

public class EQ2_HRAScoreKeepItUpEmail extends BaseClass {

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

		login.loginToApplication("sarikaqa7+emp71@gmail.com", "Sarika#123");

		home = PageFactory.initElements(driver, HRAHomePageNew2.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		home.verifyUrl();
		
		System.out.println("");
		System.out.println("");

		System.out.println("***********************************************************");

		System.out.println("######### START HRAScoreKeepItUp_EQ2 ######## sarikaqa7+emp71@gmail.com ");
		System.out.println("***********************************************************");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void verifyHRAIntroPage() throws Exception {

		home.calculateHealthScoreLink();

		home.verifyHRAIntroductionPage();

		System.out.println("*******HRA Introduction Page***********");

	}

	@Test(priority = 3, dependsOnMethods = "verifyHRAIntroPage")
	public void hraKeepItUpScenario() throws Exception {

		// Keep it up.
		// 72%

		String height = "154";
		String weight = "40";
		String waist = "80";

		String[] options = { "option1", "option2", "option3", "option4", "option5" };

		String[] medQues = { "Med1", "Med2", "Med3", "Med4", "Med5", "Med6", "Med7", "Med8" };

		String[] yesNoOption = { "yes", "no" };

		String sleepHrs = "2";

		String noSmokes = "10";

		String noDrinks = "10";

		String scoreLabel = "Keep it up.";

		System.out.println("Score Label should be ********HRA Keep It Up **********");

		home.verifyHRAPhysicalIntakeFormsQues1(height, weight, waist);

		System.out.println("1-HRA PhysicalIntakeForms Ques1" + " " + height + " " + weight + " " + waist);

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

		home.verifyMedical(medQues[3], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[4], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[5], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[6], yesNoOption[1], yesNoOption[1]);

		home.verifyMedical(medQues[7], yesNoOption[1], yesNoOption[1]);

		System.out.println("9-HRA Medical");

		home.hraCompletionPageAndTalkToCare();

		System.out.println("10-HRA Completition Form");

	}

	@Parameters({ "Coverage" })
	@Test(priority = 4, dependsOnMethods = "hraKeepItUpScenario")
	public void verifyTalkToCare(String coverage) throws Exception {

		System.out.println(
				"************* EQ2 - HRA Form Complete IN Thank you page Talk to Care Advocate ********************");

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		home1 = PageFactory.initElements(driver, HomePage.class);

		// String coverage = "LJ";

		if (coverage.equalsIgnoreCase("EQ")) {

			System.out.println("Covergae Type " + coverage);

			// home.hraCompletionPageAndTalkToCare();

			home1.deviceCheckHRA();

			System.out.println("11-Device check page");

			intake.fillIntakeForm();

			System.out.println("12- Regular Fill Intake form");

		}

		else if (coverage.equalsIgnoreCase("LJ")) {

			System.out.println("Covergae Type " + coverage);

			intakeForm.deviceCheck();

			System.out.println("11-Life Journey Device check page");

			intakeForm.hraLifeJourneyVisit();

			System.out.println("12- Life Journey Fill Intake form");

		}

		System.out.println("######### END EQ2_HRAScoreKeepItUpEmail ###########");

		System.out.println("***********************************************************");

		System.out.println("***********************************************************");

	}

}