package com.cs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private static final By LINK_ADMIN = By.xpath("(//a)[2]");
	
	public void clickAdmin()
	{
		driver.findElement(LINK_ADMIN).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
