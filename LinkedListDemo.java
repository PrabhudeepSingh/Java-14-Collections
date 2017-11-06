import java.util.*;
class LinkedListDemo
{
  public static void main(String[] args)
  {
    LinkedList arrList=new LinkedList();
    arrList.add("A");
    arrList.add("B");
    arrList.add(10);
    arrList.add(null);
    System.out.println(arrList);
	
    arrList.remove(2);
    System.out.println(arrList);
    
	arrList.add(2,"M");
    System.out.println(arrList);
    
	arrList.removeLast(); 
    System.out.println(arrList);
    
	arrList.addFirst("llist"); 
    System.out.println(arrList);
  }
}