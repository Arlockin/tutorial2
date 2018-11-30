package com.calderkalina.activities;

//***************************************************************
//Sales.java
//
//Reads in and stores sales for each of 5 salespeople. Displays
//sales entered by salesperson id and total sales for all salespeople.
//
//***************************************************************
import java.util.Scanner;
public class Sales
{
	public static void main(String[] args)
	{
		double avg;
		Scanner scan = new Scanner (System.in);
		System.out.println("Input the amount of salespeople: ");
		int salespeopleNumber = scan.nextInt();
		int[] sales = new int[salespeopleNumber];
		int sum;
		int maxSales = 0;
		int minSales = 2147483647;
		for (int i=0; i<sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + (i+1) + ": ");
			sales[i] = scan.nextInt();
		}
		
		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ ");
		sum = 0;
		for (int i=0; i<sales.length; i++)
		{
			if(sales[i] > maxSales)
			{
				maxSales = sales[i];
			}
			if(sales[i] < minSales)
			{
				minSales = sales[i];
			}
			System.out.println(" " + i + " " + sales[i]);
			sum += sales[i];
		}
		System.out.println("\nTotal sales: " + sum);
		avg = sum/sales.length;
		System.out.println("Average sales: " + avg);
		System.out.println("Most sales: " + maxSales);
		System.out.println("Fewest sales: " + minSales);
		System.out.println("Enter your expected number of sales: ");
		int expectedSales = scan.nextInt();
		for (int i = 0; i < sales.length; i++)
		{
			if (sales[i] == expectedSales)
			{
				System.out.println("Salesperson " + (i+1) + " met the expected sales with " + (sales[i] + " sales."));
			}
			else if (sales[i] > expectedSales)
			{
				System.out.println("Salesperson " + (i+1) + " exceeded the expected sales with " + (sales[i] + " sales."));
			}
			else if (sales[i] < expectedSales)
			{
				System.out.println("Salesperson " + (i+1) + " did not meet the expected sales with " + (sales[i]) + " sales.");
			}
		}
	}
}



	



