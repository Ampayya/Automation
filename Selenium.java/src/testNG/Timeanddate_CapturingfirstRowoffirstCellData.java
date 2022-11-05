package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Timeanddate_CapturingfirstRowoffirstCellData{ 
public void CapturingfirstRowoffirstCellData() {	
	
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	WebElement firstrowoffirstcell_Element=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
	String firstRowofCell_data=firstrowoffirstcell_Element.getText();
	System.out.println("The text of the first row of first cell value is:"+firstRowofCell_data);
	
	driver.quit();

}
}
