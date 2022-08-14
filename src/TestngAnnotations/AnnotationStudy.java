package TestngAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
	
  @Test
  public void myMethod() 
  {
	  Reporter.log("This is myMethod",true);
  }
  
  @BeforeMethod
  public void BeforeMethod()
  {
	  Reporter.log("This is before method",true);
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("This is after method",true);
  }
  
  @Test
  public void MyTest()
  {
	  Reporter.log("My test method");
  }
}
