//Program to insert integer objects into the TreeSet where the sorting order is descending. 

import java.util.*;

class ComparatorDemo1
{
	public static void main(String[] args)
	{
		TreeSet treeSet = new TreeSet(new MyComparator());
		
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(20);
		treeSet.add(20);
		
		System.out.println(treeSet);
	}	
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer var1 = (Integer) obj1;
		Integer var2 = (Integer) obj2;
		
		if(var1 < var2)
			return +1;
		
		else 
			if(var1 > var2)
				return -1;
			
			else 
				return 0;
	}
}