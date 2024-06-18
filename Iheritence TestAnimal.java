class Person
{
	private String name;
	Person(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
}
class Employee extends Person
{
	private double annualsalary;
	private long year;
	private String insurance;
	Employee(String name,double annualsalary,long year,String insurance)
	{
		super(name);
		this.annualsalary=annualsalary;
		this.year=year;
		this.insurance=insurance;
	}
	public double getsalary()
	{
		return annualsalary;
	}
	public long getyear()
	{
		return year;
	}
	public String getinsurance()
	{
		return insurance;
	}
}
class  TestEmployee
{
	public static void main(String[] args) 
	{
		Employee e=new Employee("priya",30000,2023,"1234t576");
		System.out.println(e.getname());
		System.out.println(e.getsalary());
		System.out.println(e.getyear());
		System.out.println(e.getinsurance());


	}
}
