import java.util.*;

class CollectionsReverseDemo
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		arrayList.add(15);
		arrayList.add(0);
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(5);

		System.out.println(arrayList);

		Collections.reverse(arrayList);
		System.out.println(arrayList);		
	}
}