package String_Method;

public class Methods_of_string {
public static void main(String[] args) throws InterruptedException {
	String s1="Velocity";
	String s2="VELOCITY";
	String s3="Velo";
	System.out.println(s1.length());
	
	//toUppercase
	
	System.out.println(s1.toUpperCase());
	
	//tolowercase
	System.out.println(s2.toLowerCase());
	
	//equals()
	System.out.println(s1.equals(s2));//false
	
	//equalignorecase()
	System.out.println(s1.equalsIgnoreCase(s2));//true
	
	//contains()
	System.out.println(s1.contains(s3));
	System.out.println(s2.contains(s3));
	
	//charAt()
	System.out.println(s2.charAt(0));//v
	System.out.println(s2.charAt(1));//E
	
	//indexOf()
	System.out.println(s2.indexOf('Y'));//7
	System.out.println(s2.indexOf('V'));//0
	
	Thread.sleep(3000);//it will wait for 3 second
	
}
}
