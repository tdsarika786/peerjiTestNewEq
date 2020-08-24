package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import eqcare.pages.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class EnrolledUserRegisteration extends BaseClass {

	RegistrationPage register;

	
	@Test(priority=0)
	public void verifyPage()
	{		
				
		register=PageFactory.initElements(driver, RegistrationPage.class);
		
		logger=report.createTest("Registration Page URL validation");
		
		logger.info("validating Register now link");
		
		register.verifyUrlBeforeRegister();
		
		logger.info("Validated Register URL");
		
	}
	
	@Test(priority=1,dependsOnMethods="verifyPage")
	public void enrolledUserRegisterToApplication() 
	{
		
		logger=report.createTest("Register Not Enrolled User for EQCare Services");
		
		register.EnrolledUser();
		
		logger.info("Validated Enrolled plan link");
		
		register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 1, 0),
				
		DataProviderFactory.getExcel().getCellData("Users", 1, 1),DataProviderFactory.getExcel().getCellData("Users", 1, 2),
		
	    DataProviderFactory.getExcel().getCellData("Users", 1, 4),
		
		DataProviderFactory.getExcel().getCellData("Users", 1, 5), DataProviderFactory.getExcel().getCellData("Users", 1, 6),
		
		DataProviderFactory.getExcel().getCellData("Users", 1, 7), DataProviderFactory.getExcel().getCellData("Users", 1, 8),
		
		DataProviderFactory.getExcel().getCellData("Users", 1, 9),DataProviderFactory.getExcel().getCellData("Users", 2, 10),true
		);
		
		//login.verifyUrlAfterLogin();
		
		logger.info("Registeration complete: Enrolled User:" + DataProviderFactory.getExcel().getCellData("Users", 1, 0) +" Register in EQCare as Patient");
	}
	
	@Test(priority=2,dependsOnMethods="verifyPage")
	public void enrolledUserRegisterToApplication_TC1() 
	{
		
		logger=report.createTest("Register Not Enrolled User for EQCare Services");
		
		register.EnrolledUser_TC1();
	}
}