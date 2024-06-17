import java.util.*;
class FlodyPattern
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int i,j;
    for(i=0;i<row;i++)
    {
      for(j=0;j<=i;j++)
      { 
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
      
