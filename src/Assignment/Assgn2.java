package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn2 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement ss = driver.findElement(By.linkText("November 21, 2019"));
		Thread.sleep(1000);
		
		System.out.println(ss.getText());
		Thread.sleep(1000);
		// I have made the change
		driver.switchTo().frame("iframe_a");
		Thread.sleep(1000);
		
		WebElement v = driver.findElement(By.xpath("(//input[@id='td-header-search'])[2]"));
		Thread.sleep(1000);
		v.click();
		
		v.sendKeys("IPhone 12");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.switchTo().defaultContent();  // switch to frame into main frame
		Thread.sleep(500);
		
		driver.switchTo().frame("iframe_b");   // Switch main into frame
		Thread.sleep(500);
		
		
		WebElement clk = driver.findElement(By.xpath("//input[@class='suggestor-input ']"));
		Thread.sleep(1000);
		clk.click();
		clk.sendKeys("QA");
	//	driver.findElement(By.xpath("//div[text()='Jobs']")).click();
		
		
		
		
		
		
		
		
		
		


	}

}
