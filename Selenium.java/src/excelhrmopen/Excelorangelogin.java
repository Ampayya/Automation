package excelhrmopen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelorangelogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("./src/excelhrmopen/LoginOrange.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		//LOGIN Panel Text Validation
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
	String Expected_text=cell.getStringCellValue();

		
		WebElement LoginPaneltext=driver.findElement(By.id("logInPanelHeading"));
		String Actual_text=LoginPaneltext.getText();
		Cell cell1=row.createCell(1);
		cell1.setCellValue(Actual_text);
		
		
		Cell cell2=row.createCell(2);
		if(Actual_text.equals(Expected_text))
		cell2.setCellValue("Pass");
		else
			cell2.setCellValue("Fail");
		
		
FileOutputStream file1=new FileOutputStream("./src/excelhrmopen/LoginOrange.xlsx");
workbook.write(file1);
	}

}
