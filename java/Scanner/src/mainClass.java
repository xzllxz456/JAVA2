import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		
		//입력 (consol)
		Scanner sc = new Scanner(System.in);
		
		// boolean (true/false)
//		boolean b;
//		System.out.println("b = ");
//		b = sc.nextBoolean();
//		System.out.println(" b: " + b);
		// int (정수)
//		int i;
//		System.out.println("i = ");
//		i = sc.nextInt();
//		System.out.println("i : " + i);
		// double (소수)
		double d;
		System.out.println("d = ");
		d = sc.nextDouble();
		System.out.println(" d : " + d);
		// String (문자열)
		String str;
		System.out.println("str = ");
		str = sc.next();
		System.out.println("str : " + str);
	}
}
