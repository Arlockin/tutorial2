package com.calderkalina.activities;

import java.util.Scanner;

public class Paint {

	
	// -------------------------------------------------
	// main prints some expressions using the + operator
	// -------------------------------------------------
	public static void main (String[] args)
	{
		final int COVERAGE = 350; //paint covers 350 sq ft/gal
		
		int length = 0;
		int width = 0;
		int height = 0;
		
		int windowNumber = 0;
		double windowArea = 15.0;
		
		int doorNumber = 0;
		double doorArea = 20.0;
		
		double totalSqFt = 0.0;
		double paintNeeded = 0.0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Input the length of the room:");
		length = scan.nextInt();
		System.out.println();
		
		System.out.print("Input the width of the room:");
		width = scan.nextInt();
		System.out.println();
		
		System.out.print("Input the height of the room:");
		height = scan.nextInt();
		System.out.println();

		System.out.print("Input the amount of windows in the room:");
		windowNumber = scan.nextInt();
		System.out.println();
		
		System.out.print("Input the amount of doors in the room:");
		doorNumber = scan.nextInt();
		System.out.println();
		
		
		totalSqFt = (length * width * height) - (windowNumber * windowArea) - (doorNumber * doorArea);
		System.out.println("The area to be painted is " + totalSqFt + " square feet.");
		System.out.println("It will take " + (totalSqFt/COVERAGE) + " gallons of paint to paint this room");
		
		
		//Compute the amount of paint needed
		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.

	}
	


}
