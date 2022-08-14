package Popup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();  // Maximize the window
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//button[text()='Click me']")).click();
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();  // focus switch main to alert
		
		System.out.println(alt.getText());
				
		alt.accept();
		Thread.sleep(1000);
	//	alt.dismiss();
		//For ScreenShot
		driver.findElement(By.xpath("//a[text()='Tech News']")).click();
		
		File srs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dst=new File("D:\\Automation Notes\\Selenium\\ScreenShot\\snp.png");
		
		FileHandler.copy(srs, dst);

	}

}
