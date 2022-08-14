package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewFrame3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
        driver.switchTo().frame("courses-iframe");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();

	}

}
