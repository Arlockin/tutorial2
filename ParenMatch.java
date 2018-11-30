package com.calderkalina.parentheses;

//********************************************************************

//ParenMatch.java

//

//Determines whether or not a string of characters contains

//matching left and right parentheses.

//********************************************************************


import java.util.*;

import java.util.Scanner;


public class ParenMatch

{

	public static void main (String[] args)

	{

		Stack<Character> s = new Stack<Character>();

		String line; // the string of characters to be checked

		Scanner scan = new Scanner(System.in);
		
		String preError = "";
		
		Boolean error = false;

		System.out.println ("\nParenthesis Matching");

		System.out.print ("Enter a parenthesized expression: ");

		line = scan.nextLine();

		//loop to process the line one character at a time
		//pushback each char of line onto s
		for(int i = 0; i < line.length(); i++)
		{
			char current = line.charAt(i);
			//adds the current character to the pre error string
			preError = preError + current;
			//adds left paren to the stack
			if(current == '(')
			{
				s.push(current);
			}
			else if(current == ')')
			{
				//removes previous left parentheses to match if there are previous parentheses
				if(s.size() > 0)
				{
					s.pop();
				}
				else
				{
					System.out.println("There is a non matching closing parenthese.");
					System.out.println(preError + " -> )");
					error = true;
					break;
				}
			}
		}
		
		//we've iterated through the stack. if there are left parenthesis that have not been popped, this will alert that there is a non match
		if(s.size() > 0)
		{
			System.out.println("There are " + s.size() + " unmatched left parenthesis.");
		}
		else if(error != true)
		{
			System.out.println("All parenthesis have matches.");
		}


	}

}