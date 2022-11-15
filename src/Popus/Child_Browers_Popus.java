package Popus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browers_Popus {
private static Collection<? extends String> allwindows;

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	// open the application
	driver.get("https://www.flipkart.com/");
	
	// click on the canclle button
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	//serch for mobile
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
	
	// click onn the mobile
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	
	// by  defult selenium controll ids onn main window we take all  window
	Thread.sleep(3000);
	Set<String>allwindows=driver.getWindowHandles();
	
	//using arraylist we can store all window
	ArrayList<String> al=new ArrayList<String>(allwindows);
	
	// i want  print addres of main window
	String mainwin=al.get(0);
	Thread.sleep(3000);
	System.out.println(mainwin);
	
	//i want to print session id of child window
	String childwin=al.get(1);
	Thread.sleep(3000);
	System.out.println(childwin);
	
	
	
	
}
}
