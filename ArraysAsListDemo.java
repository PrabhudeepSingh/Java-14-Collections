import java.util.*;
class ArraysAsListDemo
{
	public static void main(String[] args) 
	{
		String[] str = {"A", "Z", "B"};
		List list = Arrays.asList(str);
		System.out.println(list);

		str[0] = "K";
		System.out.println(list);

		list.set(1, "L");

		for(String str1: str)
		{
			System.out.println(str1);
		}

		//list.add("Prabhu");  ->  UnsupportedOperationException
		//list.remove(2);      ->  UnsupportedOperationException
		//list.set(1, new Integer(10));  ->  ArrayStoreException 
	}	
}