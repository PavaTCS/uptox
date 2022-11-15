package Test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 3)
public void Tc1() {
	Reporter.log("Tc1 running",true);
}
@Test(priority = 1)
public void Tc2() {
	Reporter.log("Tc2 running",true);
}
@Test(priority = 1)
public void Tc3() {
	Reporter.log("Tc3 running",true);
}


}
