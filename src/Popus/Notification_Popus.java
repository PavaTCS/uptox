package Popus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popus {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	// creat the object of browers seeting class
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--disable-notifications");
	c.addArguments("start-maximized");
	
	// open the browers
	WebDriver driver=new ChromeDriver(c);
	Thread.sleep(4000);
	driver.manage().window().maximize();

	driver.get("https://www.hdfc.com/");
	
}
}
