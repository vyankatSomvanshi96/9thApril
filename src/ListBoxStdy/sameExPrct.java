package ListBoxStdy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sameExPrct {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	//	driver.manage().window().maximize();
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(2500);
		
		WebElement vks = driver.findElement(By.id("year"));
		Thread.sleep(2500);
	//	vks.click();
		
		Select vss=new Select(vks);
		Thread.sleep(2500);
		vss.selectByValue("1995");
		
		
		WebElement sel = driver.findElement(By.id("month"));
		Thread.sleep(2500);
		
		Select sss=new Select(sel);
		
		sss.selectByVisibleText("Jun");

	}

}
