package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import eqcare.pages.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class HomeScenarios extends BaseClass {
	
	
	// Home Scenarios
	
	
	//thats it for now and more and more automated test cases i will create day by day.
	// Thanks you
	
	//PAssing to next person

	LoginPage login;
	HomePage home;
	ClinicPage clinic;

	@Test(priority = 1)
	public void loginToApplication() {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Login as patient");

		//login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare", 1, 0),

			//	DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		login.loginToApplication("sarikaqa7+nr1@gmail.com", "Sarika#123");

		logger.info("Logged in");
	}

	@Test(priority = 2, enabled = false)
	public void clinicApp() {

		clinic = PageFactory.initElements(driver1, ClinicPage.class);
		
		logger = report.createTest("Login as patient");

		clinic.loginToApplication("cm@eqcare.com", "secret");
		
		clinic.clickToPatient();
		
		logger.info("Logged in");

	}

	@Test(priority = 3, dependsOnMethods = "loginToApplication")
	public void startVideoConsultation() {

		home = PageFactory.initElements(driver, HomePage.class);
		
		logger = report.createTest("Patient Starts Video Consultation");
		
		logger.info("Patint logged and navigates to Home Page");

		home.navigateToHomePage();

		login.verifyUrlAfterLogin();
		
		logger.info("Validating Home Page Url");
		
		home.deviceCheck();
		
		logger.info("Patint device check completed");
		
		home.startVideoConsultation();
		
		logger.info("Patint starting video consultation");
		
		logger.info("Rating Provided");

		home.logOutFromApplication();

		logger.info("Logout done");

	}

}