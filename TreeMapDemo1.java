import java.util.*;

class TreeMapDemo1
{
	public static void main(String args[])
	{
		TreeMap treeMap = new TreeMap();
		treeMap.put(100,"A");
		treeMap.put(103,"B");
		treeMap.put(101,"C");
		treeMap.put(104,106);
		
		//treeMap.put("D","E");   -> ClassCastException
		//treeMap.put(null, "F"); -> NullPointerException
		
		System.out.println(treeMap);
	}
}