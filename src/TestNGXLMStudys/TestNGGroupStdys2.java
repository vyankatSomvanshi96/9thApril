package TestNGXLMStudys;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGroupStdys2 {
	
	
	@Test(groups = {"sanity"})
	  public void d() 
	  {
		  Reporter.log("a is running",true);
	  }
	  
	  @Test
	  public void e() 
	  {
		  Reporter.log("b is running",true);
	  }
	  
	  @Test(groups = {"Regression"})
	  public void f() 
	  {
		  Reporter.log("c is running",true);
	  }
}
