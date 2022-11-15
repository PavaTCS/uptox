package Collection;

import java.util.ArrayList;

public class arraylist {// dount confuse here we are talking abt inbulit class
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Ankush");
		al.add(100);
		al.add('A');
		al.add(100);
		al.add(null);
		al.add(null);
		// Print all data in class
		System.out.println(al);
		
		//get  the size
		System.out.println(al.size());//6
		
		//check  wether it is emapty
		System.out.println(al.isEmpty());//false
		
		//insertion poeration 
		al.add(3500);
		System.out.println(al); 
		
		//delete the operation 
		al.remove(3);
		System.out.println(al);
		
		
	}

}
