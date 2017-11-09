import java.util.*;
class EnumerationDemo
{
  public static void main(String[] args)
  {
    Vector vector=new Vector();
    for(int i=0;i<=10;i++)
    {
      vector.addElement(i);
    }
    System.out.println(vector);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    Enumeration enm=vector.elements();
    while(enm.hasMoreElements())
    {
      Integer I=(Integer)enm.nextElement();
      if(I % 2==0)
      System.out.println(I);//0 2 4 6 8 10
      else
      {
        System.out.println(I);
        vector.remove(I);
       }
    }
  }
}
