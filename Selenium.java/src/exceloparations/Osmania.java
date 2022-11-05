package exceloparations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Osmania {

	private static final File Screenshort = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.osmania.ac.in/");
		driver.manage().window().maximize();
		
		WebElement selectLanguagesDropDown=driver.findElement(By.id("gtranslate_selector"));
		List<WebElement>dropDownLanguages=(List<WebElement>) selectLanguagesDropDown.findElement(By.tagName("option"));
		
		int dropDownListLength=dropDownLanguages.size();
		System.out.println("The number of languages in the DropDown are:"+dropDownListLength);
		FileInputStream file=new FileInputStream("./Selenium.java/src/exceloparations/Microsoft Office Excel 2007.lnk");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		for(int i=0; i<dropDownListLength; i++)
		{
			String dropDownLanguage=dropDownLanguages.get(i).getText();
			System.out.println(i+""+dropDownLanguage);
		
		Row row=sheet.createRow(i);
		Cell cell=row.createCell(0);
		cell.setCellValue(dropDownLanguage);
		Select Selection=new Select (selectLanguagesDropDown);
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshort, new File("./osmaniauniversity/"+dropDownLanguage+".png") );
		FileOutputStream file1=new FileOutputStream("./src/exceloparations/OrangeHRM.xlsx");
		workbook.write(file1);
		
		//File Screenshot=((TakesScreenshot)driver).getSceernshotsAS(OutputType.FILE);
		File osmaniawebpage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,new File ("./Screenshotfiles/"+dropDownLanguage+".png"));
		//driver.quit();
		
		
		
	}}

}
