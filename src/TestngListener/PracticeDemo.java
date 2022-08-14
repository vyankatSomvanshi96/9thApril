package TestngListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestngListener.Listener.class)  // only this line is added 

public class PracticeDemo {
  @Test
  public void myMethod() 
  {
	  Reporter.log("Tc is starts",true);
  }
  
  @Test
  public void myMethod1()
  {
	  Assert.fail();
	  Reporter.log("TC is starts",true);
  }
  
  @Test(dependsOnMethods = {"myMethod1"})
  public void myMethod2()
  {
	  Reporter.log("TC is starts",true);
  }
}
