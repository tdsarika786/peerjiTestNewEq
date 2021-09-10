package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ExtraNotRequiredClasses.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class Peerjitc extends BaseClass{
	
	//  2. Patient login to the application to EQ Care

	LoginPage login;
	HomePage home;

	@Test(priority = 0)
	public void verifyPage() throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		home = PageFactory.initElements(driver, HomePage.class);

		logger = report.createTest("Pony Web Application Login URL validation");

		login.verifyUrlBeforeLogin();

		logger.info("Validating url");
		
		//login.peerji();
		
		//login.runTestResults("29754173");

	}

	

}