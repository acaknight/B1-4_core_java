package instance;
class Parent
{
	
}
class Child extends Parent
{
	
}
public class parent_inst_example {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c instanceof Parent);

	}

}
