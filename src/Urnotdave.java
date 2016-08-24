import java.util.Scanner;

public class Urnotdave {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, my name is Hal. What is your name?");
		String name = in.nextLine();
			if (name.equals("Dave")) {
				System.out.println("Hello Dave."); 
				System.out.println("We're going to reenact a scene from our film.");
				}
			else {
				System.out.println("Hello " + name + ", would you like to hear a story?" );
			}
		

	
	
	
	}
}
