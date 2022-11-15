package Nonstatic_Regular_Method_Form_SameClass;

public class SameClass {
public static void main(String[] args) {
	System.out.println("main method started");
	SameClass s=new SameClass();
	s.m1();
	s.m2();
	
	System.out.println("main mmethod ended");
}
public void m1() {
	System.out.println("I am form non static regular method same class m1");
}
public void m2() {
	System.out.println("I am form non static regular method same class m2");
}
}
