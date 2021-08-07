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

public class StartVisitHRAWellScore extends BaseClass {

	ClinicPage clinic, clinic1, clinic2, clinic3;
	LoginPage login;
	IntakeFormPage intake;
	HomePage home;

	// Patient Start Visit
	@Parameters({ "Email", "Password" })
	@Test(priority = 0)
	public void loginToApplication(String email, String password) throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication("sarikaqa7+emp70@gmail.com", "Sarika#123");

		login.verifyUrlAfterLogin();
		
		System.out.println("*************START VISIT StartVisitHRAWellScore ******************** "+email);

	}

	@Test(priority = 1, dependsOnMethods = "loginToApplication")
	public void startVideoConsultation() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);

		home.navigateToHomePage();
		
		System.out.println("************* 1-start Video ConsultationT ********************");

	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void deviceCheck() throws Exception {

		home = PageFactory.initElements(driver, HomePage.class);
		
		home.hraCompleteLater();

		home.deviceCheck();
		
		System.out.println("************* 2-device Check ********************");

	}

	@Test(priority = 3, dependsOnMethods = "deviceCheck")
	public void fillIntakeFormWithAllFields() throws Exception {

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		intake.fillIntakeForm();
		
		System.out.println("************* 3-device Check ********************");

		System.out.println("*************END ********************");
	}
}