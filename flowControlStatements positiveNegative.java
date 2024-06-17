import java.util.*;
class posnegzero
{
  public static void main(String args[])
  {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    num=sc.nextInt();
    if(num>0)
      System.out.println(num+" "+"is a positive number");
    else if(num<0)
      System.out.println(num+" "+"is a negeative number");
    else
      System.out.println("it is a zero");
  }
}
    
