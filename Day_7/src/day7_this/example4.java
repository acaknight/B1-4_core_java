package day7_this;

public class example4 {
	String str;
	example4()
	{
		str="Kavan";
	}
		example4 get()
	{
		return this;
	}
	void display()
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		example4 e=new example4();
		e.get().display();

	}

}
