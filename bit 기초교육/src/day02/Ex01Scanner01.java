package day02;
//����ڷκ��� 
//����, �̸�, ����, ����, ���� ������ �Է� �޾Ƽ�
// ����: 15��, �̸�: ���翵
// ����: 080��, ����: 081��, ����: 080��
// ����: 241��, ���: 80.333333��
// ����� ��µǴ� ���α׷��� �ѹ� �ۼ��غ�����(15��)
import java.util.Scanner;
public class Ex01Scanner01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		String name;
		int korean, english, math;
		
		System.out.print("����: ");
		age = scanner.nextInt();
		
		System.out.print("�̸�: ");
		scanner.nextLine();
		name = scanner.nextLine();
		
		System.out.print("����: ");
		korean = scanner.nextInt();
		
		System.out.print("����: ");
		english = scanner.nextInt();
		
		System.out.print("����: ");
		math = scanner.nextInt();
		
		System.out.println("����: "+age+"��, �̸�: "+name);
		System.out.println("����: "+korean+"��, ����: "+english+"��, ����: "+math+"��");
		
		int sum = korean + english + math;
		double average = sum / 3.0;
		
		System.out.println("����: "+sum+"��, ���: "+average+"��");
		
		scanner.close();
	}
}













