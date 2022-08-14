package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(50);
		driver.navigate().to("https://www.instagram.com/sem/campaign/emailsignup/?campaign_id=13530338610&extra_1=s|c|547419127652|e|instagram%20login|&placement=&creative=547419127652&keyword=instagram%20login&partner_id=googlesem&extra_2=campaignid%3D13530338610%26adgroupid%3D126262414054%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-35100690670%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwzLCVBhD3ARIsAPKYTcQcYM6ZnUwgueOXxtK8DQqnsW8YYJ4FUxlVqRnDOxEFBVWS2ZxyA4caApzjEALw_wcB");
		
		driver.navigate().back();
		Thread.sleep(50);
		
		driver.navigate().forward();
		Thread.sleep(50);
		
		driver.navigate().refresh();
		
		// driver.findElement(By.xpath("//button[@type='button']")).isEnabled();

		Thread.sleep(500);
		WebElement Click1 = driver.findElement(By.xpath("//button[@type='button']"));
		System.out.println("It is enable "+Click1.isEnabled());
		
	}

}
