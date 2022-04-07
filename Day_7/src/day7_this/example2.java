package day7_this;

public class example2{
	int a,b;
	
	void display(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void print()
	{
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
	}
	
	public static void main(String[] args) {
		example2 e=new example2();
		e.display(10, 25);
		e.print();

	}

}
