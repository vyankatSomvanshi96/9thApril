package FindElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  // Handle Hidden div popup
		Thread.sleep(1000);
		
	//	driver.findElement(By.name("q")).sendKeys("Iphone");
		List<WebElement> links = driver.findElements(By.tagName("a"));
	
		System.out.println(links.size());

		for(WebElement vs:links)
		{
			System.out.println(vs.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
