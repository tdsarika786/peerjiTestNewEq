package eqcare.pages;

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

	public WebDriver driver, driver1;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setupReport() {

		System.out.println("Log:INFO- Report is getting setup");

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/Report/ExtentReport.html");

		// ExtentSparkReporter htmlReporter=new
		// ExtentSparkReporter(System.getProperty("user.dir")+"/Report/ExtentReport.html");

		htmlReporter.config().setReportName("Pony Web Automation Results");

		htmlReporter.config().setDocumentTitle("Test Results");

		//htmlReporter.config().setReportName("Test Report Sanity Env");

		report = new ExtentReports();

		report.attachReporter(htmlReporter);
		
		report.setSystemInfo("Environment", "Pony Staging");

		report.setSystemInfo("OS", "macOS Catalina");

		report.setSystemInfo("Automation Tester", "Sarika");

		System.out.println("Log:INFO- Report setup ready");
	}

	@AfterMethod

	public void tearDownReport(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {

			System.out.println("Log:INFO- Test Executed- Test Status is Passed");
			

		} else if (result.getStatus() == ITestResult.FAILURE) {

			System.out.println("Log:INFO- Test Executed- Test Status is Failed");

		} else if (result.getStatus() == ITestResult.SKIP) {
			System.out.println("Log:INFO- Test Executed- Test Status is Skipped");

		}

		if (result.getStatus() == ITestResult.SUCCESS) {

			logger.pass("Test Passed");

		} else if (result.getStatus() == ITestResult.FAILURE) {

			try {
				logger.fail("Test Failed " + result.getThrowable().getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(Utility.getScreenshot(driver)).build());
			} catch (IOException e) {
				System.out.println("Unable to attach screenshot in report " + e.getMessage());
			}

		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.skip("Test Skipped");
		}

		report.flush();
	}

	@Parameters({"Browser","AppURL", "ProjectRun"})
	@BeforeClass
	public void setUp(String browser, String appurl, String projectrun) {
		System.out.println("Log:INFO- Setting up Browser and Application");

		//driver = BrowserFactory.getApplication(DataProviderFactory.getConfig().getValue("Browser"),
		//		DataProviderFactory.getConfig().getValue("ponyEnv"));
		
		driver = BrowserFactory.getApplication(browser,
						appurl, projectrun);

		driver.manage().window().maximize();
		
		System.out.println("Log:INFO- Driver Value- "+driver);

		// driver.manage().window().setSize(new Dimension(1270, 716));

		// driver1=BrowserFactory.getApplication(DataProviderFactory.getConfig().getValue("Browser"),
		// DataProviderFactory.getConfig().getValue("clinic"));

		System.out.println("Log:INFO- Browser and application is ready");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Log:INFO- Terminating browser");

		BrowserFactory.closeApplication(driver);

		System.out.println("Log:INFO- Browser terminated");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		// logger = report.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		// logger.pass("Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		// logger.fail("Test Failed");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// report.flush();
	}

}
