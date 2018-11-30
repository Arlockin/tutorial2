package com.calderkalina.lab2;

import java.util.Scanner;
public class Salary {

	public static void main (String[] args)
	{
		double currentSalary = 0; // current annual salary
		double rating = 0; // performance rating
		double raise = 0; // dollar amount of the raise
		Scanner scan = new Scanner(System.in);
		// Get the current salary and performance rating
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating: ");
		rating = scan.nextDouble();
		// Compute the raise -- Use if ... else ...
		// Print the results
		if(rating == 1)
		{
			raise = .06;
			System.out.println ("Amount of your raise: $" + (currentSalary * raise));
			raise = currentSalary + (currentSalary * raise);
			System.out.println ("Your new salary: $" + raise);
		}
		else if(rating == 2)
		{
			raise = .04;
			System.out.println ("Amount of your raise: $" + (currentSalary * raise));
			raise = currentSalary + (currentSalary * raise);
			System.out.println ("Your new salary: $" + raise);
		}
		else if(rating == 3)
		{
			raise = .015;
			System.out.println ("Amount of your raise: $" + (currentSalary * raise));
			raise = currentSalary + (currentSalary * raise);
			System.out.println ("Your new salary: $" + raise);
		}
		else
		{
			System.out.println("Sorry, you did not receive a raise.");
		}
	}

	
}
