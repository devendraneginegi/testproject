package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_page {

	
	
	////*[@class='mat-button-wrapper']//following::span[4]
	
	
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement id(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@type='email']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	 
	    }
	
public static WebElement password(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@type='password']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	 
	    }

public static WebElement login(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@type='email']//following::span[7]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    return element;
  
 
    }
	
}
