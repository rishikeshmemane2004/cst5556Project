package com.cs.pages;

import javax.swing.UIClientPropertyKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
//step#1: constructor creation
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
//step#2 define all required locators 	
	//locators
	private static final By TXT_USERNAME = By.name("username");
	private static final By TXT_PASSWORD = By.name("password");
	private static final By BTN_LOGIN    = By.xpath("//button[@type='submit']");
	
//step#3 define all required methods

	// method  for username
	public LoginPage enterUserName(String val)
	{
		driver.findElement(TXT_USERNAME).sendKeys(val);
		return this;    // new LoginPage(driver)
	}
	
	// method  for password
	public LoginPage enterPassword(String val)
	{
		driver.findElement(TXT_PASSWORD).sendKeys(val);
		return this;      // this returns current class object
	}
	
	// method  for Login button
	public HomePage clickLoginBtn()
	{
		driver.findElement(BTN_LOGIN).click();
		return new HomePage(driver);
	}
	
	public HomePage loginToAppl(String userName, String password)
	{
		return enterUserName(userName)
		  .enterPassword(password)
		  .clickLoginBtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
