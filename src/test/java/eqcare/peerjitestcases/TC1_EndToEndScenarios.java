package eqcare.peerjitestcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
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

public class TC1_EndToEndScenarios extends BaseClass {

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

		//sarikaqa7+eqserstg1@gmail.com
		login.loginToApplication("sdhall@eqcare.com",
				"Sarika#123");
		
		login.verifyUrlAfterLogin();

		logger.info("Patient Logged in");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void editPersonalInformation() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Edits Profile - Personal Information ");

		account.navigateToProfilePage();

		logger.info("Patint logged in and navigates to Account Page");

		account.verifyUrlAfterLogin();

		logger.info("Patint editing user personal information");

		account.editUserPersonalInfo();

		logger.info("Patint saved user personal information");

	}

	@Test(priority = 3, dependsOnMethods = "verifyPage")
	public void editAccountInformation() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Edits Profile -  Account Information");

		logger.info("Patient editing user account information");

		account.editUserAccountInfo();

		logger.info("Patint saved user account information");

	}

	@Test(priority = 4, dependsOnMethods = "verifyPage")
	public void uploadProfilePic() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Uploads profile pic");

		logger.info("Patint logged and navigates to Account Page");

		logger.info("Patient uploading profile pic");

		account.uploadProfilePic();

		logger.info("Patint uploaded profile pic");

	}

	@Test(priority = 5, dependsOnMethods = "verifyPage")
	public void uploadGovernmentID() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Patient Uploads government ID");

		logger.info("Patient logged and navigates to Account Page");

		logger.info("Patient uploading government ID");

		account.uploadGovtID();

		logger.info("Patient uploaded Govt ID");

	}

	@Test(priority = 6, dependsOnMethods = "verifyPage")
	public void familyTab() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Verify Family Tab");

		logger.info("Patient logged and navigates to Family Tab");

		account.createFamily();

		logger.info("Create a family link validated");

	}

	@Test(priority = 7, dependsOnMethods = "verifyPage")
	public void addChild() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Verify Family Tab and Add Child");

		logger.info("Patient logged and navigates to Family Tab");

		logger.info("Patient adding a child");

		account.addChild();

		logger.info("Patient Added Child");

	}

	@Test(priority = 8, dependsOnMethods = "verifyPage")
	public void deleteChild() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		logger = report.createTest("Verify Family Tab and Delete Child");

		logger.info("Patient logged and navigates to Family Tab");

		logger.info("Patient deleting a child");

		account.deleteChild();

		logger.info("Patient Deleted Child");

	}

	@Test(priority = 9, dependsOnMethods = "loginToApplication")
	public void startVideoConsultation() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);

		logger = report.createTest("Patient Starts Video Consultation");

		logger.info("Patint logged and navigates to Home Page");

		home.navigateToHomePage();

		logger.info("Validating Home Page Url");

	}

	@Test(priority = 10, dependsOnMethods = "loginToApplication")
	public void deviceCheck() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);

		logger = report.createTest("Patient performing Device Check");

		home.deviceCheck();

		logger.info("Patint device check completed");

	}

	@Test(priority = 11, dependsOnMethods = "loginToApplication")
	public void fillIntakeFormWithAllFields() throws Exception {

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		logger = report.createTest("Patient filling Intake Form");

		intake.fillIntakeForm();

		logger.info("Patint device check completed");
	}

	@Test(priority = 12, dependsOnMethods = "loginToApplication")
	public void endVisit() throws Exception {

		visit = PageFactory.initElements(driver, VisitPage.class);

		logger = report.createTest("Patient end the Visit");

		visit.endCall();

		logger.info("Patint device check completed");
	}

	@Test(priority = 13, dependsOnMethods = "loginToApplication")
	public void feedback() throws Exception {

		feedback = PageFactory.initElements(driver, FeedbackPage.class);

		logger = report.createTest("Patient providing rating and feedback");

		feedback.ratingProvided();

		logger.info("Patient provided feeback");
	}

	@Test(priority = 14, dependsOnMethods = "loginToApplication")
	public void help() throws Exception {

		help = PageFactory.initElements(driver, HelpPage.class);

		logger = report.createTest("Patient navigating to Help Page");

		help.navigateToHelpPage();

		logger.info("Help Page Header verified");
	}

	@Test(priority = 14, dependsOnMethods = "loginToApplication")
	public void inbox() throws Exception {

		inbox = PageFactory.initElements(driver, InboxPage.class);

		logger = report.createTest("Patient navigating to Inbox Page");

		inbox.navigateToInboxPage();

		inbox.verifyMyInboxTabs();

		logger.info("Help Page Header verified");
	}

	@Test(priority = 14, dependsOnMethods = "loginToApplication", enabled = false)
	public void chooseProfile() throws Exception {

		inbox = PageFactory.initElements(driver, InboxPage.class);

		logger = report.createTest("Patient navigating to Help Page");

		inbox.navigateToInboxPage();

		inbox.verifyMyInboxTabs();

		logger.info("Help Page Header verified");
	}

}