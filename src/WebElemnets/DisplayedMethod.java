package WebElemnets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		WebElement HideButton = driver.findElement(By.id("hide-textbox"));
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));
				
		HideButton.click();
		
		if(textBox.isDisplayed())
		{
			System.out.println("Text box is Displayed");
		}
		else
		{
			System.out.println("Text box is not display, clicking on show button");
			showButton.click();
			textBox.sendKeys("Welcome");
		}
		
		WebElement text = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		
		String tx = text.getText();
		System.out.println(tx);
		
		WebElement enable = driver.findElement(By.xpath("//input[@value='Radio4']"));
		
		boolean Enb = enable.isEnabled();
		System.out.println("Radio button is "+Enb);
	}

}
