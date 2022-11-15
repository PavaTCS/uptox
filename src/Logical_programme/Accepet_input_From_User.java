package Logical_programme;

import java.util.Scanner;

public class Accepet_input_From_User {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ley user input the 1st number");
		int num1=scan.nextInt();
		
		System.out.println("Ler user input the 2nd number");
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
	}
}
