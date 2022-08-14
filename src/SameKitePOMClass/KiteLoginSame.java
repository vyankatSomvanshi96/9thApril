package SameKitePOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginSame {
	//1.
		@FindBy(id = "userid") private WebElement userID;
		@FindBy(id = "password") private WebElement passward;
		@FindBy(xpath = "//button[@type='submit']") private WebElement ClickOnLoginButton;
		
		//2.
		public KiteLoginSame(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.
		public void sendUI(String UN)
		{
			userID.sendKeys(UN);
		}
			
		public void sendPassward(String PWD)
		{
			passward.sendKeys(PWD);
		}
			
		public void ClickOnLogin()
		{
			ClickOnLoginButton.click();
		}
		
		
		
		
		
		
		
		
		
		
		
}
