import java.util.*;
class  TreeSetDemo2
{
  public static void main(String[] args)
  {
     TreeSet treeSet=new TreeSet(new MyComparator());
     treeSet.add(10);
     treeSet.add(0);
     treeSet.add(15);
     treeSet.add(5);
     treeSet.add(20);
     treeSet.add(20);
     System.out.println(treeSet);
  }
}

class MyComparator implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
    Integer int1=(Integer)obj1;
    Integer int2=(Integer)obj2;

    if(int1<int2)
    return +1;

    else if(int1>int2)
    return -1;

    else
    return 0;
  }
}