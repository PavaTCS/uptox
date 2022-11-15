package Test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test(enabled = false) //intentionally we ignor the tc  1
public void Tc1() {
	Reporter.log("Tc1 running",true);
}
@Test()
public void Tc2() {
	Reporter.log("Tc2 running",true);
}
}
