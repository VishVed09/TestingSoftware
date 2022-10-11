package com.SauceDemo.utilityclass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass 
{
	
	public static void ScreenshotMethod(WebDriver driver) throws IOException 
	{
		Date d= new Date();
		
//		DateFormat d1= new SimpleDateFormat("MM-dd-yy" );
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & hh-mm-ss");

		String Date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File selefile = ts.getScreenshotAs(OutputType.FILE);
		
//		File myfile = new  File("./ScreenShot\\SSD"+Date+".jpg");
		
		File myfile = new File("./ScreenShot/ScreenshotImage"+ Date +".jpg");

		
		FileHandler.copy(selefile, myfile);	
	}

}
