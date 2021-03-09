package Changs1.Changs1_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	
   @Test
   public void f() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
	      
	      driver = new ChromeDriver();    
	      driver.manage().window().maximize();
	      driver.get("https://google.com");
	      Thread.sleep(2000);
   }
   
}
