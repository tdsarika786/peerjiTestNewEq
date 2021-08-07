package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
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
import eqcare.pages.copy.BaseClass;

public class TC3_EndToEndScenarios extends BaseClass {

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

		login = PageFactory.initElements(driver, LoginPage.class);

		login.verifyUrlBeforeLogin();
		
		

	}
	
	@Parameters({"Email","Password"})
	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void loginToApplication(String email, String password) throws Exception {

		login.loginToApplication(email,
				password);
		
		login.verifyUrlAfterLogin();
		
		System.out.println("************* START  EndToEndScenarios ************************** "+email);
	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void editPersonalInformation() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		account.navigateToProfilePage();

		account.verifyUrlAfterLogin();

		account.editUserPersonalInfo();
		
		System.out.println("************* 1- Edit Personal Information  ************************** ");

	}

	@Test(priority = 3, dependsOnMethods = "loginToApplication")
	public void editAccountInformation() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		account.editUserAccountInfo();
		
		System.out.println("************* 2- Edit Account Information  ************************** ");

	}

	@Test(priority = 4, dependsOnMethods = "loginToApplication")
	public void uploadProfilePic() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		account.uploadProfilePic();
		
		System.out.println("************* 3- Upload Profile Pic  ************************** ");
		
	}

	@Test(priority = 5, dependsOnMethods = "loginToApplication")
	public void uploadGovernmentID() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		account.uploadGovtID();
		
		System.out.println("************* 4- Upload GOVt ID ************************** ");

	}

	@Test(priority = 6, dependsOnMethods = "loginToApplication")
	public void familyTab() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		account.createFamily();
		
		System.out.println("************* 5- Creat family ************************** ");

	}

	@Test(priority = 7, dependsOnMethods = "familyTab")
	public void addChild() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		account.addChild();
		
		System.out.println("************* 6- Add Child ************************** ");

	}

	@Test(priority = 8, dependsOnMethods = "familyTab")
	public void deleteChild() throws Exception {

		account = PageFactory.initElements(driver, AccountPage.class);

		account.deleteChild();
		
		System.out.println("************* 7- Delete Child ************************** ");

	}
/*
	@Test(priority = 9, dependsOnMethods = "loginToApplication")
	public void startVideoConsultation() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);

		home.navigateToHomePage();

	}

	@Test(priority = 10, dependsOnMethods = "loginToApplication")
	public void deviceCheck() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);

		home.deviceCheck();

	}

	@Test(priority = 11, dependsOnMethods = "deviceCheck")
	public void fillIntakeFormWithAllFields() throws Exception {

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		intake.fillIntakeForm();
	}

	@Test(priority = 12, dependsOnMethods = "deviceCheck")
	public void endVisit() throws Exception {

		visit = PageFactory.initElements(driver, VisitPage.class);

		visit.endCall();
	}

	@Test(priority = 13, dependsOnMethods = "deviceCheck")
	public void feedback() throws Exception {

		feedback = PageFactory.initElements(driver, FeedbackPage.class);

		feedback.ratingProvided();

	}

	@Test(priority = 14, dependsOnMethods = "loginToApplication")
	public void help() throws Exception {

		help = PageFactory.initElements(driver, HelpPage.class);

		help.navigateToHelpPage();
	}

	@Test(priority = 14, dependsOnMethods = "loginToApplication")
	public void inbox() throws Exception {

		inbox = PageFactory.initElements(driver, InboxPage.class);

		inbox.navigateToInboxPage();

		inbox.verifyMyInboxTabs();

	}

	@Test(priority = 14, dependsOnMethods = "loginToApplication", enabled = false)
	public void chooseProfile() throws Exception {

		inbox = PageFactory.initElements(driver, InboxPage.class);

		//logger = report.createTest("Patient navigating to Help Page");

		inbox.navigateToInboxPage();

		inbox.verifyMyInboxTabs();

		//logger.info("Help Page Header verified");
	}
*/
}