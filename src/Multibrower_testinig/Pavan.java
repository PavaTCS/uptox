package Multibrower_testinig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pavan {
	@Test
	public void Tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\PAVAN\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/?hl=hi");
	}


	
	
	
	
	
	

}
