package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=wireless+mouse&sid=6bo%2Cai3%2C2ay&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_8_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_8_na_na_na&as-pos=2&as-type=RECENT&suggestionId=wireless+mouse%7CMouse&requestId=7e0512c4-07b3-477a-9230-922547748e93&as-searchtext=wireless");

		
	//	WebElement rvw = driver.findElement(By.xpath("((//div[@class='gUuXy- _2D5lwg'])[1]//span)[2]"));
		
		//System.out.println(rvw.getText());
	}

}
