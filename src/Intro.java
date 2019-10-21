/********************************************************************************
 * File: Intro.java
 * Name: Ricardo Barbosa 
 * Date: October 20, 2019
 * Course: CST 338 - Software Design
 * Description: Program receives first name, last name, and number of hours 
 *       spent on the current week's module 
 * Usage: The program takes the prompts and prints in upper case, lower case, and 
 *        formats the decimal to print to the tenthes place.
 *******************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Intro {

	//Static final variables for range of hours 
	public static final int MIN_HOURS = 12;
	public static final int MAX_HOURS = 20;
	private static Scanner keyboard;
	
	public static void main(String[] args) {
		
		//DecimalFormat class to round values
		String formatPattern = "##.0;";
		DecimalFormat df = new DecimalFormat(formatPattern);
		
		//Scanner keyboard 
		keyboard = new Scanner(System.in);
		
		//Asks user to enter their first name 
		System.out.println("Please capitalize your intials");
		System.out.print("Enter your first name: ");
		String fName = keyboard.nextLine();
		
		//Asks user to enter their last name 
		System.out.print("Enter your last name: ");
		String lName = keyboard.nextLine();
		
		//Asks user to enter number of hours spent within range
		System.out.print(MIN_HOURS + " - " + MAX_HOURS + " should"
				+ " have been spent on this week's module."
				+ " Enter the number of hours that you spent: ");
		double hours = keyboard.nextDouble();
		
		//Print out full name and length
		System.out.println("Your name is: " + fName + " " + lName + " "
				+ "and the length of characters in your name is " + (fName.length() + lName.length()));
		
		//Print Upper Case
		System.out.println(fName.toUpperCase() + " " + lName.toUpperCase());
		
		//Print Lower Case
		System.out.println(fName.toLowerCase() + " " + lName.toLowerCase());
		
		//Print hours spent on module for the week using DecimalFormat
		System.out.println("Time spent on this week's "
				+ "module: " + (df.format(hours)) + " hours");

	}

}
