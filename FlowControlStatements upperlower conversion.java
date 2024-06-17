import java.util.*;
class upperlowercase
{
  public static void main(String[] args)
  {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the character:");
    ch=sc.next().charAt(0);
    char lower=Character.toLowerCase(ch);
    char upper=Character.toUpperCase(ch);
    if(ch>='a' && ch<='z')
      System.out.println(upper);
    else
      System.out.println(lower);
  }
}
