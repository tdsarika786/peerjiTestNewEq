package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ExtraNotRequiredClasses.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class TC6_HomeScenarios extends BaseClass {

	// Home Scenarios

	// thats it for now and more and more automated test cases i will create day by
	// day.
	// Thanks you

	// PAssing to next person

	LoginPage login;
	HomePage home;
	ClinicPage clinic;

	@Test(priority = 1)
	public void verifyPage() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Verify Home page Url");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		login.loginToApplication("sarikaqa7+a2@gmail.com", "Sarika#123");

		logger.info("Logged in as patient");

		home = PageFactory.initElements(driver, HomePage.class);

		logger.info("Patint logged and navigates to Home Page");

		home.navigateToHomePage();

		home.verifyUrl();

		logger.info("Validated Home Page Url");
	}

	@Test(priority = 2)
	public void verifyProfilePicPlaceholder() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Home - Verify profile pic place holder displays to user");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		home = PageFactory.initElements(driver, HomePage.class);

		logger.info("Patint logged and navigates to Home Page");

		home.verifyProfilePicPlacheHolder();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}

	@Test(priority = 3)
	public void verifyLanguageLink() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		logger = report.createTest("Verify langauge link on home page");

		// login.loginToApplication(DataProviderFactory.getExcel().getCellData("EQCare",
		// 1, 0),

		// DataProviderFactory.getExcel().getCellData("EQCare", 1, 1));

		home = PageFactory.initElements(driver, HomePage.class);

		logger.info("Patint logged and navigates to Home Page");

		home.validatelanguageLink();

		logger.info("Validated Profile pic placeholder displayed to patient");
	}

	@Test(priority = 2, enabled = false)
	public void clinicApp() {

		clinic = PageFactory.initElements(driver1, ClinicPage.class);

		logger = report.createTest("Login as patient");

		clinic.loginToApplication("cm@eqcare.com", "secret");

		clinic.clickToPatient();

		logger.info("Logged in");

	}

	@Test(priority = 4)
	public void verifyStartVideoConsultationLink() throws Exception {

		logger.info("Verify Start a Consultation link display to use");

		home.startVideoConsultationLink();

		logger.info("Validated Start a Consultation link displayed to patient");

	}

	@Test(priority = 5)
	public void verifyHomeFooter() throws Exception {

		logger.info("Verify Start a Consultation link display to use");

		home.verifyHomeFooter();

		logger.info("Validated Start a Consultation link displayed to patient");

	}
	
	@Test(priority = 6)
	public void verifyLogoutFromApplication() throws Exception {

		logger.info("Verify logged in user can logout");

		home.logOutFromApplication();

		logger.info("Validated logout from Application");

	}

}