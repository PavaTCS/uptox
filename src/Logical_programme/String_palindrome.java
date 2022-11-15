package Logical_programme;

public class String_palindrome {
public static void main(String[] args) {
	String org="NITIN";
	String rev="";
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
	//check it is a palindrome
	if(org.equals(rev)) {
		System.out.println("at a given palindrome");
	}
	else {
		System.out.println("not palindromme");
	}
}
}
