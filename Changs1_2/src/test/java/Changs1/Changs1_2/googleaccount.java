package Changs1.Changs1_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class googleaccount {
	WebDriver driver;
	
	@Test
	public void f() throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\BootCamp\\chromedriver.exe");
	     
     driver = new ChromeDriver();   
     driver.manage().window().maximize();
     driver.get("https://accounts.google.com/signup");
     Thread.sleep(2000);
     driver.findElement(By.id("firstName")).sendKeys("Saurabh");
     System.out.println(driver.findElement(By.id("firstName")).getAttribute("value"));
     Thread.sleep(2000);
     driver.findElement(By.id("lastName")).sendKeys("Gavekar");
     System.out.println(driver.findElement(By.id("lastName")).getAttribute("value"));
     Thread.sleep(2000);
     driver.findElement(By.id("username")).sendKeys("SSGavekar97");
     System.out.println(driver.findElement(By.id("username")).getAttribute("value"));
     Thread.sleep(2000);
     driver.findElement(By.name("Passwd")).sendKeys("Gavekar@97");
     System.out.println(driver.findElement(By.name("Passwd")).getAttribute("value"));
     Thread.sleep(2000);
     driver.findElement(By.name("ConfirmPasswd")).sendKeys("Gavekar@97");
     System.out.println( driver.findElement(By.name("ConfirmPasswd")).getAttribute("value"));
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[2]")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("phoneNumberId")).sendKeys("8123775633");
     System.out.println(driver.findElement(By.id("phoneNumberId")).getAttribute("value"));
     Thread.sleep(2000);
     
     //driver.quit();


	}
	  
	  
}


	  
