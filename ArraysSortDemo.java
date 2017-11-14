import java.util.*;

class ArraysSortDemo
{
	public static void main(String[] args)
	{
		int[] arr = {10, 5, 20, 11, 6};

		System.out.println("Primitive Array Before Sorting:");
		for(int val: arr)
		{
			System.out.println(val);
		}

		Arrays.sort(arr);

		System.out.println("Primitive Array After Sorting:");
		for(int val: arr)
		{
			System.out.println(val);
		}

		String[] str = {"A", "Z", "B"};

		System.out.println("Object Array Before Sorting");
		for(String str1: str)
		{
			System.out.println(str1);
		}

		Arrays.sort(str);

		System.out.println("Object Array After Sorting");
		for(String str1: str)
		{
			System.out.println(str1);
		}

		Arrays.sort(str, new MyComparator());

		System.out.println("Object Array After Sorting by Comparator");
		for(String str1: str)
		{
			System.out.println(str1);
		}
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