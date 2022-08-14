package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingStdy {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
  //      WebElement sl = driver.findElement(By.xpath("//a[contains(text(),'Selenium Practice Now')]"));
               
      //typecast
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(1000);
  //      js.executeScript("arguments[0].scrollIntoView();",sl);
        
        //Using javascriptexcutor calling sendkey method
        
        WebElement vks = driver.findElement(By.id("autocomplete"));
        Thread.sleep(1000);
        
        js.executeScript("arguments[0].scrollIntoView();", vks);
        Thread.sleep(1000);
        
        vks.sendKeys("vyankat");
        
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  // Dynamic wait

	}

}
