package Changs1.Changs1_2;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;

 

public class Properties1{
    Properties Prop;
    FileInputStream fs;
    
    @Test
    public void test() throws Exception {
      fs= new FileInputStream(System.getProperty("user.dir") + "/src/test/java/Config.Properties");
      Prop= new Properties();
      Prop.load(fs);
      
      System.out.println(Prop.getProperty("Name"));
      System.out.println(Prop.getProperty("URL"));
      System.out.println(Prop.getProperty("browser"));
  }

 

}









