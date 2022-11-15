package Arrays;

public class Ex2 {
public static void main(String[] args) {
	String ar[]=new String [5];
	ar[0]="Samantha";
	ar[1]="Rashamika";
	ar[2]="Sai pallavi";
	ar[3]="Niveda Thomas";
	ar[4]="Kiraty Suresh";
	
	//print the data which is not present
	try {
		System.out.println(ar[5]);//AIOOB
	}
	catch(ArrayIndexOutOfBoundsException Donkey){
		System.out.println("Idiot there is no data still u "
	+ "r tryining to featch it means u r waste felloe");
	}
}
}
