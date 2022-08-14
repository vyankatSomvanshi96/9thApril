package TestngAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InnvocationCountStudy {
	
	// If I want to print 4th time 
	
  @Test(invocationCount = 4)
  public void myMethod()
  {
	  Reporter.log("This is myMethod", true);
  }
}
