package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NotRequiredClasses.ContactUsPage;
import eqcare.pages.LifeJourneyHomePage;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.LogoutPage;
import eqcare.pages.ClinicPage;
import eqcare.pages.HomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class TC4_LifeJourneyEndScenariosLJ extends BaseClass {

	LoginPage login;
	LifeJourneyHomePage home;
	LifeJourneyIntakeFormPage intakeForm;
	ClinicPage clinic;
	HomePage home1;

	@Parameters({ "Email", "Password" })
	@Test(priority = 1)
	public void verifyPage(String email, String password) throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication(email, password);

		home = PageFactory.initElements(driver, LifeJourneyHomePage.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		home.verifyUrl();

		System.out.println("************* START LJ  EndToEndScenarios ************************** " + email);

	}

	@Test(priority = 2, dependsOnMethods = "verifyPage", enabled = false)
	public void verifyStartLifeJourney() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home1 = PageFactory.initElements(driver, HomePage.class);

		home1.hraCompleteLater();

		intakeForm.startLifeJourneyWithoutAnsweringQues();

	}

	@Test(priority = 2)
	public void verifyStartLifeJourneyYesButton() throws Exception {
		login = PageFactory.initElements(driver, LoginPage.class);

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);
		
		home1 = PageFactory.initElements(driver, HomePage.class);

		home1.hraCompleteLater();

		intakeForm.startLifeJourneyAfterFillingIntakeForms();

		System.out.println("************* 1- startLifeJourneyAfterFillingIntakeForms ************************** ");

	}

	@Test(priority = 4, dependsOnMethods = "verifyPage")
	public void verifyflowerInformation() throws Exception {

		intakeForm = PageFactory.initElements(driver, LifeJourneyIntakeFormPage.class);

		home.navigateToHomePage();

		intakeForm.flowerInformationCheck();

		System.out.println("************* 2 - flowerInformationCheck************************** ");

		System.out.println("************* END ************************** ");

	}

}