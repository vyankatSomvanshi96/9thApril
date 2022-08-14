package Iframe;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class FrameEx2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		  System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();

	        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
            Thread.sleep(500);
            
            driver.switchTo().frame("iframeResult"); // this point will change focus from main page to iframe

            
          // this element is present in I frame
	        driver.findElement(By.xpath("//button[contains(text(),'Date and Time.')]")).click();
	        
	        Thread.sleep(1000);
	        
	        // for taking ScreenShot
	        File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        File destination=new File("D:\\Automation Notes\\Selenium\\ScreenShot\\SnapS.png");
	        
	        
	        FileHandler.copy(srs, destination);
	        
	        
	        Thread.sleep(500);
	        String Dst = RandomString.make(3);
	        
	        File SRS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        File nwDST=new File("D:\\\\Automation Notes\\\\Selenium\\\\ScreenShot\\SnapShotNew"+Dst+".png");
	        
	        FileHandler.copy(SRS, nwDST);
	        
	        Thread.sleep(500);
	        driver.switchTo().defaultContent();
	        
	        driver.findElement(By.xpath("//a[contains(@class,'w3-button w3-bar-item')]")).click();
	        
	        
	}

}
