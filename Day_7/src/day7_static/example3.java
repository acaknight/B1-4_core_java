package day7_static;

public class example3 {

	static String str;
	static int a;
	static
	{
		str="Zainul Azam";
		a=22;
	}

	public static void main(String[] args) {
		System.out.println(str);
		System.out.println(a);
}
}