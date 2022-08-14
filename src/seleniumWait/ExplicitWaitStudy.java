package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/");
        
        WebElement check = driver.findElement(By.linkText("Courses"));
        
        WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(500));
        
        w.until(ExpectedConditions.elementToBeClickable(check));
        
        w.until(ExpectedConditions.visibilityOf(check));
        
        
	}

}
