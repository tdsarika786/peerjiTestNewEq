package ExtraAutomatedTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ExtraNotRequiredClasses.ContactUsPage;
import eqcare.pages.FeedbackPage;
import eqcare.pages.HelpPage;
import eqcare.pages.HomePage;
import eqcare.pages.InboxPage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.RegistrationPage;
import eqcare.pages.VisitPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.AccountPage;
import eqcare.pages.Base;
import eqcare.pages.BaseClass;

public class TC1_PatientToClinicCall extends BaseClass {

	LoginPage login;
	HomePage home;
	AccountPage account;
	IntakeFormPage intake;
	VisitPage visit;
	FeedbackPage feedback;
	HelpPage help;
	InboxPage inbox;
	RegistrationPage register;

	@Test(priority = 0)
	public void verifyPage() throws Exception {

		logger = report.createTest("Staging Web Application Login URL validation");

		login = PageFactory.initElements(driver, LoginPage.class);

		login.verifyUrlBeforeLogin();

		logger.info("Validating url:  " + DataProviderFactory.getConfig().getValue("ponyEnv"));

	}

	// sarikaqa7ms1@outlook.com
	// ENV 1
	//sarikaqa7+b1@gmail.com  = Individual
	//sarikaqa7+c1@gmail.com  = Covered Single
	
	//ENV 2
    //sarikaqa7+i1@gmail.com
	
	
	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void loginToApplication() throws Exception {

		logger = report.createTest("Login as patient - Individual Paying Customer");

		//login.loginToApplication(DataProviderFactory.getExcel().getCellData("Login", 1, 0),
		//		DataProviderFactory.getExcel().getCellData("Login", 1, 1));

		
		//Access Virtual
		//login.loginToApplication("sarikaqa7+accvir1@gmail.com",
		//			"Sarika#123");

		
		//Pony
		//sarikaqa7+ponystage2@gmail.com
		//sarikaqa7+eqserqa1@gmail.com
		//sarikaqa7+envqa1nen@gmail.com - QA1
		//sarikaqa7+ljn1@gmail.com
		login.loginToApplication("sarikaqa7+envqa1en1@gmail.com",
				"Sarika#123");
		
		login.verifyUrlAfterLogin();

		logger.info("Patient Logged in");
	}

	
	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void startVideoConsultation() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);

		logger = report.createTest("Patient Starts Video Consultation");

		logger.info("Patint logged and navigates to Home Page");

		home.navigateToHomePage();

		logger.info("Validating Home Page Url");

	}

	@Test(priority = 3, dependsOnMethods = "loginToApplication")
	public void deviceCheck() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);

		logger = report.createTest("Patient performing Device Check");

		home.deviceCheck();

		logger.info("Patint device check completed");

	}

	@Test(priority = 4, dependsOnMethods = "loginToApplication")
	public void fillIntakeFormWithAllFields() throws Exception {

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		logger = report.createTest("Patient filling Intake Form");

		intake.fillIntakeForm();

		logger.info("Patint device check completed");
	}

	@Test(priority = 5, dependsOnMethods = "loginToApplication")
	public void endVisit() throws Exception {

		visit = PageFactory.initElements(driver, VisitPage.class);

		logger = report.createTest("Patient end the Visit");

		//visit.endCall();

		logger.info("Patint device check completed");
	}

	
}