package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Capturingthecompletewebtabledata {
	//public void 
	
	WebDriver driver;
   @Test
   public void timeanddate_capturingfirstRowoffirstCelldata(){
	   String applicationUrlAddress="https://www.timeanddate.com/wordclock/";
	   System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver");
	   driver=new ChromeDriver();
	   driver.get(applicationUrlAddress);
	   driver.manage().window().maximize();
   
   
	   String xpathExpressionpart1="/html/body/div[5]/section[1]/div/section/div[1]/div"+"/table/tbody/tr[";
	   String xpathExpressionpart2="]/td[";
	   String xpathExpressionpart3="]";
	   
	   for(int i=1; i<=36; i++)
	   {
		   for(int j=1; j<=8; j++)
		   {
		   WebElement webTableElement=driver.findElement(By.xpath(xpathExpressionpart1+i+xpathExpressionpart2+j+xpathExpressionpart3));
		   String webTableData=webTableElement.getText();
		   System.out.println(webTableData+" ");;
		   
	   }
   }
   }}
