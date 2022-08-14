package WebElemnets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vyankat2013@");
		Thread.sleep(50);
	
		//	driver.findElement(By.xpath("//input[@name='email']")).clear();

		
		WebElement clicking = driver.findElement(By.xpath("//input[@id='pass']"));  // Store in variable because I can use multiple times
		Thread.sleep(50);
		
		clicking.click();
		
		clicking.sendKeys("969696vs");
		
		
		
		WebElement Getext = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
		
	//	Getext.getText();
		System.out.println(Getext.getText());
		
		
		Thread.sleep(100);
		// driver.findElement(By.xpath("//button[@id='u_0_d_U1']")).isEnabled();
		 WebElement Enable = driver.findElement(By.xpath("//button[@id='u_0_d_U1']"));
		 
		 Thread.sleep(100);
		 System.out.println(Enable.isEnabled());
		 
	}

}
