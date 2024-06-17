class example
{
  public static void main(String[] args)
  {
    if(args.length == 0)
       System.out.println("no values");
     else if(args.length>1)
          System.out.println(args[0]+","+args[1]);
       else
          System.out.println(args[0]);
  }
}
