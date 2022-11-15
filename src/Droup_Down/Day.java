package Droup_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// open the application
	driver.get("https://www.facebook.com/");
	
	// click on creat on an account btn
	
    driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
    Thread.sleep(4000);
	// select the date
	WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	
	// creat  an object
	Select s=new Select(day);
	  Thread.sleep(4000);
	  // use of select of class method(select by text)
	 // s.selectByVisibleText("25");
	  
	  // select by value
	  s.selectByValue("23");
	

	
}
}
