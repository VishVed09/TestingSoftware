package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SauceDemo.utilityclass.ScreenShotClass;


public class Tc_01_VerifyLogin extends TestBaseClass 

{
	@Test
	public void VerifyLogin() throws IOException
	
	{
//	WebDriver driver;
	
//		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe\\");
//	 		
//	 		WebDriver driver = new ChromeDriver();
//	 		System.out.println("Chrome Driver Opened");
//	 		
//	 		driver.manage().window().maximize();
//	 		System.out.println("windows is maximized");
//	 		
//	 		// get method is used to open the url
//	 		driver.get("https://www.saucedemo.com/");
//	 		System.out.println("SD URL is opened");
//	 		
//	 		driver.manage().window().maximize();
//	 		System.out.println("windows is maximized");
//	 		
//	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	
	 		
	 		// Login POM class elements + action performed
	 		
//	 		POMLogin x= new POMLogin(driver);
//	 		
//	 		x.SendUserName();
//	 		System.out.println("Sent the user name");
//	 		
//	 		x.SendPassword();
//	 		System.out.println("Sent the password");
//	 		
//	 		x.Loginbutton();
//	 		System.out.println("Clicked on Login Button");
//	 		
//	 		ScreenShotClass.ScreenshotMethod(driver);
	 		// On Home Page
		
//		ScreenShotClass.ScreenshotMethod(driver);
		ScreenShotClass.ScreenshotMethod(driver);
	 		
		      log.info("Applying validations");
	 		
	 		String expectedTitle = "Swag Labs";
	 		
	 		String ActualTitle = driver.getTitle();
	 		
	 		if(ActualTitle.equals(expectedTitle))
	 		{
	 			log.info("Login TC is passed");
	 		}
	 		else
	 		{
	 			log.info("Login TC is Failed");
	 		}
	 		
//	 		driver.quit();
//	 		System.out.println("Browser is closed");
	 		
	 		
		
    

  }
}
