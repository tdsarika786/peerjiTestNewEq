package eqcare.peerjitestcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class Novapeerji3 extends BaseClass {

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
	
	@Test(priority = 1, dependsOnMethods = "loginToApplication")
	public void AddStaff() throws InterruptedException {

		home = PageFactory.initElements(driver, NovaHomePage.class);

		logger = report.createTest("Create Employee with coverage token");
		
		home.addStaff("sarikacm@gmail.com","secret","CareManager");

		home.addStaff("sarikado@gmail.com","secret","Practitioner");
		
		home.addStaff("sarikanu@gmail.com","secret","Nurse");

		logger.info("Employee created with coverage token");
	}


}