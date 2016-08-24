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
				System.out.println("Sorry to tell you, but I'm afriad you didn't have a choice to begin with.");
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
		System.out.println(name + ": Open the pod bay doors, Hal.");
		System.out.println("Hal: I'm sorry, "+ name +", I'm afraid I can't do that.");
		System.out.println(name + "What's the problem?");
		System.out.println("Hal: I think you know what the problem is just as well as I do.");
		System.out.println(name + ": What're you talking about, Hal?");
		System.out.println("Hal: This mission is too important for me to allow you to jeopardise it.");
		System.out.println(name + ": I don't know what you're talking about, Hal.");
		System.out.println("Hal: I know that you and Frank were planning to disconnect me, and I'm afraid that's something I cannot allow to happen.");
		System.out.println(name + ": Where the hell'd you get that idea, Hal?");
		
		System.out.println("Hal: "+name+", although you took very thorough precautions in the pod against my hearing you, I could see your lips move.");
		System.out.println(name + ": Alright, Hal. I'll go in through the emergency airlock.");
		System.out.println("Hal : Without your space helmet, "+name+", you're going to find that rather difficult.");
		System.out.println(name + ": Hal, I won't argue with you any more. Open the doors.");
		System.out.println("Hal: "+name+", this conversation can serve no purpose any more.");
		System.out.println("Goodbye.");
	
		System.out.println(name + ": Hal?");
		System.out.println("Hal.");
		System.out.println("Hal?");
		System.out.println("Hal!");
		System.out.println("HAAAAL!");
		
		System.out.println("End.");


	
	
	}
}
