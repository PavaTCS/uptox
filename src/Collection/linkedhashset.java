package Collection;

import java.util.LinkedHashSet;

public class linkedhashset {
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("Rinky");
	lhs.add(100);
	lhs.add('A');
	lhs.add(null);
	lhs.add(null);
	lhs.add(100);
	System.out.println(lhs);
	
	//size
	System.out.println(lhs.size());
	
	//empty
	System.out.println(lhs.isEmpty());
	
	
			
}
}
