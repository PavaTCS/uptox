package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/?hl=hi");
	
	// inspect the element where we need to move courser
	WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
	
	// creat the object action class
	Actions act=new Actions(driver);
	act.contextClick(target).perform();
}
}
