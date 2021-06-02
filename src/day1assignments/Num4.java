package day1assignments;

import java.util.Scanner;

public class Num4 {

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

        // Swap without reassigning with third variable
        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        
        // Close input
        input.close();
	}
}
