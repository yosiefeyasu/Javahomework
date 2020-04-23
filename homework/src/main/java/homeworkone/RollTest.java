package homeworkone;

//This program will accept a dice value from a player using Scanner and depends on the input that we receive we will give a score and we are asking to a player if he want to continue until the score reaches 100 and the player can terminal his game any time. I use while loops for iterate over the flow and if else to check my conditions

	import java.util.Scanner;

	public class RollTest {

	public static void main(String[] args) {
	   
	         int score = 0;
	         boolean flag=true;
	         System.out.println("Welcome! Let's Play Roll Dice!");
	         while(flag) {
	         
	    Scanner input = new Scanner(System.in);
	        System.out.print("Input your die1Value: ");
	        int die1Value=input.nextInt();
	        System.out.print("Input your die2Value: ");
	        int die2Value=input.nextInt();
	       

	       
	       
	       
	       
	   
	    System.out.println("Your rolls " + die1Value  + " & " +  die2Value );
	   
	     if(die1Value == 1 & die2Value == 1 || die1Value == 1 & die2Value == 2 ) {
	   
	    score = score+25;
	   
	    System.out.println("score" + score);
	   
	   
	   
	}
	     else if (die1Value != 1 && die2Value != 1  ) {
	    score =  score+die1Value + die2Value ;
	   
	    System.out.println("score" +  score );
	   
	     }
	     else if(die1Value == 2 && die2Value == 1 || die1Value == 3 && die2Value == 1 | die1Value == 4 && die2Value == 1
	    || die1Value == 5 && die2Value == 1 || die1Value == 6 && die2Value == 1)
	     {
	   
	    System.out.println("score" +  score );
	   
	     }
	     else if(die1Value == 1 && die2Value == 3 || die1Value == 1 && die2Value == 4 || die1Value == 1 && die2Value == 5
	    || die1Value == 1 && die2Value == 6 )
	     {
	   
	    System.out.println("score" +  score );
	     }
	     else if(score >= 100) {
	     System.out.println("You have scored over 100");
	     System.out.println("Thank you for playing!");
	      flag=false;
	     }
	     System.out.println("choose yes or not");
	     Scanner inputs = new Scanner(System.in);
	     String rollAgain = inputs.nextLine();
	   
	    if (rollAgain.equals("yes")  || rollAgain.equals("YES")){
	    System.out.println("Roll again?");
	                   
	     }
	        else {
	        System.out.println("Thank you for playing!");
	        flag=false;
	       
	   
	        }
	       
	    }
	}
	}

