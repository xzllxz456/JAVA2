package day03;
//�ǵ������� switch���� break�� �����ؼ�
//�ڵ带 �����ϰ� ����� ���

//����ڷκ��� ���� �Է¹޾Ƽ�
//�ش� ���� ������ ���� �������� �����ִ� ���α׷�
import java.util.Scanner;
public class Ex03Switch03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��: ");
		int month = scanner.nextInt();
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�ϱ����Դϴ�.");
			break;
		case 2:
			System.out.println("28�ϱ����Դϴ�.");
			break;
		default:
			System.out.println("31�ϱ����Դϴ�.");
			break;
		}
		
		
		
		scanner.close();
	}
}







