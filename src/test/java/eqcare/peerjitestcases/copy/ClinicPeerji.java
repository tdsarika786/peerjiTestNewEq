package eqcare.peerjitestcases.copy;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import eqcare.pages.ClinicPage;

import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class ClinicPeerji extends BaseClass {

	ClinicPage clinic;
	
	//test
	
	@Parameters({"Email","Password"})
	@Test(priority = 0, dependsOnMethods = "verifyPage")
	public void loginToApplication(String email, String password) throws Exception {
		
		clinic.loginToApplication(email,
			password);
		
		clinic.navigateToClinicVisitPage();
		
	}
	
	
	
	
}