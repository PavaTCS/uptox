package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Attribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// open the application
	driver.get("https://demo.actitime.com/login.do");
	
	// inter username( use formula by xpath by attribute)
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	// inter password
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	// click the login button(use formula xpath by text)
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
}
}
