package Changs1.Changs1_2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

 

public class ExtentReport {
	 ExtentHtmlReporter reporter;
	 ExtentReports extent;
	 
 	  
	  @BeforeSuite
	  public void setup() {
		  reporter = new ExtentHtmlReporter("extent.html");
	      
	      extent = new ExtentReports();
	      extent.attachReporter(reporter);

		  
	  }
	  
	  @AfterSuite
	  public void teardown() {
		  extent.flush();
	  }
	  
	  @Test
	  public void test1() {
		  ExtentTest logger= extent.createTest("Logintest");
	      logger.log(Status.INFO, "Login to Facebook");
	      logger.info("This step show the usage of info");
	      logger.pass("details");
	      logger.fail("details");
	  }
      
}
