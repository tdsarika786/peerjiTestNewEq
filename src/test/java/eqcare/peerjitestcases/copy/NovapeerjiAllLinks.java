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
		
		home.novaFamilies(searchemployer1, empID, null);
		
		home.novaAppointments(searchemployer1, empID, null);
		
		home.novaVisits(searchemployer1, empID, null);
		
		home.novaPaywall(searchemployer1, empID, null);
		
		home.novaNativeApp(searchemployer1, empID, null);
		
		home.novaMedication(searchemployer1, empID, null);
		
		home.novaICD(searchemployer1, empID, null);
		
		home.novaHRAForms(searchemployer1, empID, null);
		
		home.novaHRAArticles(searchemployer1, empID, null);
		
		home.novaFAQCate(searchemployer1, empID, null);
		
		home.novaFAQ(searchemployer1, empID, null);
		
		home.novaCovidReq(searchemployer1, empID, null);	
		
		home.novaCannedRes(searchemployer1, empID, null);
				
		home.novaSupportTickets(searchemployer1, empID, null);
		
		home.novaStaff(searchemployer1, empID, null);
		
		home.novaRatings(searchemployer1, empID, null);
		
		home.novaClinicLoggedActions(searchemployer1, empID, null);
		
		home.novaIncidentReports(searchemployer1, empID, null);
		
		home.novaClinics(searchemployer1, empID, null);
		
		home.novaAnnouncements(searchemployer1, empID, null);
		
		home.novaPartnerPortals(searchemployer1, empID, null);
		
		home.novaGroupNos(searchemployer1, empID, null);
		
		home.novaEmployer(searchemployer1, empID, null);
		

		home.novaEmployees(searchemployer1, empID, null);
		
		home.novaClientAdmin(searchemployer1, empID, null);
		
		
		home.novaCarriers(searchemployer1, empID, null);
		
		home.novaAdvisors(searchemployer1, empID, null);
		
		home.novaStaffKPI(searchemployer1, empID, null);
		
		home.novaClientKPI(searchemployer1, empID, null);
		
		home.novaClinicKPILink(searchemployer1, empID, null);
		

		System.out.println("********* NOVA Patients Table ***********");
	}

	

}