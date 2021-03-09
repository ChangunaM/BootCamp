package Changs1.Changs1_2;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentPin {
	WebDriver driver;
  @Test
  public void f() throws Exception {
      System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
      driver = new ChromeDriver();        
      driver.manage().window().maximize();
      driver.get("https://chennaiiq.com/chennai/pincode-by-name.php");
      driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
      
      WebElement pintable=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]"));
      
      List<WebElement> row=pintable.findElements(By.tagName("tr"));
      for(int i=3;i<=8;i++)
      {
          List<WebElement> col=row.get(i).findElements(By.tagName("td"));
          String pinA=col.get(2).getText();
         
          for(int j=i;j<8;j++)
          {
              List<WebElement> colNew=row.get(j).findElements(By.tagName("td"));
              String pinB=colNew.get(2).getText();
              System.out.println(pinA);
              System.out.println(pinB);
              Assert.assertFalse(pinA==pinB);
              System.out.println("success");
            
          }
          System.out.println("success2");
      
     }
      driver.close();
  	}
}
