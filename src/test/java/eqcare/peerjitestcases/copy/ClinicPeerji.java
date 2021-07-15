package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import eqcare.helper.Utility;
import eqcare.pages.ClinicPage;
import eqcare.pages.FeedbackPage;
import eqcare.pages.HomePage;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.LoginPage;
import eqcare.pages.copy.BaseClass;

public class ClinicPeerji extends BaseClass {

	ClinicPage clinic, clinic1, clinic2, clinic3;
	LoginPage login;
	IntakeFormPage intake;
	HomePage home;
	FeedbackPage feedback;

	// Patient Start Visit
	@Parameters({ "Email", "Password" })
	@Test(priority = 0, enabled = false)
	public void loginToPatientApplication(String email, String password) throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		home = PageFactory.initElements(driver, HomePage.class);

		login.loginToApplication(email, password);

		login.verifyUrlAfterLogin();

		intake = PageFactory.initElements(driver, IntakeFormPage.class);

		home.deviceCheck();

		intake.fillIntakeForm();
	}

	@Parameters({ "Email", "Password" })
	@Test(priority = 1)
	public void loginToPatient(String email, String password) throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		home = PageFactory.initElements(driver, HomePage.class);

		clinic = PageFactory.initElements(driver, ClinicPage.class);

		login.loginToApplication(email, password);

		clinic.navigateToPatientVisitPage();
		
		home.navigateToHomePage();
		
		clinic.nextStep();
		
		clinic.navigateToPatientVisitPage();
		
		System.out.println("Log:INFO- PATIENT VISIT STARTS");

		clinic1 = PageFactory.initElements(driver1, ClinicPage.class);

		clinic1.loginToApplication("cm@eqcare.com", "secret");

		clinic2 = PageFactory.initElements(driver2, ClinicPage.class);

		clinic2.loginToApplication("nurse@eqcare.com", "secret");

		clinic3 = PageFactory.initElements(driver3, ClinicPage.class);

		clinic3.loginToApplication("doctor@eqcare.com", "secret");
	}

	// CM Test
	@Test(priority = 2)
	public void loginToClinicApplication() throws Exception {

		clinic1.navigateToClinicVisitPage();

		try {
			clinic1.takePatient();
		}

		catch (Exception ex) {
			clinic1.loginToApplication("cm@eqcare.com", "secret");

			clinic1.navigateToClinicVisitPage();
			
			clinic1.takePatient();
			
		}

		clinic1.addComments("sai-pic CM", "sai-pic.jpeg");

		clinic1.addComments("test1 CM", "test1.jpeg");

		clinic1.addComments("Sample CM", "sample.pdf");

		clinic1.patientsTab();

		clinic1.visitTab();

		clinic1.cannedResponses();

		clinic1.submitChats();
		
		clinic1.createIncident();

		clinic1.transferToNurse();
		
		System.out.println("Log:INFO- CM TRANSFER PATIENT TO NURSE");

	}

	@Test(priority = 3)
	public void navigateToNurse() throws Exception {

		clinic2.navigateToClinicVisitPage();

		try {
			clinic2.addComments("sai-pic", "sai-pic.jpeg");
		}

		catch (Exception ex) {
			clinic2.loginToApplication("nurse@eqcare.com", "secret");

			clinic2.navigateToClinicVisitPage();
		}
		clinic2.addComments("sai-pic Nurse", "sai-pic.jpeg");
		
		clinic2.addComments("test1 Nurse", "test1.jpeg");

		clinic2.addComments("Sample Nurse", "sample.pdf");

		clinic2.patientsTab();

		clinic2.visitTab();

		clinic2.cannedResponses();

		clinic2.submitChats();

		clinic2.transferToDoctor();
		
		System.out.println("Log:INFO- NURSE TRANSFER PATIENT TO DOCTOR");

	}

	@Test(priority = 4)
	public void navigateToDr() throws Exception {

		clinic3.navigateToClinicVisitPage();

		try {

			clinic3.takePatient();
		}

		catch (Exception ex) {
			clinic3.loginToApplication("doctor@eqcare.com", "secret");

			clinic3.navigateToClinicVisitPage();
			
			clinic3.takePatient();
		}

		clinic2.addComments("sai-pic DR", "sai-pic.jpeg");
		
		clinic3.addComments("test1 DR", "test1.jpeg");

		clinic3.addComments("Sample DR", "sample.pdf");

		clinic3.patientsTab();

		clinic3.visitTab();

		clinic3.cannedResponses();

		clinic3.submitChats();

		clinic3.endConsultation();
		
		System.out.println("Log:INFO- DOCTOR END CONSULTATION");

	}
	
	@Test(priority = 5)
	public void feedback() throws Exception {

		feedback = PageFactory.initElements(driver, FeedbackPage.class);

		feedback.ratingProvided();

	}

}