package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import eqcare.pages.ClinicPage;
import eqcare.pages.LoginPage;
import eqcare.pages.copy.BaseClass;

public class ClinicPeerji extends BaseClass {

	ClinicPage clinic;
	
	//test
	@Parameters({"NovaEmail","NovaPassword"})
	@Test(priority = 0)
	public void loginToApplication(String NovaEmail, String NovaPassword) throws Exception {
		
		clinic = PageFactory.initElements(driver, ClinicPage.class);
		
		clinic.loginToApplication(NovaEmail,NovaPassword);
		
		clinic.navigateToClinicVisitPage();
		
	}
	
	@Test(priority = 1)
	public void addComments1(String NovaEmail, String NovaPassword) throws Exception {
		
		clinic = PageFactory.initElements(driver, ClinicPage.class);
		
		clinic.loginToApplication(NovaEmail,NovaPassword);
		
		clinic.navigateToClinicVisitPage();
		
		clinic.addComments("Test1");
		
	}
	
	@Test(priority = 2)
	public void addComments2(String NovaEmail, String NovaPassword) throws Exception {
		
		clinic = PageFactory.initElements(driver, ClinicPage.class);
		
		clinic.navigateToClinicVisitPage();
		
		clinic.addComments("Test2");
		
	}
	
	
	
}