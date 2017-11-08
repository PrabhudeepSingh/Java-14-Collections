import java.util.*;
class VectorDemo
{
  public static void main(String[] args)
  {
    Vector vector=new Vector();
    System.out.println(vector.capacity());
    for(int i=0;i<10;i++)
    {
      vector.addElement(i);
    }
    System.out.println(vector.capacity());

    vector.addElement("A");
    System.out.println(vector.capacity());

    System.out.println(vector);
    vector.removeElementAt(2);
    System.out.println(vector.lastElement());

    vector.clear();
    System.out.println(vector);
  }
}