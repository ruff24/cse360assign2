// William Barnett
// ID: 248
// CSC360
// File: SimepleList

package cse360assign2;

class SimpleList {

	private int[] list;
	private int count;
	
	SimpleList()
	{
		list =new int[10];	// allocates space for ten integers
		count = 0;
	} 

	void add(int x) 
	{		
		// temporary holder for list
		int[] temp = new int[10];
		
		// adds element to the list
		temp[0] = x;
		
		// adds all existing elements on top
		for(int i = 1; i <= count; i++)
		{
			temp[i] = list[i - 1];
		}
		
		// set list to new updated list
		list = temp;
		
		// if list is less than 10 elements, up the count
		if(count < 10)
		{
			count++;
		}
	}
	
	// returns the counter
	int count()
	{
		return count;
	}
	
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
	
	// returns first integer
	int first()
	{
		return list[0];
	}
	
	// returns last integer
	int last()
	{
		return list[count];
	}
}
