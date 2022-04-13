package day12_multithreading;

public class example1 extends Thread {
	public void run()
	{
		System.out.println("Thread is going to run");
	}

	public static void main(String[] args) 
	{
		example1 e=new example1();
		e.start();

	}

}
