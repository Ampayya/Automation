package excelsheet;

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
import org.openqa.selenium.interactions.Actions;

public class Excelorangehrm {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//readxlsxfile("./src/excelsheet/OrangeHRM.xlsx");
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("./src/excelsheet/OrangeHRM.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.createCell(0);
		
		//LOGIN Panel Text Validation
		String Expected_text=cell.getStringCellValue();
		WebElement LoginPaneltext=driver.findElement(By.id("logInPanelHeading"));
		String Actual_text=LoginPaneltext.getText();
		Cell cell1=row.createCell(1);
		cell1.setCellValue(Actual_text);
		
		Cell cell2=row.createCell(2);
		if(Actual_text.equals(Expected_text))
			cell2.setCellValue("pass");
			//System.out.println("Text is matched - Pass");
		else
			cell2.setCellValue("fail");
			//System.out.println("Text is not matched - Fail");
		
		FileOutputStream file1=new FileOutputStream("./src/excelsheet/OrangeHRM.xlsx");
		workbook.write(file1);
	
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Ampaiah_AP");
		driver.findElement(By.id("txtPassword")).sendKeys("AP_9652@.com");
		driver.findElement(By.name("Submit")).click();
		
		WebElement PIMElement=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions act=new Actions(driver);
	    act.moveToElement(PIMElement).perform();
	    WebElement addEmployeeElement=driver.findElement(By.linkText("Add Employee"));
	    addEmployeeElement.click();
	    
	    driver.findElement(By.id("firstName")).sendKeys("Kurva");
	    driver.findElement(By.id("middleName")).sendKeys("Ampaiah");
	    driver.findElement(By.id("lastName")).sendKeys("Kumar");
	    
	    FileInputStream file3=new FileInputStream("./src/excelsheet/OrangeHRM.xlsx");
		XSSFWorkbook workbook3=new XSSFWorkbook(file3);
		XSSFSheet sheet3=workbook3.getSheet("sheet1");
		Row row3=sheet3.getRow(20);
		Cell cell3=row3.createCell(0);
		String Expected_text1=cell3.getStringCellValue();
		
	    WebElement defualtemployeeid=driver.findElement(By.id("employeeId"));
	    String employeeidvaluebeforeadd=defualtemployeeid.getAttribute("value");
	    System.out.println(employeeidvaluebeforeadd);
	    WebElement SaveButton=driver.findElement(By.id("btnSave"));
	    SaveButton.click();
	    
	    String Expected_Text="Kurva";
	    WebElement firstname=driver.findElement(By.id("personal_txtEmpFirstName"));
	    String Actual_Text=firstname.getAttribute("value");
	    Cell cell4=row.createCell(1);
	    cell4.setCellValue(Actual_Text);
	    
	    Cell cell5=row.createCell(2);
	    if(Actual_Text.equals(Expected_Text))
	    	cell5.setCellValue("pass");
	       //System.out.println("text is matched-pass");
	    	
	    else
	    	cell5.setCellValue("fail");
	    	//System.out.println("text is not matched-fail");
	    
	    FileOutputStream file5=new FileOutputStream("./src/excelsheet/OrangeHRM.xlsx");
	    workbook.write(file5);
	    
	    String Expected_Txt="Ampaiah";
	    WebElement middlename=driver.findElement(By.id("personal_txtEmpMiddleName"));
	    String Actual_Txt=middlename.getAttribute("value");
	    
	    if(Actual_Txt.equals(Expected_Txt))
	    	System.out.println("Test is matched-pass");
	    else
	    	System.out.println("Test is not matched-fail");
	    
	    String Expected_Tx="Kumar";
	    WebElement lastname=driver.findElement(By.id("personal_txtEmpLastName"));
	    String Actual_Tx=lastname.getAttribute("value");
	    
	    if(Actual_Tx.equals(Expected_Tx))
	    	System.out.println("Test is matched-pass");
	    else
	    	System.out.println("Test is not matched-fail");
	    
	 
	    WebElement employeeid=driver.findElement(By.id("personal_txtEmployeeId"));
	    String Actual_tx=employeeid.getAttribute("value");
	    
	    if(Actual_tx.equals(employeeidvaluebeforeadd))
	    	System.out.println("Test is matched-pass");
	    else
	    	System.out.println("Test is not matched-fail");
	    
	    
	
	
	}

	private static void FileInputStrem(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void readxlsxfile(String string) {
		// TODO Auto-generated method stub
		
	}

}
