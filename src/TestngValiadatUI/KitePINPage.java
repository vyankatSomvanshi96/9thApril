package TestngValiadatUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePINPage {

	//1.
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ClickOnContinueButton;
	
	//2.
	
	public KitePINPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// 3
	
	public void sendPIN(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void ClickOnContinue()
	{
		ClickOnContinueButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
