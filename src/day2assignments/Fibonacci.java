package day2assignments;

import java.util.Scanner;

/*
 * 2.  Display Fibonacci Series Using for Loop
 */

public class Fibonacci {

	public static void main(String[] args) {
		
		// creates an object of scanner
		Scanner input = new Scanner(System.in);
		
		// User Input
		System.out.println("How many fibonacci numbers would you like? ");
		int count = input.nextInt();
		
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series: " + count + " numbers\n ");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            /* Assigns the second number to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        input.close();
	}

}
