package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver drive1=new ChromeDriver();
		
		drive1.get("https://www.facebook.com/");
		drive1.findElement(By.id("email")).sendKeys("vyankat2013@gmail.com");
	}

}
