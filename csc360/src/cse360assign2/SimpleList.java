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
		list = new int[10];	// allocates space for ten integers
		count = 0;
	}

	void add(int x) 
	{		
		count++;
		int[] temp;
		
		if(count > list.length)
		{
			int newSize = list.length + (list.length /2);
			temp = new int[newSize];
		}
		else
		{
			temp = new int[10];
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
		int index = 0;
		
		//starts the search
		while(index <= count)
		{
			// comparing
			if(x == list[index])
			{
				// removes the element by replacing it with the element after
				while(index < count)
				{
					list[index] = list[index + 1];
					index++;
				}
				// no repeats of the last two elements
				list[index] = (Integer) null;
			}
			// move onto next index
			index++;
		}
		// brings down count
		count--;
		
		// if less than 25% empty, using double for decimal
		double percent = count / list.length;
		
		if (percent <= 0.25)
		{
			// floor of new size of list
			int newSize = list.length / 2;
			
			// temp list with new size
			int[] temp = new int[newSize];
			
			for(int i = 0; i <= count; i++)
			{
				temp[i] = list[i];
			}
			
			list = temp;
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
	
}
