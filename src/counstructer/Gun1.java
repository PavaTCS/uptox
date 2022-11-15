package counstructer;

public class Gun1 {
String gunName;
int noOfBullets;
public Gun1(String gunName,int noOfBullets) {
	this.gunName=gunName;
	this.noOfBullets=noOfBullets;
	
}
public void shoot() {
	for(int i=1;i<=noOfBullets;i++) {
System.out.println("hii");
	}
}
}
