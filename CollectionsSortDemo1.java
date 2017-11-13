import java.util.*;

class CollectionsSortDemo1
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add("Z");
		arrayList.add("A");
		arrayList.add("K");
		arrayList.add("N");
		
		System.out.println("Before Sorting: " + arrayList);
		
		Collections.sort(arrayList);
		System.out.println("After Sorting: " + arrayList);
	}
}