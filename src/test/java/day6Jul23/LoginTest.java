package day6Jul23;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cs.pages.HomePage;
import com.cs.pages.LoginPage;

public class LoginTest {
		WebDriver driver;
	
		@BeforeMethod
		public void setUp()
		{
			driver = new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		
		@Test
		public void loginTest()
		{
			LoginPage loginPage = new LoginPage(driver);
			HomePage homePage = loginPage.loginToAppl("Admin", "admin123");
			homePage.clickAdmin();
		}
		
		@AfterMethod
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(4000l);
			driver.quit();
		}
}
