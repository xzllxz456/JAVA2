package day03;
// ����ڷκ��� int ���� �ϳ� �Է� �޾Ƽ� 
// 1���� �� �������� ���� ���ϴ� ���α׷���
// �ۼ��ϼ���. (10��)
import java.util.Scanner;
public class Ex05ForLoop02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int number = scanner.nextInt();
		//1~number������ ���� for �ݺ����� ���ᰡ �ǵ�
		//���� �����־�� �ϰ� �� ������ ȣ�� �����ؾ��ϱ� ������
		//for���� �ٱ��� ������־�� �Ѵ�!
		int sum = 0;
		for(int i = 1; i <= number; i++) {	
			sum += i;
		}
		
		System.out.printf("%d���� %d������ ��: %d\n", 1, number, sum);
		//1���� ����ڰ� ���� �Է��� �������� ���� ���ϴ� for���� ��������(5��)
		System.out.print("���ο� ���ڸ� �Է����ּ���: ");
		number = scanner.nextInt();
		sum = 1;
		for(int i = 1; i <= number; i++) {
			sum *= i;
		}
		System.out.printf("1���� %d������ ��: %d\n", number, sum);
		
		scanner.close();
	}
}







