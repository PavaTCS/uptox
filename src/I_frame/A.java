package I_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	
	// maximize the browers
	driver.manage().window().maximize();
	
	// swith the 1st frame
	driver.switchTo().frame("packageListFrame");
	
	// take my element on 1st frame and print it
	String text1=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.grid.sessionmap.local']")).getText();
	System.out.println(text1);
	
	// switch the 2nd element
	Thread.sleep(4000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	
	// take my element on 2nd frame and print it
	Thread.sleep(4000);
	String text2=driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	Thread.sleep(4000);
	System.out.println(text2);
	
	// seith to 3rd element
	Thread.sleep(4000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	
	// take my  element on 3rd frame and print it
	Thread.sleep(4000);
	String text3=driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
	Thread.sleep(4000);
	System.out.println(text3);
}

}

