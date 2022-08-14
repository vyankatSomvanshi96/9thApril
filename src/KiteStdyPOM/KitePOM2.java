package KiteStdyPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePOM2 {

	//1. Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement Continue;
	
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public KitePOM2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3. Utilize within a method with access level public
	
	public void sendPIN()
	{
		pin.sendKeys("982278");
	}
	
	public void ClidkOnContinue()
	{
		Continue.click();
	}
	
}
