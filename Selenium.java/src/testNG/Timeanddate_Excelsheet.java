package testNG;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Timeanddate_Excelsheet {
	WebDriver driver;
	@BeforeTest
	public void applicationLaunch()
	{
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
	}
	 @AfterTest
	 public void applicationclose()
	 {
		 driver.close();
	 }
	
	
@Test
	public void capturingfirstRowoffirstCelldata() throws IOException
	{
		WebElement WebTable=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"
				));
		List<WebElement>rows=WebTable.findElements(By.tagName("tr"));
		int rowsCount=rows.size();
		System.out.println("The number of rows of the webtable are:"+rowsCount);
		
		FileInputStream file=new FileInputStream("./src/testNG/TimeandDate.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		for(int i=0; i<rowsCount; i++)
		{
			Row row=sheet.createRow(i);
			List<WebElement>cells=rows.get(i).findElements(By.tagName("td"));
			int cellsCount=cells.size();
			for(int j=0; j<cellsCount; j++)
			{
				String data=cells.get(j).getText();
				System.out.println(data+" ");
				Cell cell=row.createCell(j);
				cell.setCellValue(data);
			
			System.out.println();
			//FileOutputStream file1=new FileOutputStream("./src/testNG/TimeandDate.xlsx");
			//workbook.write(file1);
			}
		}
		FileOutputStream file1=new FileOutputStream("./src/testNG/TimeandDate.xlsx");
		workbook.write(file1);
	
		
	}

}
