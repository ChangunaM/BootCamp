package Changs1.Changs1_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragNdrop {
	
	  WebDriver driver;
	  
	  @Test
	  public void test() throws Exception {
	      System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
	      
	      driver = new ChromeDriver();    
	      driver.manage().window().maximize();
	      driver.get("https://jqueryui.com/droppable/");
	      Thread.sleep(5000);
	      
	      driver.switchTo().frame(0);
	      Actions action=new Actions(driver);
	      action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
	      
	      Thread.sleep(5000);
	      //driver.close();
	     // driver.quit();
  }
}
