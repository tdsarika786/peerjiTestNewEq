package eqcare.peerjitestcases.copy1;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class Novapeerji extends BaseClass {

	LoginPage login;
	NovaHomePage home;
	
	//test

	@Test(priority = 0)
	public void verifyPage() throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		login.verifyUrlBeforeLogin();

	}
	
	@Parameters({"NovaEmail","NovaPassword"})
	@Test(priority = 0, dependsOnMethods = "verifyPage")
	public void loginToApplication(String novaemail, String novapassword) throws Exception {
		
		login.loginToApplication(novaemail,
				novapassword);
		
		login.verifyUrlAfterLogin();

	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 1, dependsOnMethods = "loginToApplication")
	public void CreateEmployer(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

		home.createEmployer("Sarika-Test-PC-LJ","70", "primary_care_with_lifejourney"); // First see if employer there Modify
		
	}

	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void CreateEmployer1(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

		home.createEmployer("Sarika-Test-LJ","71", "lifejourney_standalone"); // First see if employer there Modify
		
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 3, dependsOnMethods = "loginToApplication")
	public void CreateEmployer2(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

		home.createEmployer("Sarika-Test-PC","72", "primary_care"); // First see if employer there Modify
		
	}
	
	@Parameters({"SearchEmployer","CoverageIdentifier", "PlanType" })
	@Test(priority = 4, dependsOnMethods = "loginToApplication")
	public void CreateEmployee(String searchemployer, String coverageidentifier, String plantype) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		home.createEmployee("Sarika-Test-PC-LJ","anu","family"); // then create employee 
		
	}
	
	@Parameters({"SearchEmployer","CoverageIdentifier", "PlanType" })
	@Test(priority = 4, dependsOnMethods = "loginToApplication")
	public void CreateEmployee1(String searchemployer, String coverageidentifier, String plantype) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		home.createEmployee("Sarika-Test-LJ","anu1","single"); // then create employee 
		
	}
	
	@Parameters({"SearchEmployer","CoverageIdentifier", "PlanType" })
	@Test(priority = 4, dependsOnMethods = "loginToApplication")
	public void CreateEmployee2(String searchemployer, String coverageidentifier, String plantype) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		home.createEmployee("Sarika-Test-PC","anu2","family"); // then create employee 
		
	}
	
	
	
}