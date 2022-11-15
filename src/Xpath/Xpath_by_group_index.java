package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_group_index {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// open the application
		driver.get("https://demo.actitime.com/login.do");
		
		//inter user name
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		
		// inter password
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		
	
	}

}
