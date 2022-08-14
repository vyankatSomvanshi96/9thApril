package PropertyKiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PropertyKiteUtility.NewUtility;

public class FailNewBase {

protected WebDriver driver;
	
	
	
	public void OpenBrowser() throws IOException
	{
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.get(NewUtility.readDatefromPropertyFile("URL"));  // giving url by using NewUtility class
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}
	
	public void getScreenShot(String TCID)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Automation Notes\\Selenium\\ScreenShot\\shot"+TCID+".png");
		
	}
}
