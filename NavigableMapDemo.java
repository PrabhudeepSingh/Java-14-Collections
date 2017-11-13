import java.util.*;

class NavigableMapDemo
{
	public static void main(String[] args)
	{
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		
		treeMap.put("b", "bat");
		treeMap.put("c", "cat");
		treeMap.put("a", "apple");
		treeMap.put("d", "dog");
		treeMap.put("g", "gun");
		
		System.out.println(treeMap);
		System.out.println(treeMap.ceilingKey("c"));
		System.out.println(treeMap.higherKey("e"));
		System.out.println(treeMap.floorKey("e"));
		System.out.println(treeMap.lowerKey("e"));
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap.descendingMap());
		System.out.println(treeMap);	
	}
}