import java.util.*;
class StackDemo
{
  public static void main(String[] args)
  {
    Stack stack=new Stack();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    stack.push("D");
    System.out.println(stack);//[A, B, C, D]

    stack.pop();
    System.out.println(stack);[A, B, C]

    System.out.println(stack.peek());//C
    System.out.println(stack);//[A, B, C]

    System.out.println(stack.search("A"));//3
    System.out.println(stack.search("W"));// -1
    System.out.println(stack.empty());//false
  }
}