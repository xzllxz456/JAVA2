package day02;
//����ڷκ��� ������ �Է¹޾Ƽ�
// 90~100: A
// 80~89: B
// 70~79: C
// 60~69: D
// ~59: F
// �� ��µǴ� ���α׷��� �ۼ��ϼ��� (3�� 23�б���)
import java.util.Scanner;
public class Ex10IfElseIf02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int score = scanner.nextInt();
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		//���� �� �ڵ��� �������� ����ڰ� �߸��� ����(100���� ũ�ų� 0���� ����)��
		//�Է��ϸ� �߸��� ����� ���´�.
		//�̷��� �Է¹��� ���� ��ȿ���� üũ�ϴ� ������ �븮���̼�(validation)�̶��
		//�θ��� �����е��� �ڵ��Ҷ� �ſ� �߿��ϴ�.
		
		//���� �ڵ�� 2���� ������� ��ȿ���� üũ�� �� �ִ�.
		//1. if�� ���ǽ��� ��Ȯ�ϰ� ����ֱ�
		//   �� ���ǽ��� ������ ��Ȯ�ϰ� ������ ����ش�.
		System.out.println("1. ���ǽ� ��Ȯ�ϰ� ���");
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score <= 89) {
			System.out.println("B");
		}else if(score >= 70 && score <= 79) {
			System.out.println("C");
		}else if(score >= 60 && score <= 69) {
			System.out.println("D");
		}else if(score >= 0 && score <= 59) {
			System.out.println("F");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		//2. ��øif���� ���� ������ ������ �� �ùٸ� ���� �Է��� ������
		//   ���� ���
		System.out.println("2. ���� ������");
		if(score >= 0 && score <= 100) {
			//�ùٸ� �����̹Ƿ� ABCDF ��µǴ�
			//if-else ����
			if(score >= 90) {
				System.out.println("A");
			}else if(score >= 80) {
				System.out.println("B");
			}else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			// ������ 0���� 100���̰� �ƴϴ�
			// �� �����ų� 100�� �ʰ��ϴ� �����̹Ƿ�
			// ���޽����� ���
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		scanner.close();
	}
}










