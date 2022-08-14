package TestngKeyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultikeywordsStdy {
	
	
  @Test(dependsOnMethods = {"b"}, invocationCount = 2)
  public void a() 
  {
	    Reporter.log("A is running",true);
  }
  
  @Test(timeOut = 50)
  public void b() 
  {
	    Reporter.log("B is running",true);
	 //   Thread.sleep(20);
  }
  
  @Test(priority = -1)
  public void c() 
  {
	    Reporter.log("C is running",true);
  }
}
