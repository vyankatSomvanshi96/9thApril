package Iframe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class IframeStudy {

	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
     //   driver.switchTo().frame("courses-iframe");
        
    //    Thread.sleep(2000);
        
      //  driver.findElement(By.xpath("//a[text()='Home']")).click();
        
        
        
        driver.switchTo().frame("iframe-name");  // Use Id or Name
        Thread.sleep(1000);
        WebElement vks = driver.findElement(By.linkText("About us"));
        vks.click();
        
        Thread.sleep(1000);
        File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File ds=new File("D:\\Automation Notes\\Selenium\\ScreenShot\\snapss.png");
        
        FileHandler.copy(ss, ds);

	}

	
}
