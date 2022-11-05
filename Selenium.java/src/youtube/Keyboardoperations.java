package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboardoperations {
	@Test
	//WebDriver driver;
	public void srearch() throws InterruptedException
	{
		WebDriver driver;
		String applicationUrlAddress="https://www.youtube.com";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		WebElement sreachElement=driver.findElement(By.name("search_query"));
		sreachElement.sendKeys("national antham");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
		
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
	}

}
