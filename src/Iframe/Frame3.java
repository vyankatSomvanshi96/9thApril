package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/selenium/practice.html");
        
        driver.switchTo().frame("courses-iframe");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
  	}
}
