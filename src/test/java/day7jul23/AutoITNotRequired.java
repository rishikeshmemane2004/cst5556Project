package day7jul23;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoITNotRequired {
	public static void main(String[] args) 	throws IOException, InterruptedException {

		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		// When tag is input and type=file then one can sendkey with filename (non eed make use of Autoit or sikuli or winium)
		
		Thread.sleep(4000l);
		
		driver.findElement(By.xpath("//*[@id='file-upload']"))
		.sendKeys("H:\\CSBatch4849Selenium\\SeleniumBatch4849WorkSpace\\CST5556SELENIUMMAVEN\\src\\test\\java\\day7jul23\\FileUploadScript.exe");
		Thread.sleep(4000l);
		
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		
		String actMsg = driver.findElement(By.xpath("//h3")).getText();
		Assert.assertEquals(actMsg, "File Uploaded!", "File did not upload !");
		
	 	Thread.sleep(4000l);
	 	driver.quit();
	}
}
