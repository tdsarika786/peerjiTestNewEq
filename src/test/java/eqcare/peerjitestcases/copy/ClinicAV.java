package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import eqcare.helper.Utility;
import eqcare.pages.ClinicPageAV;
import eqcare.pages.FeedbackPage;
import eqcare.pages.FeedbackPageAV;
import eqcare.pages.HomePage;
import eqcare.pages.HomePageAV;
import eqcare.pages.InboxPage;
import eqcare.pages.InboxPageAV;
import eqcare.pages.LifeJourneyIntakeFormPage;
import eqcare.pages.IntakeFormPage;
import eqcare.pages.IntakeFormPageAV;
import eqcare.pages.LoginPage;
import eqcare.pages.LoginPageAV;
import eqcare.pages.copy.BaseClass;

public class ClinicAV extends BaseClass {

	ClinicPageAV clinic, clinic1, clinic2, clinic3;
	LoginPageAV login;
	IntakeFormPageAV intake;
	HomePageAV home;
	FeedbackPageAV feedback;
	InboxPageAV inbox;

	// Patient Start Visit
	@Parameters({ "Email", "Password" })
	@Test(priority = 0, enabled = false)
	public void loginToPatientApplication(String email, String password) throws Exception {

		login = PageFactory.initElements(driver, LoginPageAV.class);

		home = PageFactory.initElements(driver, HomePageAV.class);

		login.loginToApplication(email, password);

		login.verifyUrlAfterLogin();

		intake = PageFactory.initElements(driver, IntakeFormPageAV.class);

		home.deviceCheck();

		intake.fillIntakeForm();
	}

	@Parameters({ "VisitNo" })
	@Test(priority = 1)
	public void loginAsCM(String VisitNo) throws Exception {
		
		login = PageFactory.initElements(driver, LoginPageAV.class);

		home = PageFactory.initElements(driver, HomePageAV.class);

		clinic = PageFactory.initElements(driver, ClinicPageAV.class);

		clinic2 = PageFactory.initElements(driver2, ClinicPageAV.class);

		clinic2.loginToApplication("saru@eqcare.com", "secret");
			
		clinic3 = PageFactory.initElements(driver3, ClinicPageAV.class);

		clinic3.loginToApplication("anu@eqcare.com", "secret");
	}

	// CM Test
	@Parameters({ "VisitNo" ,"ClinicAppURL"})
	@Test(priority = 2)
	public void loginToClinicApplication(String VisitNo,String ClinicAppURL) throws Exception {
		
		clinic1 = PageFactory.initElements(driver1, ClinicPageAV.class);

		clinic1.loginToApplication("anku@eqcare.com", "secret");

		clinic1.navigateToClinicVisitPage(VisitNo,ClinicAppURL);

		try {
			clinic1.takePatient();
		}

		catch (Exception ex) {
			clinic1.loginToApplication("anku@eqcare.com", "secret");

			clinic1.navigateToClinicVisitPage(VisitNo,ClinicAppURL);

			clinic1.takePatient();

		}

	}	
	
	@Parameters({ "Email", "Password" })
	@Test(priority = 3)
	public void loginToPatient(String email, String password) throws Exception {

	
		login.loginToApplication(email, password);

		clinic.navigateToPatientVisitPage();

		home.navigateToHomePage();

		clinic.nextStep();

		clinic.navigateToPatientVisitPage();
		
		System.out.println();
		
		System.out.println("Log:INFO- *******PEERJI START*********************");

		System.out.println("Log:INFO- PATIENT VISIT STARTS");

	}

	@Test(priority = 4)
	public void functionsWithCM() {

		clinic1.addComments("sai-pic CM", "sai-pic.jpeg");

		clinic1.addComments("Sample CM", "sample.pdf");
		
		clinic1.cannedResponses();

		clinic1.patientsTab();

		clinic1.visitTab();

		clinic1.createIncident();

		clinic1.submitChats("PeerjiAuto Test Chat CM-1");

		System.out.println("Log:INFO- CM with patients - comments, canned, create incidents, chats");

	}
	
