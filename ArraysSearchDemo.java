import java.util.*;
class ArraysSearchDemo
{
	public static void main(String[] args)
	{
		int[] arr = {10, 15,  5, 20, 6};
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 14));
		
		String[] str = {"A", "Z", "B"};
		Arrays.sort(str);
		System.out.println(Arrays.binarySearch(str, "Z"));
		System.out.println(Arrays.binarySearch(str, "C"));

		Arrays.sort(str, new MyComparator());
		System.out.println(Arrays.binarySearch(str, "Z", new MyComparator()));
		System.out.println(Arrays.binarySearch(str, "S", new MyComparator()));
		System.out.println(Arrays.binarySearch(str, "N", new MyComparator()));
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