package KiteStdyPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	// 1.
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UID;
	
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	//2.
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	
	public void validateUID()
	{
		String expectedResult="ELR321";
		String actualResult = UID.getText();
		
		if(actualResult.equals(expectedResult))
		{
			System.out.println("Test case is Pass");
		}
		else
		{
			System.out.println("Test case is Fail");
		}
			
	}
	
	
	public void clickLogoutButton() throws InterruptedException
	{
		UID.click();
		Thread.sleep(500);
		
		logoutButton.click();
	}
	
	
	
	
	
	
	
	
}
