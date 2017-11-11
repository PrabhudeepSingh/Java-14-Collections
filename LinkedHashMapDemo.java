import java.util.*;

class LinkedHashMapDemo
{
	public static void main(String args[])
	{
		LinkedHashMap linkedHashMap = new LinkedHashMap();
		linkedHashMap.put("Prabhu",100);
		linkedHashMap.put("Deep",200);
		linkedHashMap.put("Singh",300);
		linkedHashMap.put("Banga",400);
		
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.put("Prabhu",100));
		
		Set set = linkedHashMap.keySet();
		System.out.println(set);
		
		Collection collection = linkedHashMap.values();
		System.out.println(collection);
		
		Set entrySet = linkedHashMap.entrySet();
		System.out.println(entrySet);
		
		Iterator itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry mapEntry = (Map.Entry) itr.next();
			System.out.println(mapEntry.getKey()+", "+mapEntry.getValue());
			
			if(mapEntry.getKey().equals("Prabhu"))
				mapEntry.setValue(1000);
		}
		
		System.out.println(linkedHashMap);
	}
}