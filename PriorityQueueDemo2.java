import java.util.*;

class PriorityQueueDemo2
{
	public static void main(String[] args)
	{
		PriorityQueue priorityQueue = new PriorityQueue(15, new MyComparator());
		
		priorityQueue.offer("A");
		priorityQueue.offer("Z");
		priorityQueue.offer("L");
		priorityQueue.offer("B");
		System.out.println(priorityQueue);
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