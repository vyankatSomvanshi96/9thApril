package ActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act=new Actions(driver);
		
		WebElement rightclickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		act.moveToElement(rightclickButton).contextClick().build().perform();
		
	//	act.contextClick(rightclickButton).perform();
		
		WebElement clk = driver.findElement(By.xpath("//button[contains(text(),'To See Alert')]"));
		
		act.contextClick(clk).perform();

	}

}
