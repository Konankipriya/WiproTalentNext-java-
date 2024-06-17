import java.util.*;
class colorcode
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if(ch=='R' || ch=='r')
      System.out.println("Red");
    else if(ch=='W' || ch=='w')
      System.out.println("White");
    else if(ch=='G' || ch=='g')
      System.out.println("Green");
    else if(ch=='B' || ch=='b')
      System.out.println("Black and Blue");
    else if(ch=='O' || ch=='o')
      System.out.println("Orange");
    else if(ch=='Y' || ch=='y')
      System.out.println("Yellow");
    else
       System.out.println("Invalid input");
  }
}
