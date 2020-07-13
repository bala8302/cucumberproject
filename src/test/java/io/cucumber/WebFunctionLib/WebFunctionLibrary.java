package io.cucumber.WebFunctionLib;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class WebFunctionLibrary {
	
	public static WebDriver driver = null;
	
	public static String chromdriPath;
	
	public static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
	
	
	public WebFunctionLibrary()
	{
	
		chromdriPath = "C:\\ChromeDriver_83\\chromedriver.exe";
	}
	
	public void launchBrowser()
	{
		System.out.println("Inside");
		System.setProperty("webdriver.chrome.driver", chromdriPath);
		ChromeOptions opt = new ChromeOptions();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void navigateURL()
	{
		driver.navigate().to("https://www.google.com/");
	}
	
	public static String takeScreenShot()
	{
		String path = null;
		//System.out.println);
		try{
		 if(driver != null)
		 {
			path = System.getProperty("user.dir")+File.separator+"Screenshots" +File.separator+dateFormat.format(new Date())+"_pictur.png";
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(screenshotFile, new File(path));
		 }
		}catch(Exception e)
		{
			System.out.println("Error while taking screen shot");
		}
		return path;
		
	}

}
