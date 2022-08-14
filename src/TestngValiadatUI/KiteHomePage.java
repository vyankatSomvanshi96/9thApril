package TestngValiadatUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	// 1.
	
	@FindBy(xpath = "//span[@class='user-id']")  private WebElement UiD;
	@FindBy(xpath = "//a[@target='_self']") private WebElement ClickOnLogoutButton;
	
	//2.
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 3.
	
	public String getActualUID()   // only change in this step in testNg
	{
		String actualUID = UiD.getText();
		return actualUID;
	}
	
	public void clickOnLogoutB() throws InterruptedException
	{
		UiD.click();
		Thread.sleep(400);
		ClickOnLogoutButton.click();
		
	}
	
	
	
}
