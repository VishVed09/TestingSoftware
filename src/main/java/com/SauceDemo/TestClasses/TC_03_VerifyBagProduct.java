package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.PomClass.POMLogin;
import com.SauceDemo.utilityclass.ScreenShotClass;


public class TC_03_VerifyBagProduct extends TestBaseClass 
{
	@Test
	public void VerifyBagPrdt() throws IOException
	{
 		POMLogin z= new POMLogin(driver);
 		
 	    z.Backpack();
 	    
// 	   ScreenShotClass.ScreenshotMethod(driver);
 	    ScreenShotClass.ScreenshotMethod(driver);
 	    
 	    String expectedproduct="1";
		String actualproduct= z.GetTextFromATC();	
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
