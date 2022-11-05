package com.Test.Mavan_project;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public webDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new chromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
		driver.manage().timeouts().inplicitywait(10,TimeUnit,seconds);
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
		
}
