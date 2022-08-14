package ListB2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBPractice {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		
	//	Thread.sleep(100);
		
	//	WebElement vs = driver.findElement(By.id("year"));
		
	//	Select ss=new Select(vs);
        
	//	ss.selectByVisibleText("2019");
		
	//	System.out.println(ss.isMultiple());
		
		
	//	WebElement month = driver.findElement(By.id("month"));
		
	//	Select mnt=new Select(month);
		
		//mnt.selectByVisibleText("Mar");
		
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
        
        Thread.sleep(1000);
        WebElement month = driver.findElement(By.id("month"));
        
        Select mnt=new Select(month);
        
        mnt.selectByVisibleText("May");
        
        Thread.sleep(1000);
        
        WebElement year = driver.findElement(By.id("year"));
                      
        Select yr=new Select(year);
        
        yr.selectByValue("1995");
        
        Thread.sleep(1000);
        
        
		WebElement day = driver.findElement(By.id("day"));
		
		Select dy=new Select(day);
		
		dy.selectByIndex(9);
		
		Thread.sleep(1000);
		
	}

}
