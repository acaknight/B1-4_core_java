package day6_git;

class Animal1
{  
	Animal1()
	{	
		System.out.println("animal is created");
	}  
}  
class Dog extends Animal1
{  
	Dog()
	{  
		super();  
		System.out.println("dog is created");  
	}  
}  
public class example_4
{  
	public static void main(String[] args)
	{  
		Dog d=new Dog(); 
		
	}
}  