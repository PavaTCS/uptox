package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN\\Downloads\\chromedriver_win32.zip");
	WebDriver driver=new ChromeDriver();
	//open the application
	driver.get("https://www.amazon.in/");
	
	// how to take screenshot
	TakesScreenshot ts=(TakesScreenshot)driver;//type cast here
	
	// use get screenshot method and store src
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	// creat the folder where we need to store scrnnshot and give the path with floder proper name and extensive
	File dest=new File("C:\\Users\\PAVAN\\Desktop\\Pavan Screen Shot\\amazon.jpg");
	
	// copy scrns src to dest
	Files.copy(src, dest);
	
}
}