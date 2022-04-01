package day5;

class CellPhone
{
	void message()
	{
		System.out.println(" hi zain");
	}
	void call()
	{
		System.out.println(" I am calling Kavan");
	}
}
class Samsung extends CellPhone
{
	void Facelock()
	{
		System.out.println("Modern Facelock");
	}
}
class oneplus extends CellPhone
{
	void Game()
	{
		System.out.println("PUB-G");
	}
}
public class HierchcialInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung t = new Samsung();
		oneplus p = new oneplus();
		p.message();
		t.message();
		p.call();
		p.Game();
		
	}

}
