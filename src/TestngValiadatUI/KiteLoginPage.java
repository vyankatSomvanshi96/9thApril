package TestngValiadatUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	// Step 1st
	
	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement passward;
	@FindBy(xpath = "//button[@type='submit']") private WebElement clickOnLoginButton;
	
	// Step 2nd
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 3rd Step
	
	public void sendUI(String UID)
	{
		userID.sendKeys(UID);
	}
	
	public void sendPWD(String PWD)
	{
		passward.sendKeys(PWD);
	}
	
	public void ClickOnLogin()
	{
		clickOnLoginButton.click();
	}
	
}
