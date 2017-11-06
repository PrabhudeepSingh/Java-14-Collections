import java.util.*;
import java.io.*;
class ArrayListDemo1
{
  public static void main(String[] args)
  {
    LinkedList linkList=new LinkedList();
    ArrayList arrList=new ArrayList();
	
    System.out.println(arrList instanceof Cloneable);//true
    System.out.println(linkList instanceof Serializable);//true
    System.out.println(arrList instanceof RandomAccess); //true
    System.out.println(linkList instanceof RandomAccess); //false
    System.out.println(arrList instanceof Serializable);//true
  }
}