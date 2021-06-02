package day1assignments;

import java.util.Scanner;

/*
 * 4.  Swap two numbers using temporary variable
 */

public class Num3 {

	public static void main(String[] args) {
		double first;
		double second;
		
		// creates an object of scanner
		Scanner input = new Scanner(System.in);
		
		// User Input
		System.out.println("Enter the first number: ");
		first = input.nextDouble();
		System.out.println("Enter the second number: ");
		second = input.nextDouble();

        // Reassign first value to temp
        double temp = first;

        // Reassign second value to first
        first = second;

        // Reassign value of temp to second
        second = temp;

        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        
        // Close input
        input.close();
	}

}
