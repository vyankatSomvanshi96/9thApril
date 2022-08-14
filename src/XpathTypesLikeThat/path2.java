package XpathTypesLikeThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class path2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/selenium/practice.html");
        
        
        WebElement MultiS = driver.findElement(By.id("dropdown-class-example"));
        
        
       System.out.println(MultiS.isEnabled());
        
        Select MS=new Select(MultiS);
        
        System.out.println(MS.isMultiple());

	}

}
