package facebookLF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class loginFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		String expected_Title="facebook";
		String actual_Title=driver.getTitle();
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("facebook login page-pass");
		}
		else
		{
			System.out.println("failed to navigate to facebook login page-fail");
		}
		driver.findElement(By.id("email")).sendKeys("ampaiah AP");
		driver.findElement(By.id("pass")).sendKeys("9652422442");
		driver.findElement(By.id("login")).click();
		
		
		

	}

}
