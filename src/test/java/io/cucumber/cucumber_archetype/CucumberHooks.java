package io.cucumber.cucumber_archetype;

import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.WebFunctionLib.WebFunctionLibrary;
import io.cucumber.utils.ExtentReportUtil;

public class CucumberHooks {
	
	@Before
	public void initialize(Scenario scenario)
	{
		
		String temp = scenario.getId().split(";")[0];
		System.out.println("TempValue in cucumber hook"+temp);
		if(ExtentReportUtil.featurename==null || !temp.equals(ExtentReportUtil.featurename))
		{
			System.out.println("inside cucumber hook loop");
			ExtentReportUtil.flushReport();
			ExtentReportUtil.features=ExtentReportUtil.extent.createTest(temp);
			ExtentReportUtil.featurename=temp;
		}
		System.out.println("Temp++"+temp);
		System.out.println("Scenario Name"+scenario.getName());
		ExtentReportUtil.scenario = ExtentReportUtil.features.createNode(scenario.getName());
		
	}
	
	@After
	public void closefun(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
		String path = WebFunctionLibrary.takeScreenShot();
		System.out.println("path"+path);
		System.out.println("inside cucumber hook loop Fail");
		if(path!=null)
		{
			ExtentReportUtil.scenario.fail("Failed in steps").addScreenCaptureFromPath(path);
			ExtentReportUtil.step.fail("Failed").addScreenCaptureFromPath(path);
		}
		}
		else
		{
			
		}
		
	}

}
