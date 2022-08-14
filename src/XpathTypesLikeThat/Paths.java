package XpathTypesLikeThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paths {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.co.in/");
        
        
     //   driver.findElement(By.linkText("Gmail")).click();
        
        driver.findElement(By.partialLinkText("Gma")).click();

	}

}
