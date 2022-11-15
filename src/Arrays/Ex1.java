package Arrays;

public class Ex1 {
public static void main(String[] args) {
	String ar[]=new String [5];
	ar[0]="Samantha";
	ar[1]="Rashamika";
	ar[2]="Sai pallavi";
	ar[3]="Niveda Thomas";
	ar[4]="Kiraty Suresh";
	
	//Print Sai pallavvi
	System.out.println(ar[2]);
	
	//print Rashamika
	System.out.println(ar[1]);
	
	// I want to print entire data in given array
	for(int i=0;i<=4;i++) {
		System.out.println(ar[i]);
	}
}
}
