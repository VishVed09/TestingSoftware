package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.PomClass.LogoutPOM;
import com.SauceDemo.PomClass.POMLogin;
import com.SauceDemo.utilityclass.ScreenShotClass;


public class TC_04_VerifyAllPrdts extends TestBaseClass 
{
	@Test
	public void VerifyAllPrdts() throws IOException
	
	{
	 		POMLogin h=  new POMLogin(driver);
	 		
	 		h.allprdts();
	 		
//	 		ScreenShotClass.ScreenshotMethod(driver);
	 		ScreenShotClass.ScreenshotMethod(driver);
	 		
	 		String expectedproduct="6";
	 		String actualproduct= h.GetTextFromATC();	
	 		log.info(actualproduct);
	 		if(expectedproduct.equals(actualproduct))
	 		{
	 			log.info("pass");
	 		}
	 		else
	 		{
	 			log.info("fail");
	 		}
	  	    
	 
	}

}
