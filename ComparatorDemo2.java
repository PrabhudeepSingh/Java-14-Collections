//Program to insert String objects into TreeSet in reverse alphabetical order.

import java.util.*;
class ComparatorDemo2
{
	public static void main(String[] args)
	{
		TreeSet treeSet = new TreeSet(new MyComparator());
		treeSet.add("Prabhu");
		treeSet.add("Deep");
		treeSet.add("Singh");
		treeSet.add("Banga");
		
		System.out.println(treeSet);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String str1 = (String) obj1;
		String str2 = (String) obj2;
		
		return str2.compareTo(str1);
	}
}