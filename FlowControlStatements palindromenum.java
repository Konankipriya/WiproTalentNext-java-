import java.util.*;
class PalindromeNum
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int rem,sum=0;
    int n=num;
    while(num!=0)
    {
      rem=num%10;
      sum=sum*10+rem;
      num=num/10;
    }
    if(sum==n)
       System.out.println("it is palindrome");
    else
      System.out.println("it is not a palindrome");
  }
}
     
