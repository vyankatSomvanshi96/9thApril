package WebTable;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class PracticeSty {

	public static void main(String[] args) throws InterruptedException, IOException {
       System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		// total column
		List<WebElement> totalColm = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		
		System.out.println(totalColm.size());
		
		for(WebElement vs:totalColm)
		{
			System.out.println(vs.getText());
		}
		
		// total rows
		System.out.println("======");
		List<WebElement> totalRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		System.out.println(totalRows);
		
		for(WebElement vs1:totalRows)
		{
			System.out.println(vs1.getText());
		}
		
		// No of links present on web page
		
		List<WebElement> NoOfLink = driver.findElements(By.tagName("a"));
		
		System.out.println(NoOfLink.size());
		for(WebElement vs2:NoOfLink)
		{
			System.out.println(vs2.getText());
		}
		
		// Drop Box
		
		WebElement dropbox = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sl=new Select(dropbox);
		
		sl.selectByValue("option1");
		
		
		// Handle alert popup
		
		WebElement text = driver.findElement(By.xpath("//input[@id='name']"));
		Thread.sleep(1000);
		text.sendKeys("Vyankt");
		Thread.sleep(1000);
		
		System.out.println("Alert");
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		
		alt.accept();
		
		// ScreenShot
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(4);
		System.out.println(random);
		
		File dest=new File("D:\\Automation Notes\\Selenium\\selenium Arch\\VKS"+random+".png");
		
		FileHandler.copy(src, dest);

	}

}
