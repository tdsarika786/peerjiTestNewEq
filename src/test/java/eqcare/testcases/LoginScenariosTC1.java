package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import eqcare.pages.ContactUsPage;
import eqcare.pages.HomePage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.Base;
import eqcare.pages.BaseClass;

public class LoginScenariosTC1 extends Base {

	LoginPage login;
	HomePage home;

	@Test(priority = 0)
	public void verifyPage() {

		login = PageFactory.initElements(driver, LoginPage.class);

		home = PageFactory.initElements(driver, HomePage.class);

		login.verifyUrlBeforeLogin();

	}



}