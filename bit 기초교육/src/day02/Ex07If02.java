package day02;
// ����ڷκ��� �Է��� �޾Ƽ�
// Ȧ���� ��쿡�� Ȧ���Դϴ�! �� ��µǴ� ���α׷��� �ۼ��غ�����(7��)
import java.util.Scanner;
public class Ex07If02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���: ");
		int number = scanner.nextInt();
		
		//Ȧ����?
		//2�� ������ �������� 1�� ����
		System.out.println("����ڰ� �Է��� ����: "+number);
		if(number % 2 == 1) {
			System.out.println(number+"�� Ȧ���Դϴ�.");
		}
		
		if(number % 2 != 1) {
			System.out.println(number+"�� ¦���Դϴ�.");
		}
		
		
		
		scanner.close();
	}
}
