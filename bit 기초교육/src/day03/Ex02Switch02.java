package day03;

// ����ڷκ��� ���̸� �Է¹޾Ƽ�
// ����, �̼����ڸ� ����ϴ� ���α׷���
// switch�� ����ؼ� �ۼ��ϼ��� (5��)
import java.util.Scanner;

public class Ex02Switch02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");
		int age = scanner.nextInt();
		//switch�� ���
		//������� �پ����� ����
		//���̵��� �޻���Ѵ�.
		//���� ���, �̼�����, ������ ����ϴ� �� ���α׷� ���� ��쿡��
		//case�� ��û ���� �������
		//�ƴϸ� �Ʒ��� ���� ������ ���� ��ȭ���Ѽ�
		//�� ������� ���̽��� ���ؼ�
		//������ �ڵ带 �������־�� �Ѵ�.
		//�׷��� ������ if ���� ����ϴ� ���� ����.
		
		switch (age / 18) {
		case 0:
			System.out.println("�̼������Դϴ�.");
			break;
		default:
			System.out.println("�����Դϴ�.");
			break;
		}

		scanner.close();
	}
}
