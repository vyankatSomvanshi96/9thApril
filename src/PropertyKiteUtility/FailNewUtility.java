package PropertyKiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;

public class FailNewUtility {

	public static String readDatefromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();  // Create object for property class
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\SeleniumSty\\myProperty.properties");  // created object of properties class

		prop.load(myFile);  // loaded the file
		
		String value = prop.getProperty(key);  
		return value;
	}
	
	
//	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException
//	{
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File dest =new File("D:\\Automation Notes\\Selenium\\ScreenShot\\shot"+TCID+".png");
//		
//		FileHandler.copy(src, dest);
//	}
	
	public static Timeouts WaitTime(WebDriver driver, int wait)
	{
		Timeouts time = driver.manage().timeouts().implicitlyWait(Duration.ofMillis(wait));
		return time;
	}
}
