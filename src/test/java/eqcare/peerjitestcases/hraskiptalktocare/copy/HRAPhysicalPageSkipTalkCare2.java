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

public class HRAPhysicalPageSkipTalkCare2 extends BaseClass {

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

		//login.loginToApplication("sarikaqa7+emp71@gmail.com", "Sarika#123");
		
		login.loginToApplication("sarikaqa7+anuemp2@gmail.com", "Sarika#123");

		home = PageFactory.initElements(driver, HRAHomePageNew2.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		home.verifyUrl();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("***********************************************************");

		System.out.println("########## START HRAPhysicalPageTalkCare2 ########## " + "sarikaqa7+anuemp2@gmail.com");
		
		System.out.println("***********************************************************");

	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void verifyHRAPhysicalPage() throws Exception {

		home.calculateHealthScoreLink();

		home.verifyHRAIntroductionPage();

		System.out.println("*******HRA Introduction Page***********");
		
		System.out.println("IN 1-HRA PhysicalIntakeForms Ques1" + " " + "100" + " " + "450" + " " + "100");

		home.verifyHRAPhysicalIntakeFormsQues1("100", "450", "100");

		System.out.println("*******HRA Physical Page Talk Care***********");
		
		home.talkToCare();

	}

	

	@Parameters({ "Coverage" })
	@Test(priority = 4, dependsOnMethods = "verifyHRAPhysicalPage")
	public void verifyTalkToCare(String coverage) throws Exception {
		
		try {

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

			//intakeForm.deviceCheck();
			
			intakeForm.skipTalkToCareCTA();

			System.out.println("11-Life Journey Device check page");

			//intakeForm.hraLifeJourneyVisit();

			System.out.println("12- Life Journey Fill Intake form");
		}

		System.out.println("######### END HRAPhysicalPageSkipTalkCare2 ###########");

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