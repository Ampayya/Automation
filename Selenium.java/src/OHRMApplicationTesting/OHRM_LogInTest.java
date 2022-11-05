package OHRMApplicationTesting;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_LogInTest {
	public Logger logger;
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	//driver=new chromeDriver();
	//driver.get(applicationUrladdress);

	@BeforeTest
	public void setup()
	{
		//driver.get(applicationUrlAddress);
		
		PropertyConfigurator.configure("Log4j(1).properties");
		logger=Logger.getLogger(OHRM_LogInTest.class);
		System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(applicationUrlAddress);
		logger.info("successfully navigated to orangehrm application login page");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		logger.warn("chrome browser maximised");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void login() throws InterruptedException
	{
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.clear();
		username.sendKeys("Ampaiah_AP");
		logger.info("successfully enterd username");
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.clear();
		password.sendKeys("AP_9652@.com");
        logger.info("successfully enterd password");
        
        driver.findElement(By.id("btnLogin")).click();
        //logInButton.clear();
        logger.info("clicked on login button");
        WebElement welcomeAdminElement=driver.findElement(By.linkText("welcome Admin"));
        welcomeAdminElement.clear();
        logger.info("successfully clicked on welcome admin");
        
        Thread.sleep(10000);
        
        WebElement logout=driver.findElement(By.linkText("logout"));
        
        logout.clear();
        logger.info("successfilly logout from application");
	}
        
       /* @AfterTest
        public void tremdown()
        {
        	driver.quit();
        	logger.info("successfully closed chrome browser");
        }*/
        
	

}
