package Dyanamic_handaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.get("https://www.flipkart.com/");
	
	//click on canclle button
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	//serch
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000",Keys.ENTER);
	
	// print on mobile price
	String price = driver.findElement(By.xpath("(//div[@class='col col-5-12 nlI3QM']/descendant::div)[3]")).getText();
	System.out.println(price);
	
}
}
