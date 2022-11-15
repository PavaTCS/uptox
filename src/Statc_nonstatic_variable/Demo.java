package Statc_nonstatic_variable;

public class Demo {// class body open
	static String s="velocity";
	String s1="Pavan";
	
public static void main(String[] args) {// method body open
	System.out.println(s);
	Demo d=new Demo();
	System.out.println(d.s1);
	
	
}// method body close
}// class body close
