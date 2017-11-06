import java.util.*;
class ArrayListDemo1
{
  public static void main(String[] args)
  {
    ArrayList arrList=new ArrayList();
    arrList.add("A");
    arrList.add("B");
    arrList.add(10);
    arrList.add(null);
	System.out.println(arrList);
    
	arrList.remove(2);
    System.out.println(arrList);
    
	arrList.add(2,"M");
    System.out.println(arrList);
  }
}