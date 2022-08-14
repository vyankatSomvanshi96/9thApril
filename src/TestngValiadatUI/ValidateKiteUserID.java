package TestngValiadatUI;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteUserID {
  
	WebDriver driver;
	
	File myFile;
	Sheet mySheet;
	
	KiteLoginPage login;
	KitePINPage pin;
	KiteHomePage home;
	
		
	@BeforeClass
	public void BrowserLaunch() throws EncryptedDocumentException, IOException
	{
		
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching Kite", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		myFile=new File("D:\\Automation Notes\\Selenium\\selenium Arch\\Excel file.xlsx");
		
	    mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		 login=new KiteLoginPage(driver);
		 pin=new KitePINPage(driver);
		 home=new KiteHomePage(driver);
			
	}
	
	@BeforeMethod
	public void loginTokite()
	{
		login.sendUI(mySheet.getRow(0).getCell(0).getStringCellValue());
		login.sendPWD(mySheet.getRow(0).getCell(1).getStringCellValue());
		login.ClickOnLogin();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPIN(mySheet.getRow(0).getCell(2).getStringCellValue());
		pin.ClickOnContinue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}
	
	
	@Test
  public void validateUID() 
  {
		String expectedUID = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		String ActualID = home.getActualUID();
		
		Assert.assertEquals(ActualID, expectedUID, "Tc is faile when expected and actual are not matching");
		
		Reporter.log("Validate Actual and expected, Tc is Pass", true);
		
  }
	
	@AfterMethod
	public void logoutKite() throws InterruptedException
	{
		home.clickOnLogoutB();
		Reporter.log("Clicking on logout button", true);
		Thread.sleep(1000);
	}
	
	
	@AfterClass
	public void BrowserClose()
	{
		Reporter.log("Browser close", true);
		driver.close();
	}
	
	
}
