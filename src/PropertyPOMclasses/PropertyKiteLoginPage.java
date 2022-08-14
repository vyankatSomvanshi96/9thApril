package PropertyPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyKiteLoginPage {

	//1.
	
	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement passward;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ClickOnLoginButton;
	
	
	// 2
	
	public PropertyKiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 3.
	
	public void sendUID(String UID)
	{
		userID.sendKeys(UID);
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
