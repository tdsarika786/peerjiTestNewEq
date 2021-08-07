package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class CreateStaff extends BaseClass {

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
		
		System.out.println("************* START Staff ************************** "+novaemail);

	}
	
	
	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void CreateStaff() throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

        home.addStaff("saru@eqcare.com", "secret", "Nurse");
        
        System.out.println("************* Added Nurse saru@eqcare.com **************************");
	}
	
	@Test(priority = 3, dependsOnMethods = "loginToApplication")
	public void CreateStaff1() throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

        home.addStaff("anku@eqcare.com", "secret", "CareManager");
        
        System.out.println("************* Added CM anku@eqcare.com **************************");
	}
	
	@Test(priority = 4, dependsOnMethods = "loginToApplication")
	public void CreateStaff2() throws InterruptedException {
		
		home = PageFactory.initElements(driver, NovaHomePage.class);

        home.addStaff("anu@eqcare.com", "secret", "Practitioner");
        
        System.out.println("************* Added Practitioner anu@eqcare.com **************************");
	}
	
	
	
}