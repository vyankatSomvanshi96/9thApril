package KiteStdy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basics.webDriveMethods;

public class KiteUsingPOM {

	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	
	@FindBy(id="userid")private WebElement userID;
	@FindBy(id="password") private WebElement passward;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public KiteUsingPOM(WebDriver driver)   // Contructor
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public	
	
	public void sendUserID()
	{
		userID.sendKeys("ELR321");
	}
	
	public void sendPassWrd()
	{
		passward.sendKeys("Dhana1111");
	}
	
	public void clickOnLogin()
	{
		loginButton.click();
	}
	
}
