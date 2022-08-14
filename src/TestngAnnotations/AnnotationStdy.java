package TestngAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationStdy {
  @Test
  public void myMethod() 
  {
	  Reporter.log("This is myMethod", true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("This is Before Method", true);
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("This is after Method", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("This is Before class", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("This is after class", true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("This is Before Test", true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("This is after Test", true);
  }

}
