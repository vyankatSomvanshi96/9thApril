import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class GoogleLogo {

	public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
   //     ChromeOptions opt=new ChromeOptions();
        
  //      opt.addArguments("--disable-notification");
        
		WebDriver driver=new ChromeDriver();  // need to pass opt argument in chromedriver if we use chromeOptions
		
		driver.get("https://www.google.com/");
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));
				
		File screenShot = logo.getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(2);
		
		File dest=new File("D:\\Automation Notes\\Selenium\\selenium Arch\\Google"+random+".png");
		
		FileHandler.copy(screenShot, dest);
		

	}

}
