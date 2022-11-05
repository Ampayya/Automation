package bingtitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleBing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles.chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://bing.com");
		
		Thread.sleep(10000);
		String bingHomepageTitle=driver.getTitle();
		System.out.println("The Title of the Bing HomePage is:"+bingHomepageTitle);
		
		driver.close();

	}

}
