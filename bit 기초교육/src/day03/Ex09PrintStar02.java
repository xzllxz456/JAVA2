package day03;
//	*****
//	****
//	***
//	**
//	*
// ����ڰ� �Է��� ���ڿ� ���� ũ�Ⱑ ���ϰ�
// ��������
import java.util.Scanner;
public class Ex09PrintStar02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� �� ���� �Է����ּ���: ");
		int userNumber = scanner.nextInt();
		for(int height = 1; height <= userNumber; height++) {
			for(int width = height; width <= userNumber; width++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
