import java.util.*;

class CollectionsSearchDemo1
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add("Z");
		arrayList.add("A");
		arrayList.add("M");
		arrayList.add("K");
		arrayList.add("a");
		
		System.out.println(arrayList);
		Collections.sort(arrayList);
		
		System.out.println(arrayList);
		System.out.println(Collections.binarySearch(arrayList, "Z"));
		System.out.println(Collections.binarySearch(arrayList, "J"));
	}
}