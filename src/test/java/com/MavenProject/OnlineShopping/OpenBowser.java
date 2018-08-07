package com.MavenProject.OnlineShopping;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.annotations.Test;

public class OpenBowser {
	public static WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "/Users/NarenNavya/Documents/workspace/geckodriver");
	    driver=new FirefoxDriver();
		}
	    else if(browser.equalsIgnoreCase("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "/Users/NarenNavya/Documents/workspace/chromedriver");
		    driver=new ChromeDriver();
	    }
	}
	@BeforeClass
	public void Testing()
	{
		System.out.println("ExcelReading");
	}
       @Test (priority=1)
       public void launchApplication() throws InterruptedException
       {
	     driver.get("https://www.amazon.co.uk/");
	     Thread.sleep(1000);
	     System.out.println("Sucessfully launch the application");
       }
       
       @Test (priority=2)
       public void application() throws InterruptedException
       {
	     driver.get("https://www.ebay.co.uk/");
	     Thread.sleep(1000);
	     System.out.println("Sucessfully launch the application");
       }
       
       @AfterMethod
   	   public void closeWindow()
   	   {
   		 driver.quit();
   	   }
}
