/*
 * Kassondra Jones
 * Lab 2
 * January 23, 2018
 */

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		// initialize all necessary variables
		int userInput;
		String userName;
		String userResponse;
		char userChoice;

		//Create new scanner and request name input
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Good morning, what is your name? ");
		userName = scnr.next();
		
		//Set up do-while loop for the request of integers
		do {
		System.out.println(" ");
		System.out.print(userName + ", please enter a whole number between 1 and 100:  ");
		userInput = scnr.nextInt();
		
			//If-else all possible outcomes with validation built-in for positive integer between 1 and 100
			if (((userInput%2) != 0) && (userInput >= 1) && (userInput <= 60) ) {
				System.out.println(" ");
				System.out.println(userName + ", your number is " + userInput + " and odd.");	
			}
			else  if (((userInput%2) != 0) && (userInput > 60) && (userInput <= 100)) {
				System.out.println(" ");
				System.out.println(userName + ", your number is odd and over 60.");
			}
			else if (((userInput%2) == 0) && (userInput >= 2) && (userInput <= 25)) {
				System.out.println(" ");
				System.out.println(userName + ", your number is even and less than 25.");
			}
			else if (((userInput%2) == 0) && (userInput >= 26) && (userInput <= 60)) {
				System.out.println(" ");
				System.out.println(userName + ", your number is even.");
			}
			else if (((userInput%2) == 0) && (userInput > 60) && (userInput <=100)) {
				System.out.println(" ");
				System.out.println(userName + ", your number is " + userInput + " and even.");
			}
			else {
				System.out.println(" ");
				System.out.println("That is not a valid number.");
			}
			
			//Prompt user if s/he would like to continue
			System.out.println(" ");
	    	System.out.print("Would you like to continue?: (y/n) ");
	    	
	    	userResponse = scnr.next();
	    	userChoice = userResponse.charAt(0);
	    	
			} while (userChoice == 'y');
		
		//End program if user no longer wishes to continue
		System.out.println(" ");
		System.out.println("Thank you for your time!");
		System.out.println("Goodbye!");
		
		}
			
}
