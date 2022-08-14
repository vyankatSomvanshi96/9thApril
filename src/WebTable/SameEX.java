package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SameEX {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/selenium/practice.html");
        
          List<WebElement> clm = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
        
          List<WebElement> row = driver.findElements(By.xpath("//table[@id='product']//tr"));
        
          System.out.println(clm.size());
          System.out.println(row.size());
        
        for(WebElement cm:clm) 
        {
        	System.out.println(cm.getText()+" || ");
        }
        
        for(WebElement rw:row)
        {
        	System.out.println(rw.getText()+" || ");
        }
        
        System.out.println("===========");
        
        // 2nd way
        
        int r = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();  // For Row
        
        int c = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th")).size(); // For Column
               
        for(int i=2; i<=r; i++)
        {
        	for(int j=1; j<=c; j++)
        	{
        		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[" +i+ "]/td[" +j+ "]")).getText()+"  ");
        		
        	}
        	System.out.println();
        }
        
        
        
        

	}

}
