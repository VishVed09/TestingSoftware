package com.SauceDemo.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM
{
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement MenuButton;
	
	public void BMenubutton()
	{
		MenuButton.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement LogoutButton;
	
	public void Logout()
	{
		LogoutButton.click();
	}
	
	public LogoutPOM(WebDriver driver)
	{
		this.driver = driver;
//		driver=driver;
		
		PageFactory.initElements(driver,this);
	
	}
	
	
	
	

}
