package day4jul23;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("H:/CSBatch4849Selenium/SeleniumBatch4849WorkSpace/CST5556SELENIUMMAVEN/src/test/java/day4jul23/config.properties");
	
		Properties prop = new Properties();
		prop.load(fis);
		
		String br = prop.getProperty("browser");
		System.out.println("br : " + br);
		
		String url = prop.getProperty("url");
		System.out.println("url : " + url + "**********");
		
		
		String URL = prop.getProperty("URL");
		System.out.println("URL : " + URL);
		
		System.out.println("age: "+  (Integer.parseInt(prop.getProperty("age"))   +10));
		
		String rc = prop.getProperty("responseCode");
		System.out.println("rc : " + rc);
		String[] arrRc = rc.split(",");
		System.out.println("rc[0] : " + (Integer.parseInt(arrRc[0])+100));
		System.out.println(Integer.parseInt(arrRc[1])+100);
		System.out.println(Integer.parseInt(arrRc[2])+100);
		
		System.out.println("name: " + prop.getProperty("name"));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
