package TestngFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngCrossBrosing {
    
	@Parameters("browserName")
	
	@Test
  public void myMethod(String Bname) 
  {
		WebDriver driver=null;  // Declare driver here cause access over here
		
		if(Bname.equals("chrome"))
		{
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();
		}
		else if (Bname.equals("firefox")) 
		{
			
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
			
	        driver=new FirefoxDriver();
			
		}
		
		driver.get("https://kite.zerodha.com/");
  }
}
