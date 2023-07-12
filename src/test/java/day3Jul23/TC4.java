package day3Jul23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC4 {

	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br)
	{
		System.out.println("browser : " + br);
		if (br.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (br.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if (br.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else
			throw new RuntimeException("Invalid browser : " +br);
	}
	
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://google.com");
		Thread.sleep(3000l);
		driver.quit();
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		driver.get("https://facebook.com");
		Thread.sleep(3000l);
		driver.quit();
	}	
}
