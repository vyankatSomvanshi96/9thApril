package ActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act=new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
	//	act.dragAndDrop(src, dest).perform();   // 1st way-->Simple way
		
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		
		

	}

}
