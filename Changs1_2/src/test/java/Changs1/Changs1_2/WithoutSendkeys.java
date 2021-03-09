package Changs1.Changs1_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithoutSendkeys {
	    
	    WebDriver driver;
	    
	  @Test
	  public void f() throws Exception {
	      
		  System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
	      
	      driver = new ChromeDriver();    
	      driver.manage().window().maximize();
	      
	      
	      driver.get("https://www.facebook.com/");
	      Thread.sleep(2000);
	      
	      JavascriptExecutor javaexe=(JavascriptExecutor)driver;
	      WebElement username=driver.findElement(By.name("email"));
	      Thread.sleep(2000);
	      WebElement password=driver.findElement(By.name("pass"));
	      Thread.sleep(2000);
	      javaexe.executeScript("arguments[0].value='abcd'", username);
	      Thread.sleep(2000);
	      javaexe.executeScript("arguments[0].value='don@123'", password);
	      Thread.sleep(2000);
	      driver.findElement(By.name("login")).click();
	      Thread.sleep(2000);
	      
	      //driver.quit();
	  }
}
