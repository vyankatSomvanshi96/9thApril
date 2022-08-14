package SameKitePOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage {
	
	// 1.
	
		@FindBy(xpath = "//span[@class='user-id']")  private WebElement UiD;
		@FindBy(xpath = "//a[@target='_self']") private WebElement ClickOnLogoutButton;
		
		
	//2.
		
		public kiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	//3.
		
		public String GetActualUID()
		{
			String actualUID = UiD.getText();
			return actualUID;
			
		}
	
		
		public void ClickOnlogout() throws InterruptedException
		{
			UiD.click();
			Thread.sleep(500);
			ClickOnLogoutButton.click();
		}
	

}
