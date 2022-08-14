package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartReview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Iphone 13");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		WebElement reviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		Thread.sleep(1000);
		System.out.println(reviews.getText());
		
		WebElement star = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[1]"));
		Thread.sleep(1000);
		System.out.println(star.getText());
		

	}

}
