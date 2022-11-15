package Statc_nonstatic_variable;

public class Sample {//class body open
	static int i=10;//static global variable
	int j=20;//non static global variable
	
public static void main(String[] args) {//method body open
	System.out.println(i);//since it static variable so that we can print directly
	
	Sample a=new Sample();
	System.out.println(a.j);
	
	
	
}//method body close
}//class body close
