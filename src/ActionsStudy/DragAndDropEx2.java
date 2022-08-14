package ActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
       Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement src = driver.findElement(By.id("drag1"));
		
		WebElement dest = driver.findElement(By.id("div2"));
		
		act.dragAndDrop(src, dest).perform();
		
	}

}
