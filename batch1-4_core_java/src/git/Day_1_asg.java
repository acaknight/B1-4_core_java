package git;
import java.util.Scanner;
import java.util.*;

public class Day_1_asg {
	public static void main( String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum, sub, div, mul, mod;
		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		mod = a % b;
		System.out.println("SUM = " + sum);
		System.out.println("SUB = "+ sub);
		System.out.println("MUL = "+ mul);
		System.out.println("DIV = "+ div);
		System.out.println("MOD = "+ mod);
		
		
		
	}

}
