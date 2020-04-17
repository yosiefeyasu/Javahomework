package homeworkone;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		
		 Scanner console = new Scanner (System.in);
		    int a = 0;
		    int b = 0;
		    int sum = 0;
		    int product = 0;
		    System.out.println ("Enter a number:");
		    a = console.nextInt();
		    System.out.println("Enter another number:");
		    b = console.nextInt();
		     sum = a+b;
		    product = a*b;
		    
		    System.out.println("Sum " + sum);
		    System.out.println("Product  " +  product);

		  }

}
