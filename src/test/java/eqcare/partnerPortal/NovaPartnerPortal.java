package eqcare.partnerPortal;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class NovaPartnerPortal extends BaseClass {

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
	public void CreatePartnerPortal(String searchemployer, String coveragetoken, String coveragetype)
			throws InterruptedException {

		home = PageFactory.initElements(driver, NovaHomePage.class);

		String searchemployer1 = "Sarika-Test-NewLJ1";
		String groupNo = "LJ1";
		String empID = "700";

		home.createPartnerPortal(searchemployer1, empID, null);

		System.out.println("*********1 Sarika-Test-NewLJ1***********");
	}

	

}