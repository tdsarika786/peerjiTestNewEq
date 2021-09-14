package eqcare.peerjitestcases.copy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import nova.pages.LoginPage;
import nova.pages.NovaHomePage;
import eqcare.factories.DataProviderFactory;
import eqcare.pages.copy.BaseClass;

public class NovapeerjiAllLinks extends BaseClass {

	LoginPage login;
	NovaHomePage home;

	// testpeerji

	@Test(priority = 0)
	public void verifyPage() throws Exception {

		login = PageFactory.initElements(driver, LoginPage.class);

		login.verifyUrlBeforeLogin();

	}

	@Parameters({ "NovaEmail", "NovaPassword" })
	@Test(priority = 1, dependsOnMethods = "verifyPage")
	public void loginToApplication(String novaemail, String novapassword) throws Exception {

		login.loginToApplication(novaemail, novapassword);

		login.verifyUrlAfterLogin();

		System.out.println("**********************************");

		System.out.println("***************START NOVA LOGGED IN to Application******************* "+novaemail);

	}

	@Parameters({ "SearchEmployer", "CoverageToken", "CoverageType" })
	@Test(priority = 2, dependsOnMethods = "loginToApplication")
	public void LoadPatientsTable(String searchemployer, String coveragetoken, String coveragetype)
			throws InterruptedException {

		home = PageFactory.initElements(driver, NovaHomePage.class);

		String searchemployer1 = "Sarika-Test-NewLJ1";
		String groupNo = "LJ1";
		String empID = "700";

		home.novaPatients(searchemployer1, empID, null);

		System.out.println("********* 1- NOVA novaPatients *************************");
		
		home.novaFamilies(searchemployer1, empID, null);
		
		System.out.println("********* 2- NOVA novaFamilies *************************");
		
		home.novaAppointments(searchemployer1, empID, null);
		
		System.out.println("********* 3- NOVA novaAppointments *************************");
		
		home.novaVisits(searchemployer1, empID, null);
		
		System.out.println("********* 4- NOVA novaVisits *************************");
		
		home.novaPaywall(searchemployer1, empID, null);
		
		System.out.println("********* 5- NOVA novaPaywall *************************");
		
		home.novaNativeApp(searchemployer1, empID, null);
		
		System.out.println("********* 6- NOVA novaNativeApp *************************");
		
		home.novaMedication(searchemployer1, empID, null);
		
		System.out.println("********* 7- NOVA novaMedication *************************");
		
		home.novaICD(searchemployer1, empID, null);
		
		System.out.println("********* 8- NOVA novaICD *************************");
		
		home.novaHRAForms(searchemployer1, empID, null);
		
		System.out.println("********* 9- NOVA novaHRAForms *************************");
		
		home.novaHRAArticles(searchemployer1, empID, null);
		
		System.out.println("********* 10- NOVA novaHRAArticles *************************");
		
		home.novaFAQCate(searchemployer1, empID, null);
		
		System.out.println("********* 11- NOVA novaFAQCate *************************");
		
		home.novaFAQ(searchemployer1, empID, null);
		
		System.out.println("********* 12- NOVA novaFAQ *************************");
		
		home.novaCovidReq(searchemployer1, empID, null);
		
		System.out.println("********* 13- NOVA novaCovidReq *************************");
		
		home.novaCannedRes(searchemployer1, empID, null);
		
		System.out.println("********* 14- NOVA novaCannedRes *************************");
				
		home.novaSupportTickets(searchemployer1, empID, null);
		
		System.out.println("********* 15- NOVA novaSupportTickets *************************");
		
		home.novaStaff(searchemployer1, empID, null);
		
		System.out.println("********* 16- NOVA novaStaff *************************");
		
		home.novaRatings(searchemployer1, empID, null);
		
		System.out.println("********* 17- NOVA novaRatings *************************");
		
		home.novaClinicLoggedActions(searchemployer1, empID, null);
		
		System.out.println("********* 18- NOVA novaClinicLoggedActions *************************");
		
		home.novaIncidentReports(searchemployer1, empID, null);
		
		System.out.println("********* 19- NOVA novaIncidentReports *************************");
		
		home.novaClinics(searchemployer1, empID, null);
		
		System.out.println("********* 20- NOVA novaClinics *************************");
		
		home.novaAnnouncements(searchemployer1, empID, null);
		
		System.out.println("********* 21- NOVA novaAnnouncements *************************");
		
		home.novaPartnerPortals(searchemployer1, empID, null);
		
		System.out.println("********* 22- NOVA novaPartnerPortals *************************");
		
		home.novaGroupNos(searchemployer1, empID, null);
		
		System.out.println("********* 23- NOVA novaGroupNos *************************");
		
		home.novaEmployer(searchemployer1, empID, null);
		
		System.out.println("********* 24- NOVA novaEmployer *************************");
		
		home.novaEmployees(searchemployer1, empID, null);
		
		System.out.println("********* 25- NOVA novaEmployees *************************");
		
		home.novaClientAdmin(searchemployer1, empID, null);
		
		System.out.println("********* 26- NOVA novaClientAdmin *************************");
		
		home.novaCarriers(searchemployer1, empID, null);
		
		System.out.println("********* 27- NOVA novaCarriers *************************");
		
		home.novaAdvisors(searchemployer1, empID, null);
		
		System.out.println("********* 28- NOVA novaAdvisors *************************");
		
		home.novaStaffKPI(searchemployer1, empID, null);
		
		System.out.println("********* 29- NOVA novaStaffKPI *************************");
		
		home.novaClientKPI(searchemployer1, empID, null);
		
		System.out.println("********* 30- NOVA novaClientKPI *************************");
		
		home.novaClinicKPILink(searchemployer1, empID, null);
		
		System.out.println("********* 31- NOVA novaClinicKPILink *************************");
		
	}

	

}