package day2assignments;

import java.util.Scanner;

/*
 * 1.  Generate Multiplication Table using for loop
 */

public class MultiplicationTable {

	public static void main(String[] args) {
		
		// creates an object of scanner
		Scanner input = new Scanner(System.in);
		
		// User Input
		System.out.println("Enter a number to multiply from 1 - 10: ");
		int num = input.nextInt();
		
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        input.close();
	}

}
