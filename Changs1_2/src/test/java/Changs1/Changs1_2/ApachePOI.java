package Changs1.Changs1_2;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApachePOI {
	WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\BootCamp\\chromedriver.exe");
		     
	      driver = new ChromeDriver();   
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
	  
	  @Test
	  public void f() throws Exception {
	      String path= "C:\\BootCamp\\book1.xlsx";
	      FileInputStream fs= new FileInputStream(path);
	      
	     
	      @SuppressWarnings("resource")
	      XSSFWorkbook wb = new XSSFWorkbook(fs);
	      XSSFSheet sheet = wb.getSheet("Sheet1");
	      int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	     
	      for (int i=1; i<=rowcount; i++) {
	          String username=sheet.getRow(i).getCell(0).getStringCellValue();
	          String password= sheet.getRow(i).getCell(1).getStringCellValue();
	          System.out.println(username +"   " + password);
	      }
	      
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
}

