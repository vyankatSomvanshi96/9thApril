package ListBoxStdy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEx2 {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        
        driver.get("https://demoqa.com/select-menu");
		
		
		WebElement v = driver.findElement(By.id("cars"));
		
		Select vs=new Select(v);
		
		System.out.println(vs.isMultiple());
		
		vs.selectByVisibleText("Volvo");
		Thread.sleep(100);
		
		vs.selectByValue("saab");
		Thread.sleep(100);
		
		vs.selectByValue("audi");
		
		// If i want to deselect any particular value
		
		
		
		vs.deselectByValue("saab");
		Thread.sleep(100);
		
		// If I want Deselect all value at a time than
		
		Thread.sleep(100);
		vs.deselectAll();
		
		
		// Extra Practice
		driver.manage().window().maximize();
		
		WebElement getText = driver.findElement(By.xpath("//div[text()='Select Menu']"));
		
		
		getText.getText();
		
		System.out.println(getText.getText());
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement ss = driver.findElement(By.xpath("//div[text()='Select Option']"));
		
		System.out.println(ss.isEnabled());
		System.out.println(ss.isSelected());  // If I want to true this condition than
		
		
	//	WebElement vv = driver.findElement(By.className(" css-1uccc91-singleValue"));
		
	//	Select v1=new Select(vv);
	//	v1.selectByVisibleText("Group 2, option 1");
		
	//	System.out.println("what is result"+vv.isSelected());
		
		
	}

}
