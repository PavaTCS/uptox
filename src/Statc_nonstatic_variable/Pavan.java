package Statc_nonstatic_variable;

public class Pavan {
	static int p=123;
	int w=345;
	
public static void main(String[] args) {
	
	System.out.println(p);
	Pavan b=new Pavan();
	System.out.println(b.w);
	
}
}
