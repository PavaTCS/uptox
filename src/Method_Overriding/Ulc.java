package Method_Overriding;

public class Ulc {
public static void main(String[] args) {
	System.out.println("talk of cat");
	cat c=new cat();
	c.talk();
	
	
	System.out.println("talk of dog");
	Dog d=new Dog();
	d.talk();
}

}
