package Popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBroserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		
		String IdOfMainPage = driver.getWindowHandle(); // to get single id(that is main page)-->
		
		System.out.println(IdOfMainPage);
		
		Set<String> IdOfAllPage = driver.getWindowHandles(); // to get the Id of all pages -->
		
		System.out.println(IdOfAllPage);  // Get I'd of main page only
		
		// convert set into ArrayList
		
		ArrayList<String> al=new ArrayList<String>(IdOfAllPage);
		
		String NwIdOfMainPg = al.get(0); // Now we can use get method in ArrayList
		String IdOfChildPage = al.get(1);
		
		driver.switchTo().window(IdOfChildPage);  //switch focus from main page to child page
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		Thread.sleep(1500);
	//	driver.close();
		
		
		//to work on main page, switch selenium focus from child page to main pages
	//	driver.switchTo().window(NwIdOfMainPg);  
		
				
		List<WebElement> vs = driver.findElements(By.tagName("a"));  // Check how many links are present 
		
		System.out.println(vs.size());
		
		for(WebElement ks:vs)  // check what are those links
		{
			System.out.println(ks.getText());
		}
		
		
		
		
		
		
		
		

	}

}
