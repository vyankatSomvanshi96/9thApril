package PropertyKiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PropertyKiteUtility.NewUtility;

public class NewBase 
{
	
	
	
	protected WebDriver driver;
	
	
	
	public void OpenBrowser() throws IOException
	{
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.get(NewUtility.readDatefromPropertyFile("URL"));  // giving url by using NewUtility class
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}
	
	
	
	
	

}
