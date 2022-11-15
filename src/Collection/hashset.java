package Collection;

import java.util.HashSet;

public class hashset {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("Pavan");
	hs.add(100);
	hs.add(null);
	hs.add(null);
	hs.add(100);
	hs.add('A');
	
System.out.println(hs);

// size
System.out.println(hs.size());

//empty
System.out.println(hs.isEmpty());

//clear method
hs.clear();// it will be clear entire data in collection 
System.out.println(hs);
}
}
