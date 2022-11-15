package variable;

public class A {
static int k;//declaration

public static void main(String[] args) {//reinitialization concept
	int i=10;
	i=20;
	i=30;
	i=40;
	System.out.println(i);//40//without declaring variable try to print
	int j;//only declaration
	//System.out.println(j);//we have to initilize it	
	//print global variable which is only declared 
	System.out.println(k);//0
	
}
}
