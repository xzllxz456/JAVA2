package day03;
// while�� Ƚ�� ������ ���� �ݺ����̴�.
// ���� Ư�� ������ ��� üũ�Ͽ� �츮�� ���ϴ� �뵵�� ��밡���ϴ�.

// ����ڰ� �ڿ����� �Է��� �� �ְ� �����ϴ� ���α׷�
import java.util.Scanner;
public class Ex11While02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ڿ����� �Է����ּ���: ");
		int userNumber = scanner.nextInt();
		
		while(userNumber < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print("�ڿ����� �Է����ּ���: ");
			userNumber = scanner.nextInt();
		}
		
		System.out.println("����ڰ� �Է��� �ڿ����� "+userNumber+"�Դϴ�.");
		
		scanner.close();
	}
}
