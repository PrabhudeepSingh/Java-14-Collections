import java.util.*;

class CollectionsSearchDemo2
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add(15);
		arrayList.add(0);
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(5);
		
		System.out.println(arrayList);
		Collections.sort(arrayList, new MyComparator());
		
		System.out.println(arrayList);
		System.out.println(Collections.binarySearch(arrayList, 10, new MyComparator()));
		System.out.println(Collections.binarySearch(arrayList, 13, new MyComparator()));
		System.out.println(Collections.binarySearch(arrayList, 17));
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer val1 = (Integer) obj1;
		Integer val2 = (Integer) obj2;
		return val2.compareTo(val1);
	}
} 