class MaxMinArray
{
  public static void main(String[] args)
  {
    int[] a=new int[] {12,34,23,10,65};
    int min=a[0];
    int max=a[0];
    int i;
    for(i=1;i<a.length;i++)
    {
       if(max<a[i])
          max=a[i];
       if(min>a[i])
          min=a[i];
    }
    System.out.println("maximum value in an array:"+max);
    System.out.println("manimum value in an array:"+min);
  }
}
    
