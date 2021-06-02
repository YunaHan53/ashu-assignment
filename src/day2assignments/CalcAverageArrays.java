package day2assignments;

import java.util.Scanner;

/*
 * 6. Program to Calculate Average Using Arrays
 */

public class CalcAverageArrays {
	
	public static void main(String[] args) {
		// Have user set how many elements they want to have in the array
        System.out.println("How many numbers you want to enter?");
	    Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        // Create new empty number array to be inputed by user
		double[] numArr = new double[n];
		double total = 0;
		
		// Iterate through each number and user input
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("Enter number " + (i+1) + ": ");
			numArr[i] = input.nextDouble();
		}
		// Closes scanner
		input.close();
		
		// Calculate the sum of the numbers in the array
        for(int i=0; i < numArr.length; i++){
        	total = total + numArr[i];
        }
        
        // Calculate average of the sum of numbers
        double average = total / numArr.length;
        
        System.out.printf("The average is: %.2f", average);
	}
}
