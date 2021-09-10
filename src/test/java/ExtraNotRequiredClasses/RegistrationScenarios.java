package ExtraNotRequiredClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.RegistrationPage;
import eqcare.factories.BrowserFactory;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;

public class RegistrationScenarios extends BaseClass {

	RegistrationPage register;
	public WebDriver driver;
	
	
	@Test(priority=0)
	public void verifyUrlBeforeRegister()
	{		
				
		register=PageFactory.initElements(driver, RegistrationPage.class);
		
		logger=report.createTest("Registration Page URL validation");
		
		logger.info("validating Register now link");
		
		register.verifyUrlBeforeRegister();
		
		logger.info("Validated Register URL");
		
	}
	
	@Test(priority=1,dependsOnMethods="verifyUrlBeforeRegister")
	public void enrolledUserRegisterToApplication() 
	{
		
		logger=report.createTest("Registeration of Enrolled User");
		
		//register.clickOnRegisterButton();
		
	register.EnrolledUser();
		
		//logger.info("Clicked on Enrolled plan link covers EQ Care services");
		
	/*	register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 1, 0),
				
		DataProviderFactory.getExcel().getCellData("Users", 1, 1),DataProviderFactory.getExcel().getCellData("Users", 1, 2),
		
	    DataProviderFactory.getExcel().getCellData("Users", 1, 4),
		
		DataProviderFactory.getExcel().getCellData("Users", 1, 5), DataProviderFactory.getExcel().getCellData("Users", 1, 6),
		
		DataProviderFactory.getExcel().getCellData("Users", 1, 7), DataProviderFactory.getExcel().getCellData("Users", 1, 8),
		
		DataProviderFactory.getExcel().getCellData("Users", 1, 9)
		);
		*/
		//login.verifyUrlAfterLogin();
		
		//logger.info("Registeration complete: Enrolled User Register in EQCare as Patient");
	}
	
	@Test(priority=2,dependsOnMethods="verifyUrlBeforeRegister")
	public void userRegisterToApplication() 
	{
		register=PageFactory.initElements(driver, RegistrationPage.class);
		
		//logger=report.createTest("Register Not Enrolled User");
		
		//register.clickOnRegisterButton();
		
		register.notEnrolledUser();
		
		//logger.info("Clicked on not Enrolled link");
		
		register.Registeration(DataProviderFactory.getExcel().getCellData("Users", 1, 0),
				
		DataProviderFactory.getExcel().getCellData("Users", 2, 1),DataProviderFactory.getExcel().getCellData("Users", 2, 2),
		
	    DataProviderFactory.getExcel().getCellData("Users", 2, 4),
		
		DataProviderFactory.getExcel().getCellData("Users", 2, 5), DataProviderFactory.getExcel().getCellData("Users", 2, 6),
		
		DataProviderFactory.getExcel().getCellData("Users", 2, 7), DataProviderFactory.getExcel().getCellData("Users", 2, 8),
		
		DataProviderFactory.getExcel().getCellData("Users", 2, 9),	DataProviderFactory.getExcel().getCellData("Users", 2, 10),true
		);
		
		//login.verifyUrlAfterLogin();
		
		//logger.info("Registeration complete: Not Enrolled User Register in EQCare as Patient");
	}
	
	@Test(priority=2,dependsOnMethods="loginToApplication", enabled=false)
	public void logoutFromApplication()
	{
		logger=report.createTest("Logout");
		
	//	logout.logOutFromApplicationWithAdminRole();
		
		logger.info("Logout done");
		
	}

}