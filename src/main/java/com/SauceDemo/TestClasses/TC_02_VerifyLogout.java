package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.PomClass.LogoutPOM;
import com.SauceDemo.utilityclass.ScreenShotClass;


public class TC_02_VerifyLogout extends TestBaseClass 
{
	@Test
	public void VerifyLogout() throws IOException
	{
	 		// Creating pbject of Logout POM
	 		LogoutPOM v = new LogoutPOM(driver);
	 		
	 		v.BMenubutton();
	 		
	 		v.Logout();
	 		
	 		ScreenShotClass.ScreenshotMethod(driver);
	 		
//	 		Thread.sleep(2000);
	 		
	 		log.info("Applying validations");
	 		
	 		String expectedTitle = "Swag Labs";
	 		
	 		String ActualTitle = driver.getTitle();
	 		
	 		if(ActualTitle.equals(expectedTitle))
	 		{
	 			log.info("Logout TC is passed");
	 		}
	 		else
	 		{
	 			log.info("Logout TC is Failed");
	 		}
	 		
		
	}

}
