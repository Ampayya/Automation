package identifythecurrentUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatethegoogleHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		String actual_googlehomepageurlAddress=driver.getCurrentUrl();
		System.out.println("the current actual url Address after lanching google home page is:"+actual_googlehomepageurlAddress);
		String expected_googlehomepageurlAddress="google.com";
		System.out.println("the expected url Address of google homepage is;"+expected_googlehomepageurlAddress);
		
		if(actual_googlehomepageurlAddress.contains(expected_googlehomepageurlAddress))
		{
			System.out.println("url matched-pass");
		}
		else
		{
			System.out.println("Url not matched-fail");
		}
		driver.close();

	}

}
