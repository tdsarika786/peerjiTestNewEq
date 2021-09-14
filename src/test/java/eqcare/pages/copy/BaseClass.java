package eqcare.pages.copy;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import eqcare.factories.BrowserFactory;
import eqcare.factories.DataProviderFactory;
import eqcare.helper.Utility;

public class BaseClass implements ITestListener {

	public WebDriver driver, driver1, driver2, driver3;
	public ExtentReports report;
	public ExtentTest logger;

	@Parameters({ "Browser", "AppURL", "ProjectRun", "ClinicAppURL", "AppType" })
	@BeforeClass
	public void setUp(String browser, String appurl, String projectrun, String ClinicAppURL, String AppType)
			throws IOException {
		System.out.println("Log:INFO- Setting up Browser and Application");

		// driver =
		// BrowserFactory.getApplication(DataProviderFactory.getConfig().getValue("Browser"),
		// DataProviderFactory.getConfig().getValue("ponyEnv"));

		driver = BrowserFactory.getApplication(browser, appurl, projectrun);

		System.out.println("Log:INFO- Driver Value- " + driver);

		driver.manage().window().maximize();

		if (AppType.equalsIgnoreCase("clinic")) {

			driver1 = BrowserFactory.getApplication(browser, ClinicAppURL, projectrun);

			System.out.println("Log:INFO- Driver Value- " + driver1);

			driver1.manage().window().maximize();
			

			driver2 = BrowserFactory.getApplication(browser, ClinicAppURL, projectrun);

			System.out.println("Log:INFO- Driver Value- " + driver2);

			driver2.manage().window().maximize();
			

			driver3 = BrowserFactory.getApplication(browser, ClinicAppURL, projectrun);

			System.out.println("Log:INFO- Driver Value- " + driver3);

			driver3.manage().window().maximize();

		}

		// driver.manage().window().setSize(new Dimension(1270, 716));

		// driver1=BrowserFactory.getApplication(DataProviderFactory.getConfig().getValue("Browser"),
		// DataProviderFactory.getConfig().getValue("clinic"));

		System.out.println("Log:INFO- Browser and application is ready");
	}

	@Parameters({ "Browser", "AppURL", "ProjectRun", "ClinicAppURL", "AppType" })
	@AfterClass
	public void tearDown(String browser, String appurl, String projectrun, String ClinicAppURL, String AppType) {
		System.out.println("Log:INFO- Terminating browser");

		BrowserFactory.closeApplication(driver);

		if (AppType.equalsIgnoreCase("clinic")) {
			BrowserFactory.closeApplication(driver1);

			BrowserFactory.closeApplication(driver2);

			BrowserFactory.closeApplication(driver3);
		}

		System.out.println("Log:INFO- Browser terminated");
	}

}
