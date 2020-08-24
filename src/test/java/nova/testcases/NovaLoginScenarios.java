package nova.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import nova.pages.LoginPage;

import eqcare.factories.DataProviderFactory;
import nova.pages.BaseClass;

public class NovaLoginScenarios extends BaseClass {

	LoginPage login;


	@Test(priority = 0)
	public void verifyPage() {

		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Login URL validation");

		login.verifyUrlBeforeLogin();

		logger.info("Validating url");

	}

	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void loginToApplication() throws InterruptedException {

		logger = report.createTest("Login to Nova application");

		login.loginToApplication(DataProviderFactory.getExcel().getCellData("Nova", 1, 0),

				DataProviderFactory.getExcel().getCellData("Nova", 1, 1));

		// login.loginToApplication("automationsaru@gmail.com", "Peerji#123");

		login.verifyUrlAfterLogin();

		logger.info("Patient Logged in");
	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication", enabled =false)
	public void logoutFromApplication() {
		logger = report.createTest("Logout");

		// home.startVideoConsultation();

		//home.logOutFromApplication();

		logger.info("Logout done");

	}

}