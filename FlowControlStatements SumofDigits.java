import java.util.*;
class SumOfDigits
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum;
    for(sum=0;n!=0;n=n/10)
    {
       sum=sum+n%10;
    }
    System.out.println("sum of digits:"+sum);
  }
}
