class LargestSmallest
{
  public static void main(String[] args)
  {
    int[] a= new int[] {23,12,14,35,8};
    int i;
    for(i=0;i<a.length;i++)
    {
     for(int j=i+1;j<a.length;j++)
     {
       int temp=0;
       if(a[i]>a[j])
       {
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
      }
    }
    }
    for(i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
    System.out.println("the largest 2 numbers are:"+a[3]+" "+a[4]);
    System.out.println("the smallest 2 numbers are:"+a[0]+" "+a[1]);
   }
}

    
