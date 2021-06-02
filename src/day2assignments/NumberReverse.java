package day2assignments;

import java.util.Scanner;

/*
 * 4. Reverse a Number using a while loop in Java 
 * 	  HINT - Find the remainder of number by dividing it by 10 using % operator.
 */
public class NumberReverse {

	public static void main(String[] args) {
		// creates an object of scanner
		Scanner input = new Scanner(System.in);
		
		// User Number Input
		System.out.println("Input a number you would like to reverse: ");
		int num = input.nextInt();
		
		int reversed = 0;

	    while(num != 0) {
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }
	    System.out.println("Reversed Number: " + reversed);
		input.close();
	  }
}
