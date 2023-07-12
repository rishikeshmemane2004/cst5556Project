package day4jul23;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser3 {
	static WebDriver driver;
	
	static WebDriver browserLaunch(String browser)
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
	
	static Properties readPropertyFile() throws IOException
	{
		FileInputStream fis = new FileInputStream("H:/CSBatch4849Selenium\\SeleniumBatch4849WorkSpace\\CST5556SELENIUMMAVEN\\src/test\\java\\day4jul23\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
	
	public static void main(String[] args) throws IOException 
	{
		Properties prop = readPropertyFile();
		
		driver = browserLaunch(prop.getProperty("browser"));
		
		launchUrl();
		
		System.out.println("title : " + driver.getTitle());
		
	}

	private static void launchUrl() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
}






