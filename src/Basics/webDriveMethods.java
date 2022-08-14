package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriveMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.hdfcbank.com/");
		
		
		// driver.close();
		
		driver.manage().window().maximize();

		driver.manage().window().minimize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
	}

}
