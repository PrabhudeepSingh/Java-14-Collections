import java.util.*;

class HashTableDemo
{
	public static void main(String args[])
	{
		Hashtable hashTable = new Hashtable();
		hashTable.put(new Temp(5), "A");
		hashTable.put(new Temp(2), "B");
		hashTable.put(new Temp(6), "C");
		hashTable.put(new Temp(15), "D");
		hashTable.put(new Temp(23), "E");
		hashTable.put(new Temp(16), "F");
		//hashTable.put(new Temp(20), null);   ->  NullPointerException
		
		System.out.println(hashTable);		
	}
}

class Temp
{
	int i;
	
	Temp(int i)
	{
		this.i = i;
	}
	
	public int hashCode()
	{
		return i;
	}
	
	public String toString()
	{
		return i+"";
	}
}