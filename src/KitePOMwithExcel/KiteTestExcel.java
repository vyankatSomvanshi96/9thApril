package KitePOMwithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
        ChromeOptions opt=new ChromeOptions();
        
    //    opt.addArguments("--headless");  // If i want to hide head
    //      opt.addArguments("--disable-notifications");  // hide all notificatication
            opt.addArguments("incognito");  
            
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");

		// Excel reading
		File myfile=new File("D:\\Automation Notes\\Selenium\\selenium Arch\\Excel file.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		
		
		KiteLoginPage login=new KiteLoginPage(driver);
		
		login.sendUserID(UN);   // this is 1st way for pass arguments
		login.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());  // this is 2nd way for pass arguments
		login.clickOnLoginButton();
		Thread.sleep(1000);
		
		
		KitePinPage passpin=new KitePinPage(driver);
		
		passpin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		passpin.clickOnContinueButton();
		Thread.sleep(1000);
		
		
		KiteHomePage home=new KiteHomePage(driver);
		
		home.validatUserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		home.clicklogoutButton();
		Thread.sleep(1000);
		
		
		
		
		
	}

}
