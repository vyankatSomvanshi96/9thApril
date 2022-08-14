package SameKitePOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePINSame {

	//1.
	
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ClickOnContinueButton;
	
	//2.
	
	public KitePINSame(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendPIN(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	
	public void clickOnContinue()
	{
		ClickOnContinueButton.click();
	}
	
	
}
