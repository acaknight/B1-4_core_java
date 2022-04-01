package day3;

public class car {
	String name;
	car(String n)
	{
		name = n;
	}
	void display()
	{
		System.out.println(" this car is from : "+ name);
	}
	public static void main(String[] args) {
		
		car s1 = new car("BMW");
		car s2 = new car("Audi");
		car s3 = new car("lexes");
		s1.display();
		s2.display();
		s3.display();
	}

}
