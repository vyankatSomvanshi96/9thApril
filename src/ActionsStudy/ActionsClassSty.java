package ActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassSty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//1.to take mouse actions, need to create object of Actions class and pass webDriver object as parameter
		
		Actions act=new Actions(driver);   // select action---Interaction
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		
		aboutUs.click();   // using web drive method
		act.moveToElement(aboutUs).perform();  // Using action class method --> 1st way to click
		act.click().perform();   // 1st way to click
		
		
	//	act.moveToElement(aboutUs).click().build().perform();  // 2nd way to click
		
		
	//	act.click(aboutUs).perform();   // 3rd way to click
		
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		act.moveToElement(radio).click().build().perform();

	}

}
