package Web_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/PAVAN/Downloads/WebTable%20by%20ANKUSH%20(1)%20(1).html");
	
	//Print only student name
	String st = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
	System.out.println(st);
	
	//print city
	String city = driver.findElement(By.xpath("//table[@id='2244']//th[3]")).getText();
	System.out.println(city);
	
	//print sachin naame
	String sachin = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[2]")).getText();
	System.out.println(sachin);
}
}
