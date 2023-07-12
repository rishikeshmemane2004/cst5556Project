package day5Jul23;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadingFileDemo {
// apache poi: to read/write excel file
	
	@Test
	public void readExcel() throws IOException
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
		
		String sheetName = "EmpInfo";
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet       = workbook.getSheet(sheetName);
		
		int maxRow = sheet.getLastRowNum(); // 5 (0-5)
		int maxCol = sheet.getRow(0).getLastCellNum();  // 5 (1-5)
		
		System.out.println("row : " + maxRow);
		System.out.println("col : " + maxCol);
		String val = "";
		// row starts with 0
		// col starts with 0
		for(int r=1;r<=maxRow;r++)  // row
		{
			for(int c=0;c<maxCol;c++)  // col
			{
				val = sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.print(String.format("%-15s", val));
			}
			System.out.println();
		}
	}
}
