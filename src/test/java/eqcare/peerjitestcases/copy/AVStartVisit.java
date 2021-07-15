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

public class AVStartVisit extends BaseClass {

	ClinicPage clinic, clinic1, clinic2, clinic3;
	LoginPage login;
	IntakeFormPageAV intake;
	HomePageAV home;

	// Patient Start Visit
	@Parameters({ "Email", "Password" })
	@Test(priority = 0)
	public void loginToPatientApplication(String email, String password) throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication(email, password);

		login.verifyUrlAfterLogin();

	}

	@Test(priority = 1, dependsOnMethods = "loginToApplication")
	public void startVideoConsultation() throws Exception {

		home = PageFactory.initElements(driver, HomePageAV.class);

		logger = report.createTest("Patient Starts Video Consultation");

		logger.info("Patint logged and navigates to Home Page");

		home.navigateToHomePage();

		logger.info("Validating Home Page Url");

	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void deviceCheck() throws Exception {

		home = PageFactory.initElements(driver, HomePageAV.class);

		logger = report.createTest("Patient performing Device Check");

		home.deviceCheck();

		logger.info("Patint device check completed test");

	}

	@Test(priority = 3, dependsOnMethods = "deviceCheck")
	public void fillIntakeFormWithAllFields() throws Exception {

		intake = PageFactory.initElements(driver, IntakeFormPageAV.class);

		logger = report.createTest("Patient filling Intake Form");

		intake.fillIntakeForm();

		logger.info("Patint device check completed");
	}

}