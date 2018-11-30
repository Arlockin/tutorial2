package com.calderkalina.activities;


//************************************************************
//Count.java
//
//This program reads in strings (phrases) and counts the
//number of blank characters and certain other letters
//in the phrase.
//************************************************************
import java.util.Scanner;
public class CharacterCount
	{
	public static void main (String[] args)
	{
		String phrase = "continue"; // a string of characters
		int countBlank; // the number of blanks (spaces) in the phrase
		int countA;
		int countE;
		int countS;
		int countT; 
		int length; // the length of the phrase
		char ch; // an individual character in the string
		Scanner scan = new Scanner(System.in);
		//Print a program header
		System.out.println ();
		System.out.println ("Character Counter");
		System.out.println ();
		//Read in a string and find its length
		

		while(!phrase.equals("quit"))
		{
			System.out.print ("Enter a sentence or phrase or type quit to quit: ");
			phrase = scan.nextLine();
			length = phrase.length();
			if(!phrase.equals("quit"))
			{	
		
				//Initialize counts
				countBlank = 0;
				countA = 0;
				countE = 0;
				countS = 0;
				countT = 0;
			
				for(int i = 0; i < phrase.length(); i++)
				{
					ch = phrase.charAt(i);
					switch (ch)
					{
						case ' ':	countBlank++;
						break;
						case 'a':
						case 'A':	countA++;
						break;
						case 'e':
						case 'E':	countE++;
						break;
						case 's':
						case 'S':	countS++;
						break;
						case 't':
						case 'T':	countT++;
						break;
					}

				}
			//a for loop to go through the string character by character
			//and count the blank spaces
			//Print the results
			System.out.println ();
			System.out.println ("Number of blank spaces: " + countBlank);
			System.out.println ("Number of A's: " + countA);
			System.out.println ("Number of E's: " + countE);
			System.out.println ("Number of S's: " + countS);
			System.out.println ("Number of T's: " + countT);
			System.out.println ();
			}
		}
	}
}

	



