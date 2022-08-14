package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Scrren2 {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        
        File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        String random = RandomString.make(3);
        System.out.println(random);
        File name=new File("D:\\Automation Notes\\Selenium\\ScreenShot\\SnapShot123"+random+".png");
        
        FileHandler.copy(srs, name);
	}

}
