package Scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStdy {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/");
        
        // To get the size 
        System.out.println(driver.manage().window().getSize());
        
      //to set size we need to create object of Dimension class and pass width and height as parameters
        
        Dimension d=new Dimension(100, 100);
        
      //call setSize method which will ask you object of Dimension class
        driver.manage().window().setSize(d);
        
        
        
        
        
        
        

	}

}
