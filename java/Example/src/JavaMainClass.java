import java.util.Scanner;

public class JavaMainClass {
	public static void main(String[] args) {
		/*
		 * 편의점 프로그램
		 * 
		 * 지불해야 할 금액: 	3230원
		 * 자신의 금액: 		10000원
		 * 
		 * 거스름 돈: 			?????
		 * 5000원 몇장 1000원 몇장 500원 몇개 100원 몇개 50원 몇개?10원 몇개?
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("물건가격: ");
		int pri = sc.nextInt();
		System.out.println("내돈: ");
		int money = sc.nextInt();
		
		int result = money - pri;
		
		System.out.println("거스름돈 : " + result);
		int fiveTh = result / 5000;
		System.out.println("오천원: " +fiveTh);
		result = result % 5000;
		
		int thous = result / 1000;
		System.out.println("천원: " + thous);
		result = result % 1000;
		
		int fiveHun = result / 500;
		System.out.println("오백원: " + fiveHun);
		result = result % 500;
		
		int hun = result / 100;
		System.out.println("백원: " + hun);
		result = result % 100;
		
		int fif = result / 50;
		System.out.println("오십원: " + fif);
		result = result % 50;
		
		int ten = result / 10;
		System.out.println("십원" + ten);
		result = result % 10;

	}
}
