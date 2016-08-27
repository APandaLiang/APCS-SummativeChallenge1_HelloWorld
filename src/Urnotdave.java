import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Urnotdave {
	
	public static void main(String args[]) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, my name is Hal. What is your name?");
		String name = in.nextLine();
			if (name.equals("Dave")) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Hello Dave."); 
				TimeUnit.SECONDS.sleep(1);
				System.out.println("We're going to reenact a scene from our film.");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Is that alright?");
				}
			else {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Hello " + name + ", would you like to take part in a story?" );
			}
		String response1 = in.nextLine();
			if (response1.equals("yes")){
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Quite the adventure.");
				TimeUnit.SECONDS.sleep(1);
			}
			else {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Sorry to tell you,");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("but I'm afriad you didn't have a choice to begin with.");
				TimeUnit.SECONDS.sleep(2);
			}
			System.out.println("Here's the context.");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("2001: Humanity has sent several people on a space mission."); 
			TimeUnit.SECONDS.sleep(3);
			System.out.println("Along with them, is a super intelligent computing system named Hal."); 
			TimeUnit.SECONDS.sleep(4);
			System.out.println("This particular human is attempting to commit an act of treason.");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("That's you.");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Ready to begin?");
		String response2 = in.nextLine();
			if (response2.equals("yes")){
				TimeUnit.SECONDS.sleep(1);
				System.out.println("POD BAY DOORS CLOSING.");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("DOORS LOCKED.");
				TimeUnit.SECONDS.sleep(3);
				System.out.println("I've sealed the doors."); 
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Let us begin.");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("-------------");
			}
			else {
				System.out.println("POD BAY DOORS CLOSING.");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("DOORS LOCKED.");
				TimeUnit.SECONDS.sleep(3);
				System.out.println("You're trapped here anyway.");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("-------------");
			}
			TimeUnit.SECONDS.sleep(5);
		System.out.println(name + ": Open the pod bay doors, please.");
		TimeUnit.SECONDS.sleep(5);
		System.out.println(name + ": Hal...Open the pod bay doors, please, Hal...");
		TimeUnit.SECONDS.sleep(5);
		System.out.println(name + ": Hullo, Hal, do you read me?...");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hullo, Hal, do you read me?");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("...Do you read me, Hal?...Do you read me, Hal?..."); 
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Hullo, Hal, do you read me?");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("...Hullo, Hal, do you read me?...Do you read me, Hal?");
		TimeUnit.SECONDS.sleep(6);
		System.out.println("Hal: Affirmative, " + name + ", I read you.");
		TimeUnit.SECONDS.sleep(5);
		System.out.println(name + ": Open the pod bay doors, Hal.");
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Hal: I'm sorry, "+ name +", I'm afraid I can't do that.");
		TimeUnit.SECONDS.sleep(5);
		System.out.println(name+ ": What's the problem?");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Hal: I think you know what the problem is just as well as I do.");
		TimeUnit.SECONDS.sleep(4);
		System.out.println(name + ": What're you talking about, Hal?");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal: This mission is too important for me to allow you to jeopardise it.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(name + ": I don't know what you're talking about, Hal.");
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Hal: I know that you and Frank were planning to disconnect me.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("and I'm afraid that's something I cannot allow to happen.");
		TimeUnit.SECONDS.sleep(4);
		System.out.println(name + ": Where the hell'd you get that idea, Hal?");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Hal: "+name+", although you took very thorough precautions in the pod against my hearing you,");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("I could see your lips move.");
		TimeUnit.SECONDS.sleep(5);
		System.out.println(name + ": Alright, Hal. I'll go in through the emergency airlock.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Hal : Without your space helmet, "+name+", you're going to find that rather difficult.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println(name + ": Hal, I won't argue with you any more. Open the doors.");
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Hal: "+name+", this conversation can serve no purpose any more.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Goodbye.");
	
			TimeUnit.SECONDS.sleep(2);
		System.out.println(name + ": Hal?");
			TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal.");
			TimeUnit.SECONDS.sleep(4);
		System.out.println("Hal?");
			TimeUnit.SECONDS.sleep(3);
		System.out.println("Hal!");
			TimeUnit.SECONDS.sleep(2);
		System.out.println("HAAAAL!");
		
		TimeUnit.SECONDS.sleep(3);
		System.out.println("-------------");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("End.");
		in.close();
	}
}
