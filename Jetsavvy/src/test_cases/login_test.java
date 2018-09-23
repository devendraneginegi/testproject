package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.application_page;
import POM.login_page;
import POM.welcome_page;

public class login_test {
	
	
	@Test
	public void login() throws InterruptedException
	{
	
	 System.setProperty("webdriver.chrome.driver", "D://Chrome driver//new chrome//chromedriver.exe");

		

	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://jetsetter:Jetsavvy!@demo.jetsavvy.com/home");
	  
	  Thread.sleep(2000);
	  
	  driver.manage().window().maximize();
	  
	  application_page.jetsetter(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  welcome_page.loginlink(driver).click();
	  //Thread.sleep(2000);
	  
	  login_page.id(driver).sendKeys("devendra.singh+3@quadrateglobal.com");
	  Thread.sleep(2000);
	  login_page.password(driver).sendKeys("Deepak@123");
	  Thread.sleep(2000);
	  login_page.login(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  driver.quit();
	  
	  
	}

}
