package FindElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));  // To create a link we use <a> tag (anchor)
		
		System.out.println(Links.size()); // How Many Links
		
		
		for(WebElement vs:Links)   // What are those
		{
			System.out.println(vs.getText());
		}
		
		
		System.out.println("======");
		for(WebElement k:Links)
		{
			System.out.println(k.getTagName());
		}
		
		
		
		
		
		

	}

}
