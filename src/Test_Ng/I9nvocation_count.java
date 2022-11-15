package Test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class I9nvocation_count {
@Test(invocationCount=10)
public void Tc1(){
	Reporter.log("running tc1",true);
	
}
}
