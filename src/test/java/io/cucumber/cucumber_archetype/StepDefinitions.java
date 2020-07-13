

package io.cucumber.cucumber_archetype;


import static org.junit.Assert.*;

import java.io.IOException;

import com.aventstack.extentreports.GherkinKeyword;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.Transform.TransformData;
import io.cucumber.WebFunctionLib.WebFunctionLibrary;
import io.cucumber.pages.HomePage;
import io.cucumber.utils.ExtentReportUtil;

public class StepDefinitions {
	
	@Given("^user clicks the application$")
	public void testApp()
	{
		System.out.println("Logged in to the application successfully");
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void inputLogin(@Transform(TransformData.class)String uname,String pwd)
	{
		System.out.println("Values Entered"+uname+pwd);
		System.out.println("Enters the uname and pwd");
	}	
	@When("^Open the Browser$")
	public void open_the_browser() throws ClassNotFoundException
	{
		ExtentReportUtil.step = ExtentReportUtil.scenario.createNode(new GherkinKeyword("When"),"Open the browser");
		System.out.println("Opening the browser");
		WebFunctionLibrary wfl = new WebFunctionLibrary();
		wfl.launchBrowser();
		wfl.navigateURL();		
	}
	
	@When("^Users Enters the Value$")
	public void entertheValuesinSB() throws Exception
	{
	  ExtentReportUtil.step = ExtentReportUtil.scenario.createNode(new GherkinKeyword("When"),"Enters the value");
	  HomePage hp = new HomePage();
	  hp.typeSearchBox();
	  throw new Exception();
	}

}
