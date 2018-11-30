package com.calderkalina.intlist;

import java.util.Arrays;

//***************************************************************
//FILE: IntList.java
//
//Purpose: Defines a class that represents a list of integers
//
//***************************************************************
public class IntList
{
	private IntNode front; //first node in list

	//-----------------------------------------
	//Constructor. Initially list is empty.
	//-----------------------------------------
	public IntList()
	{
		front = null;
	}

	//-----------------------------------------
	//Adds given integer to front of list.
	//-----------------------------------------
	public void addToFront(int val)
	{
		front = new IntNode(val,front);
	}

	//-----------------------------------------
	//Adds given integer to end of list.
	//-----------------------------------------
	public void addToEnd(int val)
	{
		IntNode newnode = new IntNode(val,null);

		//if list is empty, this will be the only node in it
		if (front == null)
			front = newnode;
		else
		{
			//make temp point to last thing in list
			IntNode temp = front;
			while (temp.next != null)
				temp = temp.next;
			//link new node into list
			temp.next = newnode;
		}
	}

	//-----------------------------------------
	//Removes the first node from the list.
	//If the list is empty, does nothing.
	//-----------------------------------------
	public void removeFirst()
	{
		if (front != null)
			front = front.next;
	}

	//------------------------------------------------
	//Prints the list elements from first to last.
	//------------------------------------------------
	public void print()
	{
		System.out.println("--------------------");
		System.out.print("List elements: ");

		IntNode temp = front;

		while (temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}

		System.out.println("\n-----------------------\n");
	}

	//-----------------------------------------
	//Removes the last node from the list.
	//If the list is empty, does nothing.
	//-----------------------------------------
	public void removeLast()
	{
		//checks for empty list
		if (front == null)
		{
			return;
		}
		//single item list, no need to iterate through
		if (front.next == null)
		{
			front = null;
			return;
		}
		IntNode parent = front;
		IntNode child = front.next;

		//while there is a child/at least 2 nodes
		while(parent.next != null)
		{
			//if the child is the last in the list?
			if (child.next == null)
			{
				parent.next = null;
			}
			else
			{
				//shifts the parent and child focus over by 1 node to check if the child is the last
				parent = child;
				child = parent.next;
			}
		}
	}
	
	public void replace(int oldVal, int newVal)
	{
		IntNode temp = front;
		for(int i = 0; i < this.length(); i++)
		{
			if(temp.val == oldVal)
			{
				temp.val = newVal;
			}
			temp = temp.next;
		}
	}


	//Returns the length of the IntList
	public int length()
	{
		int size = 0;

		if (this.front != null)
		{
			//if the front of the list has a value, we immediately increment the length of the list because we know one item exists.
			size++;
			for(IntNode n = front; n.next != null; n = n.next)
			{
				size++; 
			}
		}
		return size;
	}

	//Returns a string of the list
	public String toString()
	{
		//same as print method but we do not include system.out.print because this is simply meant to return a string
		String listString = "";
		IntNode temp = front;

		while (temp != null)
		{
			listString += temp.val + " ";
			temp = temp.next;
		}
		return listString;
	}

	//*************************************************************
	//An inner class that represents a node in the integer list.
	//The public variables are accessed by the IntList class.
	//*************************************************************
	private class IntNode
	{
		public int val; //value stored in node
		public IntNode next; //link to next node in list

		//------------------------------------------------------------------
		//Constructor; sets up the node given a value and IntNode reference
		//------------------------------------------------------------------
		public IntNode(int val, IntNode next)
		{
			this.val = val;
			this.next = next;
		}
	}
}
