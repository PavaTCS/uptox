package Statc_nonstatic_variable;

public class Dimple {
	int k=50;// non static global variable 
	
public static void main(String[] args) {
	Dimple d=new Dimple();
	System.out.println(d.k);
	
}

}
