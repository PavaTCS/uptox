package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Down {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	//inspect  the 1st element
	WebElement ele1= driver.findElement(By.xpath("//div[@id='draggable']"));
	
	//  inspect  the 2nd element
	WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	// creat the object action class
	Actions act=new Actions(driver);
	
	//call dragdrop
	act.dragAndDrop(ele1, ele2).perform();
}
}
