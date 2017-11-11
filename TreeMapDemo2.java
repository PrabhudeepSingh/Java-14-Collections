import java.util.*;

class TreeMapDemo2
{
	public static void main(String args[])
	{
		TreeMap treeMap = new TreeMap(new MyComparator());
		treeMap.put("X",10);
		treeMap.put("A",20);
		treeMap.put("Z",30);
		treeMap.put("L",40);
		
		System.out.println(treeMap);
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