package day7_this;

public class example3 {

	void print(example3 e)
	{
		System.out.println("JFS Developer");
	}
	void display()
	{
		print(this);
	}

	public static void main(String[] args) {
		example3 e=new example3();
		e.display();

	}

}
