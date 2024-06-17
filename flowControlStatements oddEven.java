import java.util.*;
class oddeven
{
  public static void main(String[] args)
  {
    int num;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number:");
    num=sc.nextInt();
    if(num%2==0)
      System.out.println("it is a even number");
    else
      System.out.println("it is a odd number");
   }
}
