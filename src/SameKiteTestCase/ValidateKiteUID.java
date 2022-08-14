package SameKiteTestCase;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SameKiteBaseClass.Base;
import SameKitePOMClass.KiteLoginSame;
import SameKitePOMClass.KitePINSame;
import SameKitePOMClass.kiteHomePage;
import SameKiteUtilityClass.Utility;

public class ValidateKiteUID extends Base {
 
	KiteLoginSame login;
	KitePINSame pin;
	kiteHomePage home;
	
	
	@BeforeClass
	public void BrowserLauch()
	{
		OpenApplication();
		
		 login=new KiteLoginSame(driver);
		 pin=new KitePINSame(driver);
		 home=new kiteHomePage(driver);
	}
	
	
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException
	{
		login.sendUI(Utility.readDataFromExcel(0, 0));
		login.sendPassward(Utility.readDataFromExcel(0, 1));
		login.ClickOnLogin();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		pin.sendPIN(Utility.readDataFromExcel(0, 2));
		pin.clickOnContinue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}
	
	@Test
  public void ValidateKiteUID() throws EncryptedDocumentException, IOException 
	{
		String TCID="1234";
		Assert.assertEquals(home.GetActualUID(), Utility.readDataFromExcel(0, 0));
		
		Utility.captureScreenShot(driver, TCID);
   }
	
	@AfterMethod
	public void ClickOnLGOUT() throws InterruptedException
	{
		home.ClickOnlogout();
		Utility.WaitTime(driver, 1000);
	}
	
	@AfterClass
	public void closeB()
	{
		driver.close();
	}
}
