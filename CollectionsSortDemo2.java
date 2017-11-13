import java.util.*;

class CollectionsSortDemo2
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add("Z");
		arrayList.add("A");
		arrayList.add("K");
		arrayList.add("N");
		
		System.out.println("Before Sorting: " + arrayList);
		
		Collections.sort(arrayList, new MyComparator());
		System.out.println("After Sorting: " + arrayList);
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