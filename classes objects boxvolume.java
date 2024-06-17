class Box
{
  double h,w,d;
  Box(double width,double height,double depth)
  {
    h=height;
    w=width;
    d=depth;
  }
  double volume()
  {
    double v;
    v=h*w*d;
    return v;
  }
}
class BoxVolume
{
  public static void main(String[] args)
  {
    Box bc=new Box(7.9,9.8,4.6);
    System.out.println(bc.volume());
  }
}
