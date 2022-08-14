package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();  // Maximize the window
		
		WebElement Text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		Thread.sleep(1000);
		System.out.println(Text.getText());  // Get the text 
				
		driver.switchTo().frame("frame1");  // Focus switch from main page to frame 1
		Thread.sleep(1000);
		
		WebElement click = driver.findElement(By.tagName("input"));
		click.click();
		Thread.sleep(1000);
		
		click.sendKeys("Selenium");  // send the input
		Thread.sleep(500);

		driver.switchTo().frame("frame3");  // Focus switch from frame 1 into frame 3
		Thread.sleep(1000);
		
		WebElement S1 = driver.findElement(By.id("a"));
		Thread.sleep(500);
		System.out.println(S1.isSelected()); // Return type is boolean
		
	//	S1.click();
	//	Thread.sleep(500);
		
		if(S1.isSelected())
		{
			System.out.println("This is already selected");
		}
		else
		{
			S1.click();
			System.out.println("Now Selected");
		}
					
		driver.switchTo().defaultContent();   // Switch to main page
		Thread.sleep(500);
		
		driver.switchTo().frame("frame2"); // Focus switch from main page into frame 2
		Thread.sleep(1000);
		
		WebElement ncp = driver.findElement(By.id("animals"));
		Thread.sleep(1000);
		
		Select s=new Select(ncp);
		Thread.sleep(500);
		
		System.out.println(s.isMultiple()); // Return type is boolean
		
		s.selectByVisibleText("Avatar"); 
		Thread.sleep(1000);
		
		// For ScreenShot
		
		File snap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String rs = RandomString.make(3);
		
		File dest=new File("D:\\Automation Notes\\Selenium\\ScreenShot\\SP1"+rs+".png");
		
		FileHandler.copy(snap, dest);
		
		
	}

}
