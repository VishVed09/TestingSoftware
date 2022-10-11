package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.PomClass.POMLogin;
import com.SauceDemo.utilityclass.ScreenShotClass;

public class TestBaseClass 
{
	
	public WebDriver driver;
	
	Logger log = Logger.getLogger("SauceDemo10");
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void Setup(String BrowserName) throws IOException
	{
		if(BrowserName.equals("chrome"))
		{
	    System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe");
	    driver = new ChromeDriver();
//		System.out.println("Chrome Driver Opened");
	    
		PropertyConfigurator.configure("log4j.properties");
		log.info("Chrome Driver is Opened");
		}
		else
		{
			System.setProperty("webdriver.edge.driver",
 		   	"./DriverFiles\\msedgedriver.exe");
 		     driver= new EdgeDriver();
		 		
		}
		
		driver.manage().window().maximize();
		log.info("windows is maximized");
		
		// get method is used to open the url
		driver.get("https://www.saucedemo.com/");
		log.info("SD URL is opened");
		
		driver.manage().window().maximize();
		log.info("windows is maximized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	

 		// Login POM class elements + action performed
 		
 		POMLogin x= new POMLogin(driver);
 		
 		x.SendUserName();
 		log.info("Sent the user name");
 		
 		x.SendPassword();
 		log.info("Sent the password");
 		
 		x.Loginbutton();
 		log.info("Clicked on Login Button");
 		
 		ScreenShotClass.ScreenshotMethod(driver);
		}
		
	

	@AfterMethod
	public void teardown()
	{
		driver.quit();
		log.info("Browser is closed");
		
		log.info("End of Program");
		
	}

}
