package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingSimple {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();

	        driver.get("https://vctcpune.com/");
		        
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	        js.executeScript("window.scrollBy(100, 100)");
	        Thread.sleep(1000);
	        
	        js.executeScript("window.scrollBy(0, -300)");
	        
	        

	}

}
