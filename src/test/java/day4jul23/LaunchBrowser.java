package day4jul23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	static WebDriver browserLaunch(String browser, WebDriver driver)
	{
		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if (browser.equalsIgnoreCase("Firefox"))
			driver = new FirefoxDriver();
		else 
			throw new RuntimeException("Invalid Browser: " + browser);
		
		return driver;
	}
	
	public static void main(String[] args) {
		String browser = "CHROME";
		WebDriver driver=null;
	 
		
		driver = browserLaunch(browser, driver);
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		System.out.println("title : " + driver.getTitle());
		
	}
	
}
