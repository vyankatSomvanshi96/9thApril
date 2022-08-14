package WebElemnets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\selenium\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement vs = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));  // Store in variable
		
		boolean sv = vs.isSelected(); // Store in variable
		
		
		if(sv)   // Or if(vs.isSelected)
		{
			System.out.println("Check box is already selected");
		}
		else
		{
			vs.click();
			System.out.println("Check box selected Now");
		}
		
		
		
		
		
		
		
		
		// System.out.println("it is selected "+vs.isSelected());
		//System.out.println(sv);
	//	Thread.sleep(100);
		
	//	vs.click();

	}

}
