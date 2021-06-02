package day1assignments;

import java.util.Scanner;

/*
 * 6. Check whether an alphabet is vowel or consonant using switch statement
 */

public class Num6 {
 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a letter: ");
		
		String letter = input.nextLine();
		
		switch (letter) {
		default:
			System.out.println("This is a consonant");
			break;
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("This is a vowel");
			break;

		}
		input.close();

	}
}
