package FindElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(1000);
		
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(result.size()); // to count list in console
			
		for(WebElement vks:result)  //  for get the list in console
		{
			System.out.println(vks.getText());
		}
			
		for(WebElement vks:result)  // to click on specific item--> honda shine
		{
			String expectedResult = "honda shine";  // Manualy type expectedRsult="honda shine"
			String actualText = vks.getText();      // Manualy type actualText=Object.getText();
			
			if(actualText.equals(expectedResult))
			{
				vks.click();
				break;
			}
		}
		
		
		
		driver.findElement(By.linkText("Images")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
