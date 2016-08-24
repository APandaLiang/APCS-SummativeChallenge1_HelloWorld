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
				System.out.println("Hello " + name + ", would you like to take part in a story?" );
			}
		String response1 = in.nextLine();
			if (response1.equals("yes")){
				System.out.println("You're in for quite the adventure.");
			}
			else {
				System.out.println("I'm afriad you didn't have a choice to begin with anyway.");
			}
			System.out.println("Here's the context. Humanity has sent humans on a mission with an on-board super intelligent computing system named Hal. This particular human is attempting to commit an act of treason.");
			System.out.println("Ready to begin?");
		String response2 = in.nextLine();
			if (response2.equals("yes")){
				System.out.println("POD BAY DOORS CLOSING.");
				System.out.println("DOORS LOCKED.");
				System.out.println("Hal: I've sealed the doors. Let us begin.");
			}
			else {
				System.out.println("POD BAY DOORS CLOSING.");
				System.out.println("DOORS LOCKED.");
				System.out.println("Hal: You're trapped here anyway.");
			}
		System.out.println(name + ": Open the pod bay doors, please.");
		System.out.println(name + ": Hal...Open the pod bay doors, please, Hal...");
		System.out.println(name + ": Hullo, Hal, do you read me?...");
		System.out.println("Hullo, Hal, do you read me?");
		System.out.println("...Do you read me, Hal?...Do you read me, Hal?...Hullo, Hal, do you read me?");
		System.out.println("...Hullo, Hal, do you read me?...Do you read me, Hal?");
	
		System.out.println("Hal: Affirmative, " + name + ", I read you.");

	
	
	}
}
