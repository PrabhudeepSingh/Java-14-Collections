//Program to insert String and StringBuffer Objects  into TreeSet where sorting order is increasing length order.
//If two Objects are having same length then consider there alphabetical order.

import java.util.*;

class ComparatorDemo4
{
	public static void main(String[] args)
	{
		TreeSet treeSet = new TreeSet(new MyComparator());
		
		treeSet.add("A");
		treeSet.add(new StringBuffer("ABC"));
		treeSet.add(new StringBuffer("AA"));
		treeSet.add("BB");
		treeSet.add("ABCD");
		treeSet.add("A");
		
		System.out.println(treeSet);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String str1 = obj1.toString();
		String str2 = obj2.toString();
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 < len2)
			return 1;
			
		else
			if(len > len2)
				return -1;
			
			else 
				str1.compareTo(str2);
	}
}