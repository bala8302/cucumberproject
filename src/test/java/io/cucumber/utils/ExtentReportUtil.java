package io.cucumber.utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtil {
	
	public static ExtentReports extent;
	public static ExtentTest scenario;
	public static ExtentTest features;
	public static ExtentTest step = null;
	
	public static String featurename = null;
	
	public static String filename = System.getProperty("user.dir")+File.separator+"src/test/resources/Reports/extent-report.html";
	
	
	public static void ExtentReport()
	{
		System.out.println("Hello in Extentreport");
		System.out.println("filename"+filename);
		extent = new ExtentReports();
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filename);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("Test Reports For SeleniumCucum");
		htmlReporter.config().setEncoding("UTF-8");
		htmlReporter.config().setReportName("Test Report Extent");
		extent.attachReporter(htmlReporter);
	}
	
	public static void flushReport()
	{
		System.out.println("Exten Flush In Runner Class call");
		extent.flush();
	}

}
