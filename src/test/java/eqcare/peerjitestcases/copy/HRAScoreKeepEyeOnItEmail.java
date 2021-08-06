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

public class HRAScoreKeepEyeOnItEmail extends BaseClass {

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

		System.out.println("*******HRA Introduction Page***********");

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

		String sleepHrs = "2";

		String noSmokes = "10";

		String noDrinks = "10";

		String scoreLabel = "Keep an eye on it.";
		
		System.out.println("********HRA Keep Eye On It Scenario**********");

		home.verifyHRAPhysicalIntakeFormsQues1(height, weight, waist);

		System.out.println("1-HRA PhysicalIntakeForms Ques1" + " " + height + " " + weight + " " + waist);

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

		home.verifyMedical(medQues[7], yesNoOption[0], yesNoOption[0]);

		System.out.println("9- HRA Medical");

		home.hraCompletionPage(scoreLabel);

		System.out.println("10- HRA Completition");

		System.out.println("*******END***********");

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

}