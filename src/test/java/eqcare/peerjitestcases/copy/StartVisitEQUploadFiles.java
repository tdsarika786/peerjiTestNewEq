package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import eqcare.helper.Utility;
import eqcare.pages.ClinicPage;
import eqcare.pages.HomePage;
import eqcare.pages.HomePageAV;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.IntakeFormPageAV;
import eqcare.pages.LoginPage;
import eqcare.pages.copy.BaseClass;

public class StartVisitEQUploadFiles extends BaseClass {

	ClinicPage clinic, clinic1, clinic2, clinic3;
	LoginPage login;
	IntakeFormPage intake;
	HomePage home;

	// Patient Start Visit
	@Parameters({ "Email", "Password" })
	@Test(priority = 0)
	public void loginToApplication(String email, String password) throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication(email, password);

		login.verifyUrlAfterLogin();

	}

	@Test(priority = 1, dependsOnMethods = "loginToApplication")
	public void startVideoConsultation() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);

		home.navigateToHomePage();

	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void deviceCheck() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);

		home.deviceCheck();

	}

	@Test(priority = 3, dependsOnMethods = "deviceCheck")
	public void fillIntakeFormWithAllFields() throws Exception {

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		intake.fillIntakeForm1("1sample.pdf");
		
		intake.fillIntakeForm1("2test1.jpeg");
		
		intake.fillIntakeForm1("3Testfilebmp.bmp");
		
		intake.fillIntakeForm1("4Testfilegif.gif");
		
		intake.fillIntakeForm1("5Testfilejpg.jpg");
		
		intake.fillIntakeForm1("6Testfilepng.png");	

		intake.fillIntakeForm1("7Testfilewebp.webp");
	}
}