package eqcare.peerjitestcases.copy1;


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
	public void CreateEmployer1(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-LJ70";
		String coveragetoken1 ="70";

        home.createEmployerNew1797(searchemployer1,coveragetoken1,null); 
		
		home.createCoverage1797(searchemployer1,null, "lifejourney");
		
		home.createService1797(searchemployer1,null,null);
		
		home.createEmployee(searchemployer1,"anu","family");
		
	}

	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 3, dependsOnMethods = "loginToApplication")
	public void CreateEmployer2(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-PC71";
		String coveragetoken1 ="71";

		home.createEmployerNew1797(searchemployer1,coveragetoken1,null); 
		
		home.createCoverage1797(searchemployer1,null, "primary_care");
		
		home.createService1797(searchemployer1,null,null);
		
		home.createEmployee(searchemployer1,"anu1","family");
		
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 4, dependsOnMethods = "loginToApplication")
	public void CreateEmployerCoverageUpdate(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-PCLJ72";
		String coveragetoken1 ="72";

		home.createEmployerNew1797(searchemployer1,coveragetoken1,null); 
		
		home.createCoverage1797(searchemployer1,null, "primary_care");
		
		home.createCoverageUpdate1797(searchemployer1,null, "lifejourney");
		
		home.createService1797(searchemployer1,null,null);
		
		home.createEmployee(searchemployer1,"anu2","family");
		
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 5, dependsOnMethods = "loginToApplication")
	public void CreateEmployer3(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-PCLJ73";
		String coveragetoken1 ="73";

		home.createEmployerNew1797(searchemployer1,coveragetoken1,null); 
		
		home.createCoverage1797(searchemployer1,null, "lifejourney");
		
		home.createService1797(searchemployer1,null,null);
		
		home.createEmployee(searchemployer1,"anu3","single");
		
	}
	
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 2, dependsOnMethods = "loginToApplication", enabled=false)
	public void CreateEmployerService(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

		//home.createEmployerNew1797("Sarika-Test-PC-LJ5","75", "primary_care_with_lifejourney"); // First see if employer there Modify
		
		//home.createCoverage1797("Sarika-Test-PC-LJ3","7", "primary_care_with_lifejourney");
		
		home.createService1797("Sarika-Test-PC-LJ70","70", "primary_care_with_lifejourney");
		
	}
	
	@Parameters({"SearchEmployer","CoverageIdentifier", "PlanType" })
	@Test(priority = 3, dependsOnMethods = "loginToApplication", enabled=false)
	public void CreateEmployee1(String searchemployer, String coverageidentifier, String plantype) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		home.createEmployee("Sarika-Test-PC-LJ70","anu1","family"); // then create employee 
		
	}
	
	
	
	
	
}