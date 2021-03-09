package Changs1.Changs1_2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Screenshot {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
      
      driver = new ChromeDriver();    
      driver.get("https://api.jquery.com/dblclick/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
      
      //Thread.sleep(3000);
      
      TakesScreenshot ss = ((TakesScreenshot)driver);
      File f1 = ss.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(f1, new File("C://BootCamp/img.png"));
      
      driver.close();
      
	  
  }
}
