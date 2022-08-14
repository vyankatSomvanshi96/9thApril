package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign3 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement text = driver.findElement(By.xpath("//h1[@itemprop='name']"));
		
		System.out.println(text.getText());
		
		driver.switchTo().frame("frm1");
		Thread.sleep(1000);
		WebElement vks = driver.findElement(By.id("selectnav1"));
		
		Select vs=new Select(vks);
		
		vs.selectByVisibleText("- SQL");
		
		WebElement text1 = driver.findElement(By.xpath("(//h1[contains(text(),'Dropdowns')])[1]"));
		Thread.sleep(1000);
		System.out.println(text1.getText());
		
	//	driver.switchTo().defaultContent();
	//	Thread.sleep(500);
		//driver.switchTo().frame("frm2");
		//Thread.sleep(500);
		
		//driver.findElement(By.id("femalerb")).click();
		
		//WebElement pp = driver.findElement(By.id("selectnav1"));
		
		//Select lp=new Select(pp);
		
		//lp.selectByVisibleText("Tutorials");
		
		
		
		

	}

}
