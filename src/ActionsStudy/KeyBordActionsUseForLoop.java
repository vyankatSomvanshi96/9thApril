package ActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBordActionsUseForLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Actions act=new Actions(driver);  // Create object of action class
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		act.click(Day).perform();  // For each loop for Day
		for(int i=8; i<=9; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		act.click(Month);  // For each loop for Month
		for(int i=1; i<=1;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		 act.sendKeys(Keys.ENTER);
		
	    act.click(Year);  // For each loop for Year
		for(int i=1; i<=27; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();

	}

}
