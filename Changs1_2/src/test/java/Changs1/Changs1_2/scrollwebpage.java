package Changs1.Changs1_2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollwebpage {
	    WebDriver driver;
	  @Test
	  public void f() throws Exception {
	      System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
	      driver = new ChromeDriver();    
	      driver.manage().window().maximize();
	      driver.get("https://www.w3schools.com/python/");
	      Thread.sleep(2000);
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      
	      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	      Thread.sleep(2000);
	      js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	      Thread.sleep(2000);
	      
	      //driver.quit();
	      
	}
}
