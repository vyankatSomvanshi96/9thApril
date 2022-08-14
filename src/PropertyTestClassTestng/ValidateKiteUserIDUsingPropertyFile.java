package PropertyTestClassTestng;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PropertyKiteBase.NewBase;
import PropertyKiteUtility.NewUtility;
import PropertyPOMclasses.PropertyKiteLoginPage;
import PropertyPOMclasses.PropertyKitePIN;
import PropertyPOMclasses.PropertykiteHome;

public class ValidateKiteUserIDUsingPropertyFile extends NewBase {
  
	PropertyKiteLoginPage login;
	PropertyKitePIN pin;
	PropertykiteHome home;
	
	
	@BeforeClass
	public void LaunchBrowser() throws IOException
	{
		OpenBrowser();
		
		 login=new PropertyKiteLoginPage(driver);
		 pin=new PropertyKitePIN(driver);
		 home=new PropertykiteHome(driver);
	}
	
	
	@BeforeMethod
	public void LoginKiteApp() throws IOException
	{
		
		login.sendUID(NewUtility.readDatefromPropertyFile("UID"));
		login.sendPassward(NewUtility.readDatefromPropertyFile("PWD"));
		login.ClickOnLogin();
		
		NewUtility.WaitTime(driver, 10000);
		
		
		pin.sendPIN(NewUtility.readDatefromPropertyFile("PIN"));
		pin.clickOnContinue();
		
		NewUtility.WaitTime(driver, 10000);
	}
		
	@Test
  public void KiteUIDvalidates() throws IOException 
  {
		String TCID="123";
		Assert.assertEquals(home.getActualUID(), NewUtility.readDatefromPropertyFile("UID"),"TC is fail when actual and expected are not match");
		Reporter.log("Actual and expected are match",true);
		
		NewUtility.WaitTime(driver, 1000);
		NewUtility.captureScreenshot(driver, TCID);
		Reporter.log("Taking screenshot",true);
  }
	
	@AfterMethod
	public void LogoutKite() throws InterruptedException
	{
		home.ClickOnlogout();
	}
	
	@AfterClass
	public void closeAPP()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
}
