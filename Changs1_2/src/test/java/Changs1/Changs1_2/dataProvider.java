package Changs1.Changs1_2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	    
	@Test(dataProvider = "credentials")
	  public void f(String username,String password) {
	      System.out.println(username);
	      System.out.println(password);
	  }
	    @DataProvider(name="credentials")
	    public Object[][]getData() {
	        Object[][] data = new Object[2][2];
	        data[0][0]="changuna";
	        data[0][1]="578";
	        data[1][0]="changs";
	        data[1][1]="123";
	        return data; 
	      }
	
}
