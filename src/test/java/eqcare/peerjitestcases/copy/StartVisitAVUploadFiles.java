package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import eqcare.helper.Utility;
import eqcare.pages.ClinicPage;
import eqcare.pages.HomePage;
import eqcare.pages.HomePageAV;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.IntakeFormPageAV;
import eqcare.pages.LoginPageAV;
import eqcare.pages.copy.BaseClass;

public class StartVisitAVUploadFiles extends BaseClass {

	ClinicPage clinic, clinic1, clinic2, clinic3;
	LoginPageAV login;
	IntakeFormPageAV intake;
	HomePageAV home;

	// Patient Start Visit
	@Parameters({ "Email", "Password" })
	@Test(priority = 0)
	public void loginToApplication(String email, String password) throws Exception {

		login = PageFactory.initElements(driver, LoginPageAV.class);

		login.loginToApplication(email, password);

		login.verifyUrlAfterLogin();
		
		System.out.println("*************START EQ VISIT Upload Files ******************** " + email);

	}

	@Test(priority = 1, dependsOnMethods = "loginToApplication")
	public void startVideoConsultation() throws Exception {

		home = PageFactory.initElements(driver, HomePageAV.class);

		home.navigateToHomePage();

	}

	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void deviceCheck() throws Exception {

		home = PageFactory.initElements(driver, HomePageAV.class);

		home.deviceCheck();
		
		System.out.println("************* 1- Device Check ******************** ");

	}

	@Test(priority = 3, dependsOnMethods = "deviceCheck")
	public void fillIntakeFormWithAllFields() throws Exception {

		intake = PageFactory.initElements(driver, IntakeFormPageAV.class);

		intake.fillIntakeForm1();
		
		intake.uploadAuthFiles("1sample.pdf");
		
		intake.uploadAuthFiles("2test1.jpeg");
		
		intake.uploadAuthFiles("3Testfilebmp.bmp");
		
		intake.uploadAuthFiles("4Testfilegif.gif");
		
		intake.uploadAuthFiles("5Testfilejpg.jpg");
		
		//intake.uploadAuthFiles("6Testfilepng.png");	

		intake.uploadAuthFiles("7Testfilewebp.webp");
		
		Utility.wait(50);
		
		System.out.println("************* 2- Upload Files ******************** ");
		
		System.out.println("************* END ******************** ");

	}

}