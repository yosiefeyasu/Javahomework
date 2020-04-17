package homeworkone;

import java.util.Scanner;

public class Debug {
	
	public static void main(String[] args) {
   	Scanner input = new Scanner(System.in);
   	System.out.print("Input your testscore: ");
   	int testscore=input.nextInt();
   	
    char grade;

    if (testscore >= 90) {
        grade = 'A';
    }else if (testscore >= 80) {
        grade = 'B';
    }else if (testscore >= 70) {
        grade = 'C';
    }else if (testscore >= 60) {
        grade = 'D';
    } else {
        grade = 'F';
    }
    System.out.println("Grade = " + grade);
}
}
