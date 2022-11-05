package rediff_register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Username_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		//WebElement username=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"));
		//username.sendKeys("Testing");
		
		//WebElement fullname=driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
		WebElement fullname=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"));
		fullname.sendKeys("selenium");
		
		
		

	}

}
