package homeworkone;

import java.util.Scanner;

public class ElizaChats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name? ");
	    String name=input.nextLine();
	    System.out.println("Nice to meet you, Hannah Snow, How has your day been? ");
	    String day=input.nextLine();
	    System.out.println("Okay, Anything in particular that makes you feel that It has been a splendid day! ? ");
	    String feel=input.nextLine();
	    System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day! ");
	    System.out.print("Here are your responses:" + name + " "  +  day  + " " +  feel );
	    

	}

}
