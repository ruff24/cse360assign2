/*
 * William Barnett
 * ID: 248
 * CSC360
 * File: SimpleList.java
 * 
 * Description:
 * A list that uses an array to store integers. Allowed add, remove, search, append the list.
 * 
 * GitHub URL:
 * https://github.com/ruff24/cse360assign2.git
 */

package cse360assign2;

class SimpleList {

	// private int array "list"
	private int[] list;
	// counter to keep track of integers
	private int count;
	
	// constructor creating space for the list 
	// setting count to zero
	SimpleList()
	{
		list = new int[10];	
		count = 0;
	}

	// adds an integer to the front of the list, pushing everything else back
	void add(int x) 
	{		
		count++;
		int[] temp;
		
		//  decides if list needs to be extended
		if(count > list.length)
		{
			int newSize = list.length + (list.length /2);
			temp = new int[newSize];
		}
		else
		{
			temp = new int[list.length];
		}
		
		// adds element to the list
		temp[0] = x;
		
		// adds all existing elements on top
		for(int i = 1; i <= count; i++)
		{
			temp[i] = list[i - 1];
		}
		
		// set list to new updated list
		list = temp;
	}
	
	// removing an element from the list
	void remove(int x)
	{
		// indexing 
		int index = search(x);
		
		// if the search method did find the element
		if(index != -1)
		{
			// removes the element by replacing it with the element after
			while(index < count)
			{
				list[index] = list[index + 1];
				index++;
			}
			
			// brings down count
			count--;
			
			// if less than 25% empty, using double for decimal
			double percent = (count / (double) list.length);
			
			if (percent <= 0.25)
			{
				// floor of new size of list
				int newSize = list.length / 2;
				
				// temp list with new size
				int[] temp = new int[newSize + 1];
				
				for(int i = 0; i < count; i++)
				{
					temp[i] = list[i];
				}
				
				list = temp;
			}
		}
	}
	
	// returns the counter
	int count()
	{
		return count;
	}
	
	// returns a string of all elements
	public String toString()
	{
		// if there's nothing in the list, return nothing
		if(count == 0)
		{
			return null;
		}
		
		// creates a blank string
		String s = "";
		
		// adds number to string each loop
		for(int i = 0; i < count; i++)
		{
			s += (list[i] + " ");
		}
		
		// returns string
		return s;
	}
	
	// searches the list for an element
	// returns a -1 if not found, the index if found
	int search(int x)
	{
		// increments through the list
		for(int i = 0; i < count; i++)
		{
			// checks list against the parameter
			if(list[i] == x)
			{
				// return index if found
				return i; 
			}
		}
		
		// returns -1 if the paramter was not found
		return -1;	
	}
	
	// adds element to the back of the list
	void append(int x)
	{
		count++;
		
		// determines if list needs extra space
		if(count > list.length-1)
		{
			// creates temporary array with extended space
			int newSize = list.length + (list.length /2);
			
			int[] temp = new int[newSize];
			
			for(int i = 0; i < count; i++)
			{
				temp[i] = list[i];
			}
			
			list = temp;
		}
		
			list[count -1] = x;
	}
	
	// returns the first integer in list
	int first()
	{
		return list[0];
	}
	
	// returns last integer in list
	int last()
	{
		return list[count -1];
	}
	
	// returns the length of the list
	int size()
	{
		return list.length;
	}
}
