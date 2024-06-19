class Shape
{
	void draw()
	{
		System.out.println("shape drawing");
	}
	void erase()
	{
		System.out.println("shape erasing");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
	void erase()
	{
		System.out.println("erasing circle");
	}
}
class Traingle extends Shape
{
	void draw()
	{
		System.out.println("drawing triangle");
	}
	void erase()
	{
		System.out.println("erasing traingle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("drawing square");
	}
	void erase()
	{
		System.out.println("erasing square");
	}
}
class maths
{
	void permit(Shape ref)
	{
		ref.draw();
		ref.erase();
	}
}
class  LaunchShape
{
	public static void main(String[] args) 
	{
		Traingle t=new Traingle();
		Circle c=new Circle();
		Square s=new Square();
		maths m=new maths();
		m.permit(t);
		m.permit(c);
		m.permit(s);
		
	}
}
