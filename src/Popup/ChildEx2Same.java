package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildEx2Same {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);				
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(1000);
		
		Set<String> IdForAll = driver.getWindowHandles();
		System.out.println(IdForAll);
		
		ArrayList<String> al=new ArrayList<String>(IdForAll);
		
        String IdOfMn = al.get(0);
		String IdOfChild = al.get(1);
		
		driver.switchTo().window(IdOfChild);
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		
		driver.switchTo().window(IdOfMn);  // Focus Change from child page to main page
		
		String text = driver.findElement(By.xpath("(//p[contains(text(),'open link in new')])[1]")).getText();
		
		System.out.println(text);

	}

}
