import java.util.*;
class SearchElement
{
  public static void main(String[] args)
  {
    int[] a=new int[] {1,4,34,56,7};
    int search,flag=0;
    int index=0;
    Scanner sc = new Scanner(System.in);
    search=sc.nextInt();
    for(int i=0;i<a.length;i++)
    {
       if(a[i]==search)
       {
          flag=1;
          index=i;
       }
    }
    if(flag==1)
       System.out.println("element found at index: "+index);
    else
       System.out.println("-1");
   }
}
