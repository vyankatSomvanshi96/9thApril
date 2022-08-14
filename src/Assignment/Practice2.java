package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples in')]"));
		Thread.sleep(1000);
		
		System.out.println(text.getText());
		
		driver.switchTo().frame("frame1");
		
		WebElement vs = driver.findElement(By.tagName("input"));
		Thread.sleep(1000);
		vs.click();
		
		vs.sendKeys("Welcome");
		
		driver.switchTo().frame("frame3");
		
		WebElement select = driver.findElement(By.id("a"));
		Thread.sleep(1000);
		
		System.out.println(select.isSelected());
		
		select.click();
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement st = driver.findElement(By.id("animals"));
		Thread.sleep(1000);
		Select vks=new Select(st);
		
		vks.selectByValue("babycat");
		Thread.sleep(500);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des=new File("D:\\Automation Notes\\Selenium\\ScreenShot\\SNAP.png");
		
		
		FileHandler.copy(src, des);
		

	}

}
