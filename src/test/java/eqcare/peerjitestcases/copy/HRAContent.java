package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;

import eqcare.pages.HRAHomePageNew2;
import eqcare.pages.HomePage;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class HRAContent extends BaseClass {

	LoginPage login;
	HRAHomePageNew2 home;
	LifeJourneyIntakeFormPage intakeForm;
	ClinicPage clinic;
	HomePage home1;

	@Parameters({ "Email", "Password" })
	@Test(priority = 1)
	public void verifyPage(String email, String password) throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication(email, password);

		home = PageFactory.initElements(driver, HRAHomePageNew2.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		home.verifyUrl();

	}

	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void verifyHRAPages() throws Exception {

		// home.navigateToHRAContentLibrary();

		home1 = PageFactory.initElements(driver, HomePage.class);

		home1.hraCompleteLater();

		home.scoreInfoHomePage();

		System.out.println(" ************** 1- START Score INFO Home Page check*********************");

	}

	@Test(priority = 2, dependsOnMethods = "verifyPage")
	public void verifyHRAContent() throws Exception {

		System.out.println(" ************** 2- INFO-PEERJI START HRA Content*********************");

		home.verifyHRAContentLibrary();

		System.out.println(" **************INFO-PEERJI END HRA Content *********************");

	}

}