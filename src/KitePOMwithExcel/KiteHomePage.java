package KitePOMwithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	//1.
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	//2.
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	//3.
	
	public void validatUserID(String ExpectedUID)
	{
		String actualUID = UID.getText();
		if(actualUID.equals(ExpectedUID))
		{
			System.err.println("Actual and Expected UserID's are matching, Test case is pass");
		}
		else
		{
			System.out.println("Actual and Expected UserID's are not matching, Test case is fail");
		}
	}
	
	public void clicklogoutButton() throws InterruptedException
	{
		UID.click();
		Thread.sleep(500);
		logoutButton.click();
	}
	
}
