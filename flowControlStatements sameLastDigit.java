import java.util.*;
class samelastdigit
{
  public static void main(String[] args)
  {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the two positve integers:");
    a=sc.nextInt();
    b=sc.nextInt();
    int res1=a%10;
    int res2=b%10;
    if(res1==res2)
      System.out.println("true");
    else
       System.out.println("false");
  }
}
