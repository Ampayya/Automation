package com.excel1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheet1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("./src/com/excel1/TimeandDate.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		String xpathExpressionpart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/[";
		String xpathExpressionpart2="36"
				+ "]/";
	    String xpathExpressionpart3="td[8]";		
        for(int i=1; i<=36; i++)
		{
        	for(int j=1; j<=8; j++)
        	{
        		WebElement webtableElement=driver.findElement(By.xpath(xpathExpressionpart1+i+xpathExpressionpart2+j+xpathExpressionpart3));
        		String webtableData=webtableElement.getText();
        		System.out.println(webtableData);
        	}
        	FileOutputStream file1=new FileOutputStream("./src/com/excel1/TimeandDate.xlsx");
        	workbook.write(file1);
			
		}
     
		
		

	}

	private static void String(Class<Integer> class1) {
		// TODO Auto-generated method stub
		
	}

}
