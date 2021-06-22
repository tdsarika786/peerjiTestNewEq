package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class Novapeerji1733 extends BaseClass {

	LoginPage login;
	NovaHomePage home;
	
	//testpeerji

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
		
		String searchemployer1 ="Sarika-Test-LJ70";
		String groupNo ="70";

        home.createEmployer1733(searchemployer1,null,null); 
		
		home.createCoverage1797(searchemployer1,null, "lifejourney");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
		
		home.createEmployee(searchemployer1,"anu","family");
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 2, dependsOnMethods = "loginToApplication", enabled=false)
	public void CreateEmployer1(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-PC71";
		String groupNo ="71";

        home.createEmployer1733(searchemployer1,null,null); 
		
    	home.createCoverage1797(searchemployer1,null, "primary_care");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
		
		home.createEmployee(searchemployer1,"anu","family");
	}

	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 2, dependsOnMethods = "loginToApplication", enabled=false)
	public void CreateEmployer2(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-PCLJ72";
		String groupNo ="72";

        home.createEmployer1733(searchemployer1,null,null); 
		
	    home.createCoverage1797(searchemployer1,null, "primary_care");
		
		home.createCoverageUpdate1797(searchemployer1,null, "lifejourney");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
		
		home.createEmployee(searchemployer1,"anu","family");
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 2, dependsOnMethods = "loginToApplication", enabled=false)
	public void CreateEmployer3(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-PCLJ73";
		String groupNo ="73";

        home.createEmployer1733(searchemployer1,null,null); 
		
		home.createCoverage1797(searchemployer1,null, "lifejourney");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
		
		home.createEmployee(searchemployer1,"anu3","single");
	}
	
	@Parameters({"SearchEmployer","CoverageIdentifier", "PlanType"})
	@Test(priority = 3, dependsOnMethods = "loginToApplication" , enabled=false)
	public void CreateEmployee(String searchemployer, String coverageidentifier, String plantype) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		home.createGroupNo("70","Sarika-Test-PC-LJ"); // then create employee 
		
	}
	
	
}