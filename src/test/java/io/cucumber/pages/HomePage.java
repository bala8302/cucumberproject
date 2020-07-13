package io.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.WebFunctionLib.WebFunctionLibrary;

public class HomePage {
	
	WebFunctionLibrary wF = new WebFunctionLibrary();
	
	public HomePage()
	{
		PageFactory.initElements(WebFunctionLibrary.driver, this);
	}
	
	@FindBy(xpath="//input[@class='gLFyf gsfi']")
	WebElement searchEle;
	
	public void typeSearchBox()
	{
		searchEle.sendKeys("Cricket Test");	
	}

}