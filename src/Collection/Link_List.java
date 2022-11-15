package Collection;

import java.util.LinkedList;

public class Link_List {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("Ganpati");
	ll.add(100);
	ll.add('A');
	ll.add(null);
	ll.add(null);
	ll.add(100);
	
	System.out.println(ll);
	
	// Get the size
	System.out.println(ll.size());
	
	//Check wether it is empty
	System.out.println(ll.isEmpty());
	
	//inseration operation (right shift)
	ll.add(1,"Suresh");
	System.out.println(ll);
	
	//Deletation operation (left  shift)
	ll.remove(1);
	System.out.println(ll);
}
}
