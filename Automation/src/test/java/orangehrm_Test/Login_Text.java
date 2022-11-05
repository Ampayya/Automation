package orangehrm_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import orangeHRM.OHRM_LoginTest;

public class Login_Text extends OHRM_LoginTest{
	@Test
	public void OHRM_logInTest()
	{
		
		WebElement usernameElement=driver.findElement(By.id("txtUsername"));
		//System.out.println("identified UserName");
		usernameElement.sendKeys("Ampaiah_AP");
		
		WebElement passwordElement=driver.findElement(By.id("txtPassword"));
		passwordElement.sendKeys("AP_9652@.com");
		
		WebElement loginElement=driver.findElement(By.id("btnLogin"));
		loginElement.click();
		
		WebElement welcomeElement=driver.findElement(By.id("welcome"));
		welcomeElement.click();
		
		WebElement logoutElement=driver.findElement(By.linkText("Logout"));
		logoutElement.click();
		
		//driver.close();
		
		
	}

}
