package validatetobing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateToBingHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./DriverFiles.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		/*WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles.chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://bing.com");
        driver.manage().window().maximize();
        */
        String actual_binghomepageTitle=driver.getTitle();
        System.out.println("The actual Title of the bing homepage is:"+actual_binghomepageTitle);
        
        String expected_binghomepagetitle="Bing";
        System.out.println("The expected Title of the bing hompage is:"+expected_binghomepagetitle);
        
        if(actual_binghomepageTitle.equals(expected_binghomepagetitle))
        {
        	System.out.println("Title matched-pass");
        }
        else
        {
        	System.out.println("Title not matched-fail");
        }
        driver.close();
	}

}
