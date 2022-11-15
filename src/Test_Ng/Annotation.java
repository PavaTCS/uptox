package Test_Ng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
@BeforeClass
public void openBrowers() {
	Reporter.log("open the application",true);
}
@BeforeMethod
public void loginapp() {
	Reporter.log("login application",true);
}
@Test
public void verifyid() {
	Reporter.log("Veify user id",true);
}
@AfterMethod
public void closemethod() {
	Reporter.log("close method",true);
}
@AfterClass
public void closeclass() {
	Reporter.log("close class",true);
}
}
