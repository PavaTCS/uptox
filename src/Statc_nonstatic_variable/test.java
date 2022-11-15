package Statc_nonstatic_variable;

public class test {
	static int i=20;
	int j=80;
	
public static void main(String[] args) {
	
	System.out.println(i);
	
	test a=new test();
	System.out.println(a.j);
	
	
}
}
