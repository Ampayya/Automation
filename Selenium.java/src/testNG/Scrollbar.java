package testNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollbar {
	@Test
	public void ScrollbarHandiling()
	{
		WebDriver driver;
		String applicationUrlAddress="http://livetech.in";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTO(0,1200)");
		               //or
		// ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,900)");
		
	}

}
