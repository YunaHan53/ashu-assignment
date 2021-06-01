package day1assignments;

import java.util.Scanner;

/*
 * 2. Compute Quotient and Remainder for provided number
 */

public class Num2 {
	
	public static void main(String[] args) {

		// creates an object of scanner
		Scanner input = new Scanner(System.in);
		
		// User Input
		System.out.println("Enter a whole number: ");
		int userNum = input.nextInt();
		System.out.println("Enter another whole number: ");
		int userNum2 = input.nextInt();
		
		// Quotient formula
		int quotient = userNum / userNum2;
		// Remainder formula
		int remainder = userNum % userNum2;
		
		// Print out the results
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
        
        // Closes the input
        input.close();
	}
}
