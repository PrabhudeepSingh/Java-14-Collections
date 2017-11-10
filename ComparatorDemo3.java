//Program to insert StringBuffer objects into the TreeSet in reverse alphabetical order.

import java.util.*;

class ComparatorDemo3
{
	public static void main(String[] args)
	{
		TreeSet treeSet = new TreeSet(new MyComparator());
		treeSet.add(new StringBuffer("Prabhu"));
		treeSet.add(new StringBuffer("Deep"));
		treeSet.add(new StringBuffer("Singh"));
		treeSet.add(new StringBuffer("Banga"));
		
		System.out.println(treeSet);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String str1 = obj1.toString();
		String str2 = obj2.toString();
		
		return str2.compareTo(str1);
	}
}