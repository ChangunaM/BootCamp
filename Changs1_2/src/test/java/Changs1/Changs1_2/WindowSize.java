package Changs1.Changs1_2;

import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
	WebDriver driver;

	  @Test
	  public void f() throws Exception {
	      System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
	      driver = new ChromeDriver();    
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com");
	      
	      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      Thread.sleep(8000);
	      System.out.println(driver.manage().window().getSize());
	      
	      //Change the Size of Browser
	      Dimension dm = new Dimension(1000,400);
	      driver.manage().window().setSize(dm);
	      Thread.sleep(8000);
	      
	      driver.quit();
	     
	      
	  }

}
