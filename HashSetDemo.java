import java.util.*;
class HashSetDemo
{
  public static void main(String[] args)
  {
    HashSet hashSet=new HashSet();
	
    hashSet.add("A");
    hashSet.add("B");
    hashSet.add("C");
    hashSet.add("D");
    hashSet.add("E");
    hashSet.add(null);
    hashSet.add(10);
	
    System.out.println(hashSet.add("A"));
    System.out.println(hashSet);
  }
}