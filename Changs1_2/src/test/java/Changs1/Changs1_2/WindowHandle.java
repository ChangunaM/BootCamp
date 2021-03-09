package Changs1.Changs1_2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\BootCamp\\chromedriver.exe");
	     
      driver = new ChromeDriver();   
      driver.manage().window().maximize();
      driver.get("http://demo.automationtesting.in/Windows.html");
      Thread.sleep(2000);
      String title=driver.getTitle();
      System.out.println("Title of main window :"+title);
      WebElement tablebutton=driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
      tablebutton.click();
      Thread.sleep(4000);
  
      Set<String> windowid=driver.getWindowHandles();
      Iterator<String> iterator=windowid.iterator();
      String firstwindow=iterator.next();
      String child=iterator.next();
      driver.switchTo().window(child);
      System.out.println("Title of the child window :"+driver.getTitle());
   
      driver.close();
      driver.switchTo().window(firstwindow);
      System.out.println("Main window title :"+driver.getTitle());
      
      //driver.quit();
  }
}
