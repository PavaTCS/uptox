package Dyanamic_handaling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/");
	
	//print the deth cases
	String death = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
	System.out.println(death);
	
	// print the recover test casess
	String recover = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
	System.out.println(recover);
	
	//print coronavireous cases
	String coro = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
	System.out.println(coro);
}
}
