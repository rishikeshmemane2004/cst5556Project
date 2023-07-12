package day5Jul23;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingExcel {

	static WebDriver driver;
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/testdata/OrangeHRMCredentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int maxRow = sheet.getLastRowNum();
		int maxCol = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[maxRow][maxCol];
		for(int r=1;r<=maxRow;r++)
		{
			for(int c=0;c<maxCol;c++)
				data[r-1][c] = sheet.getRow(r).getCell(c).getStringCellValue();
		}
		
		return data;
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void teadDown() throws InterruptedException
	{
		Thread.sleep(4000l);
		driver.quit();
	}
	
	
	@Test(dataProvider="getData")
	public void loginToappl(String username, String password, String result, String expResult)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		if (result.equals("true"))
		{
			String actText = driver.findElement(By.xpath("//h6")).getText();
		Assert.assertEquals(actText, expResult, "ACtual Text: " +actText + " does not match with exp text : " + expResult);	
		}
		else
		{
			String actErrorMsg = driver.findElement(By.xpath("(//h5/following-sibling::div//p)[1]")).getText();
			String  expErrorMsg = expResult;
			Assert.assertEquals(actErrorMsg , expErrorMsg, "Actual ErrorMsg : " +  actErrorMsg + " does not match with exp error Msg : " + expErrorMsg);
			
		}
	}
}
