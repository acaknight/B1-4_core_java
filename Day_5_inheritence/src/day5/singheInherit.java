package day5;

 class Parent {
	void print()
	{
		System.out.println("hello, This is Zain");
	}
}
class Child extends Parent
{	
	void display()
	{
		System.out.println("Single Inheritence");
	}
	
}
class singhelinherit
{
	public static void main(String[] args) {
	Child c = new Child();
	c.display();
	c.print();
	}

}
