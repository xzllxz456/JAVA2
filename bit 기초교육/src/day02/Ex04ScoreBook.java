package day02;
// ����ڷκ���
// �̸�, ����, ����, ����, ���� ������ �Է� �޾Ƽ�
// �̸�: ���翵 ����: 015��
// ����: 080�� ����: 081�� ����: 080��
// ����: 241�� ���: 80.33��
// �� �������� ����� �ǰ� ���α׷��� �ۼ��ϼ���(12�� 25�б���)
import java.util.Scanner;
public class Ex04ScoreBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = scanner.nextLine();
		
		System.out.print("����: ");
		int age = scanner.nextInt();
		
		System.out.print("����: ");
		int korean = scanner.nextInt();
		
		System.out.print("����: ");
		int english = scanner.nextInt();
		
		System.out.print("����: ");
		int math = scanner.nextInt();
		
		int sum = korean + english + math;
		double average = sum / 3.0;
		
		System.out.printf("�̸�: %s ����: %03d��\n", name, age);
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", 
				korean, english, math);
		System.out.printf("����: %d�� ���: %.2f��\n", sum, average);
		
		scanner.close();
	}
}
