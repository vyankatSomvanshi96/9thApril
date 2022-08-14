package WebTable;

import java.util.List;

import org.apache.poi.ss.formula.functions.Column;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> NoOfColumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		
		
		System.out.println("No of columns in table are "+NoOfColumns.size());
		
		for(WebElement Clmn:NoOfColumns)  // For each loop
		{
			System.out.print(Clmn.getText()+" || ");
		}
		System.out.println();
						
       List<WebElement> NoOfRow = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		System.out.println("No of rows in table are "+NoOfRow.size());
		
		for(WebElement row:NoOfRow)   // For each loop
		{
			System.out.print(row.getText()+" || ");
		}
		System.out.println();
	}

}
