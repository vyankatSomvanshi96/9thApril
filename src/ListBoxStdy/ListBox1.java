package ListBoxStdy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		
		Thread.sleep(1000);
		WebElement vs1 = driver.findElement(By.id("year"));
		
		Select s1=new Select(vs1);
		
		s1.selectByValue("1995");
		
		//s.selectByVisibleText("2018");
		
	//	s.selectByIndex(6);
	 //  s.selectByValue("2018");
	   
	   
	   WebElement vs2 = driver.findElement(By.id("month"));
	   
	   Select s2=new Select(vs2);
	   
	   s2.selectByVisibleText("Jun");
	  
	   
	   WebElement vs3 = driver.findElement(By.id("day"));
	   
	   Select s3=new Select(vs3);
	   
	   s3.selectByValue("10");
	   
	   System.out.println(s1.isMultiple());
	   System.out.println(s2.isMultiple());
		System.out.println(s3.isMultiple());
	}

}
