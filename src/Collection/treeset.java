package Collection;

import java.util.TreeSet;
public class treeset {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(100);
	ts.add(300);
	ts.add(400);
	ts.add(700);
	ts.add(200);
	
	System.out.println(ts);
	
	//Delete last number
	ts.pollLast();
	System.out.println(ts.pollLast());
	
	//delete first noumber
	ts.pollFirst();
	System.out.println(ts.pollFirst());
	

}
}
