package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class Novapeerji2 extends BaseClass {

	LoginPage login;
	NovaHomePage home;

	@Test(priority = 0)
	public void verifyPage() throws Exception {

		logger = report.createTest("Staging Web Application Login URL validation");

		login = PageFactory.initElements(driver, LoginPage.class);

		login.verifyUrlBeforeLogin();

		logger.info("Validating url:  " + DataProviderFactory.getConfig().getValue("ponyEnv"));

	}

	// sarikaqa7ms1@outlook.com
	// ENV 1
	//sarikaqa7+b1@gmail.com  = Individual
	//sarikaqa7+c1@gmail.com  = Covered Single
	
	//ENV 2
    //sarikaqa7+i1@gmail.com
	
	@Parameters({"NovaEmail","NovaPassword"})
	@Test(priority = 0, dependsOnMethods = "verifyPage")
	public void loginToApplication(String novaemail, String novapassword) throws Exception {

		logger = report.createTest("Login as patient - Individual Paying Customer");

		//login.loginToApplication(DataProviderFactory.getExcel().getCellData("Login", 1, 0),
		//		DataProviderFactory.getExcel().getCellData("Login", 1, 1));

		//sarikaqa7+eqserstg1@gmail.com
		//login.loginToApplication("sarikaqa7+br1@gmail.com",
		//		"Sarika#123");
		
		login.loginToApplication(novaemail,
				novapassword);
		
		login.verifyUrlAfterLogin();

		logger.info("Patient Logged in");
	}
	
	@Parameters({"SearchEmployer","CoverageToken"})
	@Test(priority = 1, dependsOnMethods = "verifyPage", enabled=false)
	public void CreateEmployer(String searchemployer, String coveragetoken) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

		logger = report.createTest("Create Employee with coverage token");

		//home.createEmployer(searchemployer,coveragetoken); // First see if employer there Modify
		
		//home.TestBrowser();

		logger.info("Employee created with coverage token");
	}

	@Parameters({"SearchEmployer","CoverageIdentifier", "PlanType" })
	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void CreateEmployee(String searchemployer, String coverageidentifier, String plantype) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

		logger = report.createTest("Create Employee with coverage token");

		// home.createEmployer(); // First see if employer there Modify
		
		home.createEmployee(searchemployer,coverageidentifier,plantype); // then create employee 
		
		//home.TestBrowser();

		logger.info("Employee created with coverage token");
	}


}