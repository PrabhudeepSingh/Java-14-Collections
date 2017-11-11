import java.util.*;

class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap hashMap = new HashMap();
		hashMap.put("Prabhu",100);
		hashMap.put("Deep",200);
		hashMap.put("Singh",300);
		hashMap.put("Banga",400);
		
		System.out.println(hashMap);
		System.out.println(hashMap.put("Prabhu",100));
		
		Set set = hashMap.keySet();
		System.out.println(set);
		
		Collection collection = hashMap.values();
		System.out.println(collection);
		
		Set entrySet = hashMap.entrySet();
		System.out.println(entrySet);
		
		Iterator itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry mapEntry = (Map.Entry) itr.next();
			System.out.println(mapEntry.getKey()+", "+mapEntry.getValue());
			
			if(mapEntry.getKey().equals("Prabhu"))
				mapEntry.setValue(1000);
		}
		
		System.out.println(hashMap);
	}
}