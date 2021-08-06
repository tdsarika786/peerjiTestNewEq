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
		
		String searchemployer1 ="Sarika-Test-NewLJ1";
		String groupNo ="LJ1";
		String empID ="700";

        home.createEmployer1733(searchemployer1,empID,null); 
		
		home.createCoverage1797(searchemployer1,null, "lifejourney");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
		
		home.createEmployee(searchemployer1,"anu","family");
		
		System.out.println("*********1 Sarika-Test-NewLJ1***********");
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 3, dependsOnMethods = "loginToApplication")
	public void CreateEmployer1(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-NewPC1";
		String groupNo ="PC1";
		String empID ="701";

        home.createEmployer1733(searchemployer1,empID,null); 
		
    	home.createCoverage1797(searchemployer1,null, "primary_care");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
		
		home.createEmployee(searchemployer1,"anu1","family");
		
		System.out.println("*********2 Sarika-Test-NewPC1***********");
	}

	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 4, dependsOnMethods = "loginToApplication")
	public void CreateEmployer2(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-NewPCLJ1";
		String groupNo ="PCLJ1";
		String empID ="702";

        home.createEmployer1733(searchemployer1,empID,null); 
		
	    home.createCoverage1797(searchemployer1,null, "primary_care");
		
		home.createCoverageUpdate1797(searchemployer1,null, "lifejourney");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
		
		home.createEmployee(searchemployer1,"anu2","family");
		
		System.out.println("*********3 Sarika-Test-NewPCLJ1***********");
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 5, dependsOnMethods = "loginToApplication")
	public void CreateEmployer3(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="Sarika-Test-NewPCLJHRA1";
		String groupNo ="PCLJHRA1";
		String empID ="703";

        home.createEmployer1733(searchemployer1,empID,null); 
        
	    home.createCoverage1797(searchemployer1,null, "primary_care");
		
	    home.createCoverageUpdate1797(searchemployer1,null, "lifejourney");
	    
	    home.createCoverageUpdate1797(searchemployer1,null, "hra");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
		
		home.createEmployee(searchemployer1,"anu3","single");
		
		System.out.println("*********4 Sarika-Test-NewPCLJ2***********");
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 6, dependsOnMethods = "loginToApplication")
	public void CreateEmployer4(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="employer1";
		
		/*
		String searchemployer1 ="Sarika-Test-NewPCLJHRA1";
		String groupNo ="PCLJHRA1";
		String empID ="704";

        home.createEmployer1733(searchemployer1,empID,null); 
        
	    home.createCoverage1797(searchemployer1,null, "primary_care");
		
	    home.createCoverageUpdate1797(searchemployer1,null, "lifejourney");
	    
	    home.createCoverageUpdate1797(searchemployer1,null, "hra");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
	    
	    */
		
		home.createEmployee(searchemployer1,"anu70","single");
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 7, dependsOnMethods = "loginToApplication")
	public void CreateEmployer5(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="employer1";
		
		/*
		
		String searchemployer1 ="Sarika-Test-NewPCHRA1";
		String groupNo ="PCHRA1";
		String empID ="705";

        home.createEmployer1733(searchemployer1,empID,null); 
        
	    home.createCoverage1797(searchemployer1,null, "primary_care");
		
	    home.createCoverageUpdate1797(searchemployer1,null, "hra");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
	    
	    */
		
		home.createEmployee(searchemployer1,"anu71","single");
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 8, dependsOnMethods = "loginToApplication")
	public void CreateEmployer6(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="employer1";
		
		/*
		
		String searchemployer1 ="Sarika-Test-NewPCHRA1";
		String groupNo ="PCHRA1";
		String empID ="705";

        home.createEmployer1733(searchemployer1,empID,null); 
        
	    home.createCoverage1797(searchemployer1,null, "primary_care");
		
	    home.createCoverageUpdate1797(searchemployer1,null, "hra");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
	    
	    */
		
		home.createEmployee(searchemployer1,"anu72","single");
	}
	
	@Parameters({"SearchEmployer","CoverageToken","CoverageType"})
	@Test(priority = 9, dependsOnMethods = "loginToApplication")
	public void CreateEmployer7(String searchemployer, String coveragetoken, String coveragetype ) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		String searchemployer1 ="employer1";
		
		/*
		
		String searchemployer1 ="Sarika-Test-NewPCHRA1";
		String groupNo ="PCHRA1";
		String empID ="705";

        home.createEmployer1733(searchemployer1,empID,null); 
        
	    home.createCoverage1797(searchemployer1,null, "primary_care");
		
	    home.createCoverageUpdate1797(searchemployer1,null, "hra");
		
		home.createService1797(searchemployer1,null,null);
		
	    home.createGroupNo(groupNo,searchemployer1); // then create employee 
	    
	    */
		
		home.createEmployee(searchemployer1,"anu73","single");
	}
	
	@Parameters({"SearchEmployer","CoverageIdentifier", "PlanType"})
	@Test(priority = 3, dependsOnMethods = "loginToApplication" , enabled=false)
	public void CreateEmployee(String searchemployer, String coverageidentifier, String plantype) throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);
		
		home.createGroupNo("70","Sarika-Test-PC-LJ"); // then create employee 
		
	}
	
	
}