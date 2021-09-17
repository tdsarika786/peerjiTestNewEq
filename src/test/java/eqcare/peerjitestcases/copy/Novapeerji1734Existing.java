package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class Novapeerji1734Existing extends BaseClass {

	LoginPage login;
	NovaHomePage home;

	// testpeerji

	@Test(priority = 0)
	public void verifyPage() throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		login.verifyUrlBeforeLogin();

	}

	@Parameters({ "NovaEmail", "NovaPassword" })
	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void loginToApplication(String novaemail, String novapassword) throws Exception {

		login.loginToApplication(novaemail, novapassword);

		login.verifyUrlAfterLogin();

		System.out.println("**********************************");

		System.out.println("***************START NOVA LOGGED IN to Application******************* "+novaemail);

	}

	@Parameters({ "SearchEmployer", "CoverageToken", "CoverageType" })
	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void CreateEmployer(String searchemployer, String coveragetoken, String coveragetype)
			throws InterruptedException {

		home = PageFactory.initElements(driver, NovaHomePage.class);

		String searchemployer1 = "Sarika-Test-NewLJ70";
		String groupNo = "LJ70";
		String empID = "70";

		home.createEmployer1733(searchemployer1, empID, null);

		home.createCoverage1797(searchemployer1, null, "lifejourney");
		
		home.createCoverageCTA();

		home.createService1797(searchemployer1, null, null);

		home.createGroupNo(groupNo, searchemployer1); // then create employee

		home.createEmployee(searchemployer1, "anu", "family");

		System.out.println("********* 1 Sarika-Test-NewLJ70 ***********");
	}

	@Parameters({ "SearchEmployer", "CoverageToken", "CoverageType" })
	@Test(priority = 3, dependsOnMethods = "loginToApplication")
	public void CreateEmployer1(String searchemployer, String coveragetoken, String coveragetype)
			throws InterruptedException {

		home = PageFactory.initElements(driver, NovaHomePage.class);

		String searchemployer1 = "Sarika-Test-NewPC71";
		String groupNo = "PC71";
		String empID = "71";

		home.createEmployer1733(searchemployer1, empID, null);

		home.createCoverage1797(searchemployer1, null, "primary_care");
		
		home.createCoverageCTA();

		home.createService1797(searchemployer1, null, null);

		home.createGroupNo(groupNo, searchemployer1); // then create employee

		home.createEmployee(searchemployer1, "anu1", "family");

		System.out.println("********* 2 Sarika-Test-NewPC71 ***********");
	}

	@Parameters({ "SearchEmployer", "CoverageToken", "CoverageType" })
	@Test(priority = 4, dependsOnMethods = "loginToApplication")
	public void CreateEmployer2(String searchemployer, String coveragetoken, String coveragetype)
			throws InterruptedException {

		home = PageFactory.initElements(driver, NovaHomePage.class);

		String searchemployer1 = "Sarika-Test-NewPCLJ72";
		String groupNo = "PCLJ72";
		String empID = "72";

		home.createEmployer1733(searchemployer1, empID, null);

		home.createCoverage1797(searchemployer1, null, "primary_care");
		
		home.createAnotherCoverageCTA();

		home.createCoverageUpdate1797(searchemployer1, null, "lifejourney");
		
		home.createCoverageCTA();

		home.createService1797(searchemployer1, null, null);

		home.createGroupNo(groupNo, searchemployer1); // then create employee

		home.createEmployee(searchemployer1, "anu2", "family");
		
		System.out.println("********* 3 Sarika-Test-NewPCLJ72 ***********");
	}

	@Parameters({ "SearchEmployer", "CoverageToken", "CoverageType" })
	@Test(priority = 5, dependsOnMethods = "loginToApplication", enabled = false)
	public void CreateEmployer3(String searchemployer, String coveragetoken, String coveragetype)
			throws InterruptedException {

		home = PageFactory.initElements(driver, NovaHomePage.class);

		String searchemployer1 = "Sarika-Test-NewPCLJHRA73";
		String groupNo = "PCLJHRA73";
		String empID = "73";

		home.createEmployer1733(searchemployer1, empID, null);

		home.createCoverage1797(searchemployer1, null, "primary_care");

		home.createCoverageUpdate1797(searchemployer1, null, "lifejourney");

		home.createCoverageUpdate1797(searchemployer1, null, "hra");

		home.createService1797(searchemployer1, null, null);

		home.createGroupNo(groupNo, searchemployer1); // then create employee

		home.createEmployee(searchemployer1, "anu3", "single");

		System.out.println("********* 4 Sarika-Test-NewPCLJHRA73 ***********");
	}

	

}