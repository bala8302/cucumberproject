package io.cucumber.cucumber_archetype;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import io.cucumber.utils.ExtentReportUtil;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Feature/AppStart.feature"},
glue={"io.cucumber.cucumber_archetype"},
monochrome=true,plugin = {"html:target/cucumber-html-report","json:target/cucumber.json"},
dryRun=false,strict=false)
public class RunCucumberTest {
	
	
	@BeforeClass
	public static void initialize()
	{
		
		ExtentReportUtil.ExtentReport();
	}
	
	
	@AfterClass
	public static void closefun()
	{
		ExtentReportUtil.flushReport();
	}

}


