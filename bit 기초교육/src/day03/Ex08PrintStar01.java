package day03;
//����� 1��
//	*
//	**
//	***
//	****
//	*****

// ���� ���� ���� �ǵ� ����ڰ� �Է��� ���ڿ� ���� ũ�Ⱑ �ٲ��.

// �̷��� ����� ��������
// �ٱ��� for ���� ���� ���� ����Ѵ�.
// ���� for ���� ���� ���� ����Ѵ�.
import java.util.Scanner;
public class Ex08PrintStar01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ���� ���� �Է����ּ���: ");
		int userNumber = scanner.nextInt();
		
		for(int height = 1; height <= userNumber; height++) {
			for(int width = 1; width <= height; width++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}