	@Test(priority = 5, dependsOnMethods = "loginToClinicApplication")
	public void patientChats() {

		clinic.patientSubmitChats("Patient with CM-2");
	}
	
	
	@Test(priority =6)
	public void transferPatientToNurse() {
		clinic1.transferToNurse();

		System.out.println("Log:INFO- CM TRANSFER PATIENT TO NURSE");
	}
	

	@Parameters({ "VisitNo","ClinicAppURL" })
	@Test(priority = 7, dependsOnMethods = "loginToClinicApplication")
	public void navigateToNurse(String VisitNo,String ClinicAppURL) throws Exception {
		
		clinic2.navigateToClinicVisitPage(VisitNo,ClinicAppURL);
		
		try {
			clinic2.addComments("sai-pic", "sai-pic.jpeg");
		}

		catch (Exception ex) {
			clinic2.loginToApplication("nurse@eqcare.com", "secret");

			clinic2.navigateToClinicVisitPage(VisitNo,ClinicAppURL);
		}
		clinic2.addComments("sai-pic Nurse", "sai-pic.jpeg");

		clinic2.addComments("Sample Nurse", "sample.pdf");
		
		clinic2.cannedResponses();

		clinic2.patientsTab();

		clinic2.visitTab();

		clinic2.submitChats("PeerjiAuto Test Chat Nurse-3");
		
		System.out.println("Log:INFO- Nurse with patients - comments, canned, create incidents, chats");

	}
	

	@Test(priority = 8, dependsOnMethods = "loginToClinicApplication")
	public void patientChatsToNurse() {

		clinic.patientSubmitChats("Patient with Nurse-4");
	}

	@Test(priority = 9, dependsOnMethods = "loginToClinicApplication")
	public void transferPatientToCoctor() {

		clinic2.transferToDoctor();

		System.out.println("Log:INFO- NURSE TRANSFER PATIENT TO DOCTOR");

	}

	@Parameters({ "VisitNo" ,"ClinicAppURL"})
	@Test(priority = 10, dependsOnMethods = "loginToClinicApplication")
	public void navigateToDr(String VisitNo,String ClinicAppURL) throws Exception {

		clinic3.navigateToClinicVisitPage(VisitNo,ClinicAppURL);
		
		try {

			clinic3.takePatient();
		}

		catch (Exception ex) {
			clinic3.loginToApplication("doctor@eqcare.com", "secret");

			clinic3.navigateToClinicVisitPage(VisitNo,ClinicAppURL);

			clinic3.takePatient();
		}

		clinic2.addComments("sai-pic DR", "sai-pic.jpeg");

		clinic3.addComments("Sample DR", "sample.pdf");
		
		clinic3.cannedResponses();

		clinic3.patientsTab();

		clinic3.visitTab();

		clinic3.submitChats("PeerjiAuto Test Chat DR-5");
		
		System.out.println("Log:INFO- Doctor with patients - comments, canned, create incidents, chats");

	}

	@Test(priority = 11, dependsOnMethods = "loginToClinicApplication")
	public void patientChatsToDoctor() {

		clinic.patientSubmitChats("Patient with DR-6");
	}

	@Test(priority = 12, dependsOnMethods = "loginToClinicApplication")
	public void doctorEndConsultation() {

		clinic3.endConsultation();

		System.out.println("Log:INFO- DOCTOR END CONSULTATION");

	}

	@Test(priority = 13, dependsOnMethods = "loginToClinicApplication")
	public void feedback() throws Exception {

		feedback = PageFactory.initElements(driver, FeedbackPageAV.class);

		feedback.ratingProvidedDRCMNurse();

		System.out.println("Log:INFO- Feedback provided");

	}

	@Test(priority = 14, dependsOnMethods = "loginToClinicApplication")
	public void inbox() throws Exception {

		inbox = PageFactory.initElements(driver, InboxPageAV.class);

		inbox.navigateToInboxPage();

		inbox.verifyMyInboxTabs();

		System.out.println("Log:INFO- Inbox redirected");

	}
}