package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStdy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/");
        
        // Syntax for Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        
        
        
        
        
        
        
        
	}

}
