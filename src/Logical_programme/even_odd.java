package Logical_programme;

import java.util.Scanner;

public class even_odd {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("user inter the number");
	int num=s.nextInt();
	//to check the num even or odd
	if(num%2==0) {
		System.out.println("given num is even");
	}
	else {
		System.out.println("given num is odd");
	}
}
}
