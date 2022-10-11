package com.SauceDemo.PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMLogin 
{
	//1.Declaring WebDriver Globally
	
	WebDriver driver;
	private Select s;
	
	//2.Finding the elements wth of find by annotations
	//A.
	@FindBy(xpath="//input[@id='user-name']")
	WebElement UserName;
	
	//3. Creating method as per above ele
	// and adding action into it
	
	public void SendUserName()
	{
		UserName.sendKeys("standard_user");
	}
	
	//B.
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	public void SendPassword()
	{
		Password.sendKeys("secret_sauce");
	}
	
	//C.
	@FindBy(xpath="//input[@id='login-button']")
	WebElement LoginButton;
	
	public void Loginbutton()
	{
		LoginButton.click();	
	}
	
	
	
	//D.DropDown
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement DropDown;
	
	public void ClickDDFilter()
	{
		DropDown.click();
		Select s = new Select(DropDown);
		s.selectByValue("lohi");
	
		
	}
	
	//E.ATC
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	WebElement BackPack;
	
	public void Backpack()
	{
		BackPack.click();
	}
	////span[text()='1']
	//a[@class='shopping_cart_link']
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	WebElement ATCNO;

	public String GetTextFromATC()
	{
//		BackPack.click();
		String totalproduct= ATCNO.getText();
		return totalproduct;
//		ATCButton.click();
	}
	
	//F.AllPrdts
	@FindBy(xpath="//button[text()='Add to cart']")
	public List<WebElement> allprdts ;
	
	public void allprdts()
	{
		for(WebElement x:allprdts )
		{
			x.click();
		}
	}
	
	
	//4. creating constructor
	
	public POMLogin(WebDriver driver)
	{
		//Global      //local
//		this.driver =driver;
		
	this.driver=driver;
		
		//Sele class
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	

}
