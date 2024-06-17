class Animal
{
	void eat()
	{
		System.out.println("animals will eat");
	}
	void sleep()
	{
		System.out.println("animals will sleep");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("birds eats insects specific food based on species");
	}
	void sleep()
	{
		System.out.println("birds will sleep at differnt times respectives to species");

	}
	void fly()
	{
		System.out.println("some will fly high and some will fly low");
	}
}
class LaunchAnimal
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}
