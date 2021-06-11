package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class Novapeerji1797 extends BaseClass {

	LoginPage login;
	NovaHomePage home;
	
	//test

	@Test(priority = 0)
	public void verifyPage() throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		login.verifyUrlBeforeLogin();

	}
	
	@Parameters({"NovaEmail","NovaPassword"})
	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void loginToApplication(String novaemail, String novapassword) throws Exception {
		
		login.loginToApplication(novaemail,
				novapassword);
		
		login.verifyUrlAfterLogin();

	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void CreateEmployer(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

		home.createEmployerNew1797("Sarika-Test-PC-LJ","70", "primary_care_with_lifejourney"); // First see if employer there Modify
		
		home.createCoverage1797("Sarika-Test-PC-LJ","70", "primary_care_with_lifejourney");
		
		home.createService1797("Sarika-Test-PC-LJ","70", "primary_care_with_lifejourney");
		
	}

	
	
	
	
	
}