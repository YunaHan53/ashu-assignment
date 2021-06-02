package day2assignments;

import java.util.Scanner;

/*
 * 5. Calculate the power of a number using a for loop.
 */

public class NumberPower {

	public static void main(String[] args) {
		// creates an object of scanner
		Scanner input = new Scanner(System.in);
		
		// User Number Input
		System.out.println("Input base number: ");
		int num = input.nextInt();
		System.out.println("Input exponent: ");
		int power = input.nextInt();
		
		long result = 1;
		
        // Putting the numbers in a for loop
		
        for (int i = power; i != 0 ; i--)
        {
            result *= num;
        }
        
        //Displaying the output
        System.out.println(num + "^" + power + " = " + result);
	}

}
