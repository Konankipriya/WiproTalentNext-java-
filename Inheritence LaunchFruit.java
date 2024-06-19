class Fruit
{
	protected String name;
	protected int size;
	protected String taste;
	public Fruit()
	{
		name="fruit name";
		size=0;
		taste="taste of fruit";
	}
	public void eat()
	{
		System.out.println(name+" "+":"+taste);
	}
}
class Apple extends Fruit
{
	public void eat()
	{
		System.out.println("fruit name : Apple");
		System.out.println("Taste: sweet");
	}
}
class Orange extends Fruit
{
	public void eat()
	{
		System.out.println("name:Orange");
		System.out.println("Taste:sweet and bitter");
	}
}
class LaunchFruit
{
	public static void main(String[] args) 
	{
		Fruit f=new Fruit();
		Apple a=new Apple();
		Orange o=new Orange();
		f.eat();
	    a.eat();
		o.eat();
	}
}
