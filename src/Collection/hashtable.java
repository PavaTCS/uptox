package Collection;

import java.util.Hashtable;

public class hashtable {
public static void main(String[] args) {
	Hashtable<Integer,String>t= new Hashtable<Integer,String>();
	t.put(101,"Anand");//1st is empty
	t.put(102, "bablu");
	t.put(103, "Pavan");
	System.out.println(t);
	
	// remove any one
	t.remove(102);
	System.out.println(t);
}
}
