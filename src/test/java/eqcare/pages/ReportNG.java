package eqcare.pages;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportNG {

	static ExtentReports report;

	public static ExtentReports setupReport() {

		System.out.println("Log:INFO- Report is getting setup");

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/Report1/ExtentReport.html");

		htmlReporter.config().setReportName("Pony Web Automation Results");

		htmlReporter.config().setDocumentTitle("Test Results");

		htmlReporter.config().setReportName("Test Report Sanity Env");

		htmlReporter.config().setTheme(Theme.DARK);

		report = new ExtentReports();

		report.attachReporter(htmlReporter);

		report.setSystemInfo("OS", "Mac Sers");

		report.setSystemInfo("Automation Tester", "Sarika");

		System.out.println("Log:INFO- Report setup ready");

		return report;
	}

}
