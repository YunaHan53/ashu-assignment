package day1assignments;

import java.util.Scanner;

/*
 * 7. Java Program to Check a Leap Year
 */

public class Num7 {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Input year
		System.out.println("Enter year to check whether it is a leap year or not: ");
		int year = input.nextInt();
		
		if(year%4 == 0) {
			System.out.println("Year " + year + " is a leap year.");
		} else {
			System.out.println("Year " + year + " is not a leap year.");
		}
		
		input.close();
	}
}
