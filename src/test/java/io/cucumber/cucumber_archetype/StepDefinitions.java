package io.cucumber.cucumber_archetype;


import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	@Given("^user clicks the application$")
	public void testApp()
	{
		System.out.println("Logged in to the application successfully");
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void inputLogin(String uname,String pwd)
	{
		System.out.println("Values Entered"+uname+pwd);
		System.out.println("Enters the uname and pwd");
	}

}
