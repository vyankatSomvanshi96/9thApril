package TestNgPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void myMethod() 
  {
	  System.out.println("This is written in printing statement");
	  Reporter.log("This is written in report without boolen value");
	  Reporter.log("This is written in reporter with boolen value", true);
  }
  
  
}
