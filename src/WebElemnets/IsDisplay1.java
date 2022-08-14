package WebElemnets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\selenium\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		WebElement displaed = driver.findElement(By.id("displayed-text"));
		
		boolean Dis = displaed.isDisplayed();
		System.out.println(Dis);
		
		WebElement show = driver.findElement(By.id("show-textbox"));
		
		 WebElement ts = driver.findElement(By.id("hide-textbox"));
		 ts.click();
		Thread.sleep(100);
		if(Dis)
		{
			displaed.sendKeys("Vyankat");
		}
		else
		{
			show.click();
			displaed.sendKeys("Now Displed");
			System.out.println("Not Displed");
		}
		
		
		
		
		
		
		
		
		
	}

}
