package day1assignments;

import java.util.Scanner;

/*
 * 8. Check if a Number is Positive or Negative using if else
 */

public class Num8 {
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// User input
		System.out.println("Enter a number: ");
		int num = input.nextInt();

		if(num >= 0) {
			System.out.println( num + " is a positive number.");
		} else if(num <= -1) {
			System.out.println( num + " is a negative number.");
		} 
		
		input.close();
	}
}
