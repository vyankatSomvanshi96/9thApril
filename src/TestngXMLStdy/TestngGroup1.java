package TestngXMLStdy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngGroup1 {
	@Test
	  public void a() 
	  {
		  Reporter.log("a is running",true);
	  }
	  
	  @Test
	  public void b() 
	  {
		  Assert.fail();
		  Reporter.log("b is running",true);
	  }
	  
	  @Test
	  public void c() 
	  {
		  Reporter.log("c is running",true);
	  }
	  
	  @Test
	  public void d() 
	  {
		  Reporter.log("d is running",true);
	  }
}
