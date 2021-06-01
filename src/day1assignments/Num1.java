package day1assignments;

import java.util.Scanner;

/*
 * 1. WAP to accept a isbn,name, author, price, no of copies printed from user 
 * and print them using method
 */
public class Num1 {
	
	public static void main(String[] args) {

		// creates an object of scanner
		Scanner input = new Scanner(System.in);
		
		// Book title input
		System.out.println("Enter the book title: ");	
		String name = input.nextLine();

		// Book author input
		System.out.println("Enter the book's author: ");	
		String author = input.nextLine();
		
		// Book isbn input
		System.out.println("Enter the book's isbn #: ");
		int isbn = input.nextInt();
		
		// Book price input
		System.out.println("Enter the price of book: ");	
		float price = input.nextFloat();
		
		// Number of books input
		System.out.println("Enter the # of books: ");
		int numOfCopies = input.nextInt();

		// Prints all input 
		System.out.println("The title of the book is " + name);
		System.out.println("The book's isbn # is " + isbn);
		System.out.println("The book is written by " + author);
		System.out.println("The book is $" + price);
		System.out.println("There are " + numOfCopies + " copies available.");
		
		// Closes the input scanner
		input.close();
	}
}
