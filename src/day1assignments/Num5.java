package day1assignments;

import java.util.Scanner;

/*
 * 5. Check whether an alphabet is vowel or consonant using if..else statement
 */

public class Num5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a letter: ");
		
		char letter = input.next().charAt(0);
		
		if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			System.out.println("This is a vowel");
		}  else {
			System.out.println("This is a consonant");
		}
		input.close();
	}

}
