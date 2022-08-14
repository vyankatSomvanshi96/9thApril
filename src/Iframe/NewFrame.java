package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewFrame {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        Thread.sleep(1000);
        
        driver.switchTo().frame("iframeResult");
        
        WebElement text = driver.findElement(By.xpath("//h2[text()='My First JavaScript']"));
        System.out.println(text.getText());
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Date and Time.')]")).click();
        

	}

}
