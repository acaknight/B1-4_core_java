package day6_git;

abstract class Animal
{
	abstract void eat();
}
class Herbivores extends Animal
{
	void eat()
	{
		System.out.println("I am vegetarian");
	}
}
class Carnivores extends Animal
{
	void eat()
	{
		System.out.println("I am non-vegetarian");
	}
}

public class example_1 {

	
		public static void main(String[] args) {
			Animal h=new Herbivores();
			Animal c=new Carnivores();
			h.eat();
			c.eat();

	}

}
