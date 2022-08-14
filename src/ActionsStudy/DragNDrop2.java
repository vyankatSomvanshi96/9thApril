package ActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nobroker.in/property/rent/gurgaon/Sector%2028/?AL!5425!3!607336023744!b!!g!!flats%20in%20sector%2028!8668096718!90773764447=&utm_campaign=Search_Gurgaon_Sector_28_Generic_Rent&ef_id=CjwKCAjwq5-WBhB7EiwAl-HEkn0n2Bcg2fpOOs69CVIaqINlBnq-DktMsYZqf3i0512M5URIp5SZFhoCCe0QAvD_BwE:G:s&utm_medium=cpc&orderBy=nbRank,desc&type=BHK2,BHK3&searchParam=W3sibGF0IjoyOC40NzQwNjc1LCJsb24iOjc3LjA4MzY3OTUsInNob3dNYXAiOmZhbHNlLCJwbGFjZUlkIjoiQ2hJSkRiRXM3U0FaRFRrUlBreUhQdWxOTlV3IiwicGxhY2VOYW1lIjoiU2VjdG9yIDI4IiwiY2l0eSI6Imd1cmdhb24ifV0=&gclid=CjwKCAjwq5-WBhB7EiwAl-HEkn0n2Bcg2fpOOs69CVIaqINlBnq-DktMsYZqf3i0512M5URIp5SZFhoCCe0QAvD_BwE&lat_lng=28.4724602,77.08535119999999&propertyType=rent&radius=2&sharedAccomodation=0&adgroup=Sector_28&utm_source=google&rent=0,50000");
        
		Actions act=new Actions(driver);
		
		WebElement srs = driver.findElement(By.xpath("(//div[@role='slider'])[1]"));
		
	    WebElement dest = driver.findElement(By.xpath("(//div[@role='slider'])[2]"));
		
	//	act.dragAndDrop(srs, dest);
		
		act.dragAndDropBy(srs, 50, 0).dragAndDropBy(dest, 50, 0).build().perform();
		
		
		
	}

}
