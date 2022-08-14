package TestngFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxStdy {
  
	@Test
  public void f() 	
  {
        System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
		
        WebDriver driver=new FirefoxDriver();
        
        driver.get("https://kite.zerodha.com/");
  }
}
