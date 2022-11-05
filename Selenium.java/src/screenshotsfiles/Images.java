package screenshotsfiles;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
		File osmaniawebpage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(osmaniawebpage,new File("./Screenshot/img1.png"));
        System.out.println("screenshot saved successfully");
		driver.quit();
	}

}
