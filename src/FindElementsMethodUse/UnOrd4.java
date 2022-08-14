package FindElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrd4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("mahin");
		Thread.sleep(1000);
		List<WebElement> txt = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		
		System.out.println(txt.size());
		
		
		
		
		
		
		
		
		
		
		

	}

}
