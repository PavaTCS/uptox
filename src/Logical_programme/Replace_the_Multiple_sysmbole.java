package Logical_programme;

import java.util.Scanner;

public class Replace_the_Multiple_sysmbole {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("hey user print the string with special sysmbole");
	
	String name=scan.next();
	String correctname=name.replaceAll("[^a-zA-Z]","");
	System.out.println(correctname);
}
}
