import java.util.*;

class  TreeSetDemo1
{
  public static void main(String[] args)
  {
    TreeSet treeSet=new TreeSet();
	
    treeSet.add("A");
    treeSet.add("B");
    treeSet.add("C");
    treeSet.add("D");
    treeSet.add("E");
	
    System.out.println(treeSet);
	
    /* treeSet.add(new Integer(10));
    treeSet.add(null);
    System.out.println(treeSet);*/
  }
}