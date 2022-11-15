package Test_NG_Parallel_Exucation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {
@Test
public void Tc2() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\PAVAN\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
}
}
