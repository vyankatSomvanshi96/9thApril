package SameKiteUtilityClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	
	
	public static String readDataFromExcel(int rowvalue, int cellValue) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("D:\\\\Automation Notes\\\\Selenium\\\\selenium Arch\\\\Excel file.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(rowvalue).getCell(cellValue).getStringCellValue();
		
		return value;
	}
	
	public static void captureScreenShot(WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Automation Notes\\Selenium\\ScreenShot\\shot"+TCID+".png");
		
		FileHandler.copy(src, dest);
		
	}
	
	public static Timeouts WaitTime(WebDriver driver, int vks )
	{
		Timeouts timeSet = driver.manage().timeouts().implicitlyWait(Duration.ofMillis(vks));
		return timeSet;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
