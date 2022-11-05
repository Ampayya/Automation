package osmania_screenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Languages_screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.osmania.ac.in/");
		
		WebElement selectLanguagesDropDown=driver.findElement(By.id("gtranslate_selector"));
		List<WebElement>dropDownLanguages=(List<WebElement>) selectLanguagesDropDown.findElement(By.tagName("option"));
		int dropDownListLength=dropDownLanguages.size();
		for(int i=0; i<dropDownListLength; i++)
		{
			
			String dropDownLanguage=dropDownLanguages.get(i).getText();
			System.out.println(i+""+dropDownLanguage);
			
		//Thread.sleep(5000);
		
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File("./Screenshotsfiles/"+dropDownLanguage+".png"));
		
		//driver.quit();
		

		}}
	

}
