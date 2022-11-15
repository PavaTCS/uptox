package Paisa_FreameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF_5PaisaFremeWork {
public static void main(String[] args) {
	//set of properties
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\PAVAN\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicity wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//delete all cookies
	driver.manage().deleteAllCookies();
	//maximize the browers
	driver.manage().window().maximize();
	// open the application
	driver.get("https://login-v2.upstox.com");
	//inter user name
	driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("2QALQX");
	//enter the passoward
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pnishi@321");
	//clic onn login button
	driver.findElement(By.xpath("//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")).click();
	//inter DOB
	driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1995");
	//click on not i am good
	driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	//verify user is on home
	String expT="Uptox Pro";
	String actT=driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("user neviget to home page and tc is pass");
	}
	else {
		System.out.println("fail");
	}
	
	
	
	

}
}
