import java.util.*;
class PrimeOrNot
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int flag=0,i;
    for(i=2;i<n;i++)
    {
      if(n%i==0)
         flag++;
    }
    if(flag==0)
       System.out.println("it is a prime number");
    else
       System.out.println("it is not a prime number");
  }
}
