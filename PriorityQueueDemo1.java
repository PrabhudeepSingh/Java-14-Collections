import java.util.*;

class PriorityQueueDemo1
{
	public static void main(String[] args)
	{
		PriorityQueue priorityQueue = new PriorityQueue();
		System.out.println(priorityQueue.peek()); //null
		//System.out.println(priorityQueue.element());  -> RE: NoSuchElementException
		
		for(int i=0; i<=10; i++)
		{
			priorityQueue.offer(i);
		}
		
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
	}
}