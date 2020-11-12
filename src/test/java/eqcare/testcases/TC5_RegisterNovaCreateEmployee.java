package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.HomePage;
import nova.pages.BaseClass;

public class TC5_RegisterNovaCreateEmployee extends BaseClass {

	// Enrolled Patient Register dxtfffo EQ Carddde whose having coverage token

	LoginPage login;
	NovaHomePage home;

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

		logger.info("Care Manager Logged in");
	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void CreateEmployee() throws InterruptedException {

		home = PageFactory.initElements(driver, NovaHomePage.class);

		logger = report.createTest("Create Employee with coverage token");

		// home.createEmployer(); // First see if employer there

		home.createEmployee("25"); // then create employee

		// home.TestBrowser();

		logger.info("Employee created with coverage token");
	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication", enabled = false)
	public void logoutFromApplication() {
		logger = report.createTest("Logout");

		// home.startVideoConsultation();

		// home.logOutFromApplication();

		logger.info("Logout done");

	}

}