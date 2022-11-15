package Test_Ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;




public class Emailable {
@Test
public void TC1() {
	Reporter.log("running tc 1",true);
	
}
@Test
public void TC() {
	Reporter.log("running tc2",true);
}
@Test
public void Tc3() {
	Reporter.log("running tc3",true);
Assert.fail(); // it is used for to fail  test case intentionally
}

}
