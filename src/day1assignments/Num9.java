package day1assignments;

import java.util.Scanner;

/*
 * 9. Prime Numbers Between Two Integers
 */

public class Num9 {
	
	static boolean checkForPrime(int num1, int num2) {
		boolean isItPrime = true;
	 
		if(num1 <= 1) {
		isItPrime = false;
	 
		return isItPrime;
		} else {
			for (int i = 2; i<= num1/2; i++) {
				if ((num1 % i) == 0) {
					isItPrime = false;
					break;
				}
			}
			return isItPrime;
			}
		}
	
	public static void main(String[] args) {	
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// User Input
		System.out.println("Enter a number: ");
		int num1 = input.nextInt();
		System.out.println("Enter another number: ");
		int num2 = input.nextInt();
		
		// Check for prime numbers between two numbers			
				 
		boolean isItPrime = checkForPrime(num1, num2);
		 
		if (isItPrime){
			System.out.println(num1 + " is a prime number.");
		} else {
			System.out.println(num1 + " is not a prime number.");
		}
		 
		input.close();
		}

}
