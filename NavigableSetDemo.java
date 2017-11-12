//NavigableSetDemo is an interface whose methods are implemented in TreeSet class.

import java.util.*;

class NavigableSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(50);
		
		System.out.println(treeSet);
		System.out.println(treeSet.ceiling(20));
		System.out.println(treeSet.higher(20));
		System.out.println(treeSet.floor(30));
		System.out.println(treeSet.lower(30));
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		System.out.println(treeSet.descendingSet());
		System.out.println(treeSet);
	}
}