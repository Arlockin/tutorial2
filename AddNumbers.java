package com.calderkalina.activities;

import java.util.Scanner;

public class AddNumbers {
	
	public static void main(String[] args) {
		
		int sum = 0; 							//setup
		Scanner scan = new Scanner (System.in);
		int count = 0;
		System.out.print("Please select the number of values you would like to add together:");
		int limit = scan.nextInt();
		int nextVal;
		while (count < limit)
		{
		System.out.print("Enter the next integer: "); 	//do work
		nextVal = scan.nextInt();
		sum = sum + nextVal;
		count++;
		}
		System.out.println("The sum of your integers is " + sum);

}
}