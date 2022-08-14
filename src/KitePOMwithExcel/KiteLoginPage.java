package KitePOMwithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	// 1.
	
	@FindBy(id = "userid") private WebElement userIDs;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//2.
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	
	public void sendUserID(String UN)
	{
		userIDs.sendKeys(UN);
	}
	
	public void sendPassword(String PWD)
	{
		password.sendKeys(PWD);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	
}
