package ExtraNotRequiredClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.Base;
import eqcare.pages.BaseClass;

public class LoginScenariosTC extends Base {

	LoginPage login;
	HomePage home;

	@Test(priority = 0)
	public void verifyPage1() {

		login = PageFactory.initElements(driver, LoginPage.class);

		home = PageFactory.initElements(driver, HomePage.class);


		//login.verifyUrlAfterLogin();


	}

	@Test(priority = 1, dependsOnMethods = "verifyPage", enabled=false)
	public void loginToApplication() {

		logger = report.createTest("Login as patient not enrolled");

		login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare", 1, 0),

				DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		// login.loginToApplication("automationsaru@gmail.com", "Peerji#123");

		//login.verifyUrlAfterLogin();

		logger.info("Patient Logged in");
	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication", enabled=false)
	public void logoutFromApplication() throws Exception {
		logger = report.createTest("Logout");

		// home.startVideoConsultation();

		home.logOutFromApplication();

		logger.info("Logout done");

	}

}