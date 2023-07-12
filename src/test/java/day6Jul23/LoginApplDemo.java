package day6Jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginApplDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
/*		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-main-menu-search']//button")));
		System.out.println("**************");
	//	ele.click();
		System.out.println("-----------------");
*/		
		
		boolean actLogoDisplayed = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assert.assertTrue(actLogoDisplayed," Logo not displayed, or application did not login!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
