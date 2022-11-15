package starprogramme;

public class E {
// * * * * *
// * * # # *
// * * * * *
//	   * * *
//no  of raws 4
	//no of coloum 5
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||j==5) {
					System.out.print("*");
				}
				
				else if(i==2&&j==3) {
					System.out.print("#");
				}
				else if(i==2&&j==4) {
					System.out.print("#");
				}
				else if(i==3&&j==5) {
					System.out.print("* ");
				}
			
			
			}
		}
	}
}
