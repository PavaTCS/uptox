package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Facebook {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\PAVAN\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// open the application
		driver.get("https://www.facebook.com/");
		WebElement particular=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File src=particular.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\PAVAN\\Desktop\\Pavan Screen Shot\\logo.jpg");
		Files.copy(src, dest);
	
	}
	
}
