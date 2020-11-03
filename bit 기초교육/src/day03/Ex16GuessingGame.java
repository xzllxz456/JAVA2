package day03;
// ���� ���߱� ����
// ��ǻ�Ͱ� ������ ���ڸ� ������ְ�
// ����ڴ� ���ڸ� �Է��ؼ�
// ���� �Է��� ���ڰ� �������ں��� ũ�� DOWN
// ���� �ݴ��� ��쿡�� UP�� ��µǼ�
// ������� ����ڰ� �� ���ڸ� ���ߴ��� �����ش�.
import java.util.Scanner;
import java.util.Random;
public class Ex16GuessingGame {
	final static int MAX = 100;
	public static void main(String[] args) {
		//Scanner�� ���������� Random�� �ܺ� Ŭ�����̱� ������ import �ؾߵǰ�
		//Scanner ó�� ������ ������־�� �Ѵ�.
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			System.out.println("1. �÷��� 2. ����");
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				int score = 0;
				int computerNumber = random.nextInt(MAX)+1;
				System.out.print("���ڸ� �Է����ּ���: ");
				int userNumber = scanner.nextInt();
				score++;
				while(computerNumber != userNumber) {
					if(computerNumber > userNumber) {
						System.out.println("UP");
					}else {
						System.out.println("DOWN");
					}
					System.out.print("���ڸ� �Է����ּ���: ");
					userNumber = scanner.nextInt();
					score++;
				}
				System.out.println("����!!!");
				System.out.println("������� ����: "+score);
			}else if(userChoice == 2) {
				System.out.println("�÷��� ���ּż� �����մϴ�.");
				break;
			}
		}
		
		scanner.close();
	}
}
