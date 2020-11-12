package eqcare.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import NotRequiredClasses.AdminPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.BaseClass;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.VerifyPage;

public class CheckLinks extends BaseClass {

	LoginPage login;
	LogoutPage logout;	
	AdminPage admin;
	VerifyPage page;
	
	@Test(priority=0)
	public void verifyPage()
	{		
			
		login=PageFactory.initElements(driver, LoginPage.class);
		
		logout=PageFactory.initElements(driver, LogoutPage.class);	
		
		page=PageFactory.initElements(driver, VerifyPage.class);
		
		logger=report.createTest("URL validation");
		
		page.verifyLinks();	
		
		logger.info("Validating url");
	
		
	}
	

	

}
