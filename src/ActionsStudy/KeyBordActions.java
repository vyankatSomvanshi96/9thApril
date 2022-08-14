package ActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyBordActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);  //1. Create object of ACtions class
		
		WebElement day = driver.findElement(By.id("day"));
		
		act.click(day).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		
		WebElement month = driver.findElement(By.id("month"));
		
		act.click(month).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		// using Select class method
		WebElement year = driver.findElement(By.id("year"));
		Thread.sleep(1000);
		Select slt=new Select(year);
		
		slt.selectByVisibleText("1995");
		
		

	}

}
