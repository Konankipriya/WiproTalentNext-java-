class ArrayConcept
{
  public static void main(String[] args)
  {
    int a[]=new int[] {1,2,3,4,5};
    int x= a.length;
    int sum=0,avg,i;
    for(i=0;i<x;i++)
    {
      sum=sum+a[i];
    }
    System.out.println("sum of array elements:"+sum);
    avg=sum/x;
    System.out.println("average of array elements:"+avg);
  }
}  
