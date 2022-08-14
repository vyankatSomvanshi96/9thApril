package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
    System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(500);
        
        driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]")).click();
        
        File vks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File snap=new File("D:\\Automation Notes\\Selenium\\ScreenShot\\Snap.png");
        
        FileHandler.copy(vks, snap);  // use selenium filehandler
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
