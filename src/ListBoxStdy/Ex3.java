package ListBoxStdy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
        Thread.sleep(3000);
        
        WebElement Day = driver.findElement(By.id("day"));
        Thread.sleep(3000);
        
        Select sl=new Select(Day);
        
        sl.selectByVisibleText("10");
        Thread.sleep(1000);

		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		
		Select mnt=new Select(month);
		
		mnt.selectByValue("4");
		
		WebElement yrs = driver.findElement(By.id("year"));
		Thread.sleep(1000);
		Select yr=new Select(yrs);
		
		yr.selectByVisibleText("1995");
		
		
		
		

	}

}
