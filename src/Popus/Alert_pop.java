package Popus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	// inter the coustmer id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456",Keys.ENTER);
	
	// use alrt interface
	Alert alt=driver.switchTo().alert();
	
	// i want click on ok  button
	//alt.accept();// automatically click on ok button
	
	//click on cancle button
	//alt.dismiss();// click  on cancle button
	
	// get the text on popup
	String text=alt.getText();
	System.out.println(text);
	
	
}


}
