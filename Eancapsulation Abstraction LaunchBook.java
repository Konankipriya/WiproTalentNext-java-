class Author
{
	private String name;
	private String email;
	private char gender;
	void setAuthorData(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
    }
	String getname()
	{
		return name;
	}
	String getemail()
	{
		return email;
	}
	char getgender()
	{
		return gender;
	}
}
class Books
{
	private String bookname;
	private double price;
	private int qtyinstock;
	void setBookData(String bookname, double price, int qtyinstock)
	{
		this.bookname=bookname;
		this.price=price;
		this.qtyinstock=qtyinstock;
    }
	String getbookname()
	{
		return bookname;
	}
	double getprice()
	{
		return price;
	}
	int getqtyinstock()
	{
		return qtyinstock;
	}
}
class LaunchBook 
{
	public static void main(String[] args) 
	{
		Books b=new Books();
		b.setBookData("java",200,5);
		Author a=new Author();
		a.setAuthorData("priya","priya1234@gmail.com",'F');
		System.out.println(b.getbookname());
		System.out.println(b.getprice());
		System.out.println(b.getqtyinstock());
		System.out.println(a.getname());
		System.out.println(a.getemail());
		System.out.println(a.getgender());



	}
}
