package day02;
//����ڷκ��� ������ ������ �Է¹޾Ƽ�
//����� 70�̻��̰� ������ ��δ� 60�� �̻��̸� �հ�
//���� ���� ������ �������� ���� �ÿ� ���հ�
//���� �߸��� ������ �ԷµǸ� ��� ���� �Է��� ���� �Ŀ�
//�߸��Էµ� ������ �����մϴ�. ��� ����� �Ǵ� ���α׷��� �ۼ��ϼ���
//(4�� 30�б���)
import java.util.Scanner;
public class Ex12IfElseIf03 {
	final static int NUMBER_OF_SUBJECTS = 3;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ����: ");
		int korean = scanner.nextInt();
		System.out.print("���� ����: ");
		int english = scanner.nextInt();
		System.out.print("���� ����: ");
		int math = scanner.nextInt();
		
		int sum = korean + english + math;
		double average = sum / (double)NUMBER_OF_SUBJECTS;
		
		//���� �Էµ� �������� �ùٸ������� üũ�Ѵ�
		boolean isKoreanCorrect = korean >= 0 && korean<= 100;
		boolean isEnglishCorrect = english >= 0 && english <= 100;
		boolean isMathCorrect = math >= 0 && math <= 100;
		
		if(isKoreanCorrect && isEnglishCorrect && isMathCorrect) {
			//�ùٸ� �����̹Ƿ� �հ�/Ż���� if�� ���ؼ� ����
			if(average >= 70 && korean >= 60 && english >= 60 && math >= 60) {   
				System.out.println("�հ�!!!");
			}else {
				System.out.println("Ż��!!!");
			}
		}else {
			//�߸��� ������ ��򰡿� �����Ѵٴ� �ǹ��̹Ƿ� ���޽��� ���
			System.out.println("�߸��� ������ ������ �����մϴ�.");
		}
		
		scanner.close();
	}
}













