package TestngKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableStdy {
	
  @Test
  public void myMethod() 
  {
	  Reporter.log("My Method",true);
  }
  
  @Test(enabled = true)
  public void a()
  {
	  Reporter.log("a method",true);
  }
  
  @Test(enabled = false)
  public void b()
  {
	  Reporter.log("b Method",true);
	  
  }
  
}
