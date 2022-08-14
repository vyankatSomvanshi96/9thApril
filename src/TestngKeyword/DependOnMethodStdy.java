package TestngKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethodStdy {
	
	
  @Test(dependsOnMethods = {"b"})
  public void a() 
  {
	  Reporter.log("A method is running",true);
  }
  
  @Test(timeOut = 100)
  public void b() throws InterruptedException
  {
	  Reporter.log("B method is running",true);
	  Thread.sleep(50);
  }
  
  @Test()
  public void c()
  {
	  Reporter.log("C method is running",true);
  }
}
