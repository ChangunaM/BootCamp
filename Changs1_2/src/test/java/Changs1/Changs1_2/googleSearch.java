package Changs1.Changs1_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleSearch {

		  WebDriver driver;
		  @Test
		  public void test() throws Exception {
		      
			  System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
		      
		      driver = new ChromeDriver();    
		      driver.manage().window().maximize();
		      driver.get("https://www.google.com");
		      Thread.sleep(2000);
		      driver.findElement(By.name("q")).sendKeys("EarPhones");
		      Thread.sleep(2000);
		      driver.findElement(By.name("btnK")).click();
		      Thread.sleep(2000);
		      
		      //driver.quit();
  }
}
