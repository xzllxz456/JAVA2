package day03;
// ����ڷκ��� ��, ��, �� ������ �Է¹޾Ƽ�
// �̸�: ###
// ����: ###�� ����: ###�� ����: ###��
// ����: ###�� ���: ##.##��
// �� ��µǴ� ���α׷��� �ۼ��ϼ���
// ��, ����ڰ� ��ȿ���� ���� ������ �Է��ϸ�
// �ùٸ� ������ ���ö����� �ٽ� �Է��ϵ��� ���弼��
// ����, ��, ��, �� ������ 3�ڸ� ������ �����ϰ� ���� �� ������ ������ �ÿ���
// 0���� ä��� ����� �Ҽ��� 2��° �ڸ����� ��µǵ���
// System.out.printf()�� �ۼ��ϼ���. (2�� 35�б���)
import java.util.Scanner;
public class Ex12GradeBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = scanner.nextLine();
		
		System.out.print("����: ");
		int korean = scanner.nextInt();
		while(korean < 0 || korean > 100) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print("����: ");
			korean = scanner.nextInt();
		}
		
		System.out.print("����: ");
		int english = scanner.nextInt();
		while(english < 0 || english > 100) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print("����: ");
			english = scanner.nextInt();
		}
		
		System.out.print("����: ");
		int math = scanner.nextInt();
		while(math < 0 || math > 100) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print("����: ");
			math = scanner.nextInt();
		}
		
		int sum = korean + english + math;
		double average = sum / 3.0;
		
		System.out.printf("�̸�: %s\n", name);
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", 
				korean, english, math);
		System.out.printf("����: %03d�� ���: %.2f��", sum, average);
		
		scanner.close();
	}
}














