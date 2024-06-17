import java.util.*;
import java.lang.*;
import java.io.*;
class calculator
{
 double pi;
 double pd;
 double PowerInt(int n1,int n2)
 {
   pi=Math.pow(n1,n2);
   return pi;
 }
 double PowerDouble(double n3,int n4)
 {
   pd=Math.pow(n3,n4);
   return pd;
 }
}
class CalculatorPower
{
  public static void main(String[] args)
  {
    calculator c= new calculator();
    System.out.println(c.PowerInt(3,4));
    System.out.println(c.PowerDouble(4.5,2));
  }
}
