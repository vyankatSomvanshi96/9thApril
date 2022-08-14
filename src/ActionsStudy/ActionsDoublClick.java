package ActionsStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoublClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		Actions act=new Actions(driver);  //1. Create an object of ACtions Class

		//2. Find Element to be worked
		WebElement DoubleCk = driver.findElement(By.xpath("//button[contains(text(),'Me To See Alert')]"));
		
		
		//3. take the required action
		act.moveToElement(DoubleCk).doubleClick().build().perform();  // 1st way
	//	act.doubleClick(DoubleCk).perform(); ---> 2nd way
		
		
		// Alert popuo handle
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		

	}

}
