package day02;
// ����ڷκ��� ���̸� �Է¹޾Ƽ�
// ����/�̼����ڰ� ��µǴ� ���α׷��� �ۼ��ϼ���. (5��)
import java.util.Scanner;
public class Ex08IfElse02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̸� �Է����ּ���: ");
		int age = scanner.nextInt();
		if(age >= 18) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�̼������Դϴ�.");
		}
		
		scanner.close();
	}
}
