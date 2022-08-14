package KiteStdy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		WebElement userId = driver.findElement(By.id("userid"));
		WebElement passward = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userId.sendKeys("ELR321");
		passward.sendKeys("Dhana1111");
		loginButton.click();
		
		Thread.sleep(1000);
		WebElement pinNo = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pinNo.sendKeys("982278");
		continueButton.click();
		
		Thread.sleep(1000);
		WebElement Uid = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualId = Uid.getText();
		
		String expectedId="ELR321";
		
		if(actualId.equals(expectedId))
		{
			System.out.println("Test Case is Pass ");
		}
		else 
		{
			System.out.println("Test Case is fail");
		}
		
		Uid.click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		

	}

}
