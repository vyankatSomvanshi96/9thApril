package KiteStdyPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		KitePOM login=new KitePOM(driver);
		
		login.sendUserID();
		login.sendPassWrd();
		login.clickOnLogin();
		
		Thread.sleep(500);
		
		KitePOM2 PIN= new KitePOM2(driver);
		
		PIN.sendPIN();
		PIN.ClidkOnContinue();
		
		Thread.sleep(500);
		
		KiteHomePage home=new KiteHomePage(driver);
		
		home.validateUID();
		home.clickLogoutButton();
		Thread.sleep(500);
		
		driver.close();
		

	}

}
