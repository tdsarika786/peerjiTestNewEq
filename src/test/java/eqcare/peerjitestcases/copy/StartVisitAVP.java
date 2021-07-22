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
import eqcare.pages.LoginPageAV;
import eqcare.pages.copy.BaseClass;

public class StartVisitAVP extends BaseClass {

	ClinicPage clinic, clinic1, clinic2, clinic3;
	LoginPageAV login;
	IntakeFormPageAV intake;
	HomePageAV home;


	@Test(priority = 0)
	public void loginToApplication() throws Exception {

		login = PageFactory.initElements(driver, LoginPageAV.class);

		login.loginToApplication("sarikaqa7+avp@gmail.com", "Sarika#123");

		login.verifyUrlAfterLogin();

	}

	@Test(priority = 1, dependsOnMethods = "loginToApplication")
	public void startVideoConsultation() throws Exception {

		home = PageFactory.initElements(driver, HomePageAV.class);

		home.navigateToHomePage();

	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void deviceCheck() throws Exception {

		home = PageFactory.initElements(driver, HomePageAV.class);

		home.deviceCheck();

	}

	@Test(priority = 3, dependsOnMethods = "deviceCheck")
	public void fillIntakeFormWithAllFields() throws Exception {

		intake = PageFactory.initElements(driver, IntakeFormPageAV.class);

		intake.fillIntakeForm();

	}

}