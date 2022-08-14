package Scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStdy {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

        driver.get("https://vctcpune.com/");
        
        
        System.out.println(driver.manage().window().getPosition());
        
      //1. Create object of point class and pass x and y values
        Point p=new Point(100, 50);
        
      //2.call setPosition method and pass object of Point class
        driver.manage().window().setPosition(p);

	}

}
