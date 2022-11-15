package Collection;

import java.util.Vector;

public class vector {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("Ganesh");
	v.add(100);
	v.add('A');
	v.add(100);
	v.add(null);
	v.add(null);
	System.out.println(v);
	
	//check the size
	System.out.println(v.size());//6
	
	//check the empty  boxx
	System.out.println(v.isEmpty());//false
	
	//inseration operation
	v.add(3500);
	System.out.println(v);
	
}
}
