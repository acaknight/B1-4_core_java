package day5;

class bike
{
	void print() {
		System.out.println(" i like IC bike");
	}
}
class evbike extends bike
{
	void display()
	{
		System.out.println(" i like EV bike");
	}
}
class hybbike extends evbike
{
	void assigne()
	{
		System.out.println(" I like Hybride bikes");
	}
}


public class MultiLevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hybbike h = new hybbike();
		h.display();
		h.print();
		h.assigne();
	}

}
