package Changs1.Changs1_2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brokenlinks {
	  
	  WebDriver driver;
	  @Test
	  public void test() throws Exception {
	      
	      System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
	      
	      driver = new ChromeDriver();    
	      driver.manage().window().maximize();
	      driver.get("http://www.zlti.com");
	      Thread.sleep(2000);
	      
	      List<WebElement> linkslist=driver.findElements(By.tagName("a"));
	      System.out.println("size of all links :"+linkslist.size());
	     
	      List<WebElement> activelinks=new ArrayList<WebElement>();
	     
	      for(int i=0;i<linkslist.size();i++) {
	          if(linkslist.get(i).getAttribute("href")!=null) {
	              activelinks.add(linkslist.get(i));
	             
	          }
	          System.out.println("size of activelinks  :"+activelinks.size());
	      
	       }
	      
	      driver.quit();
  }
}
