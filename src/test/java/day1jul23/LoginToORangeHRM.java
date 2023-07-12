package day1jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToORangeHRM {

	WebDriver driver;
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[][] {
			{"Admin","admin123", true},  // pass
			{"admin","Admin123", false},  // fail
			{"Don","Admin123", false},  // fail
			{"Shakil","Admin123", false}  // fail
			
		};
		return data;
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@AfterMethod
	public void teadDown()
	{
		driver.quit();
	}
	
	@Test(dataProvider="getData")
	public void LoginToAppl(String username, String password, boolean result) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		if (result==true)
		{
			driver.findElement(By.xpath("//button[@role='none']")).click();
			WebElement imgElement = driver.findElement(By.xpath("//img[@alt='client brand logo']"));
			System.out.println("img displayed? " + imgElement.isDisplayed());
		// validation 
			Assert.assertTrue(imgElement.isDisplayed(),"Image did not display");
	
		} else 
		{
			String expInvalidMsg = "Invalid credentials";
			String actInvalidMsg = driver.findElement(By.xpath("(//h5/following-sibling::div//p)[1]")).getText();
			Assert.assertEquals(expInvalidMsg, actInvalidMsg, "Exp invalid message did not match with act invalid message");
			
			
		}
	}
}
