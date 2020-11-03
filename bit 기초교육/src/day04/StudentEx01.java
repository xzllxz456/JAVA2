package day04;

// �л����� ���α׷�
import java.util.Scanner;

public class StudentEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();

		while (true) {
			System.out.println("1. �Է� 2. ��� 3. ����");
			int userChoice = scanner.nextInt();

			if (userChoice == 1) {
				scanner.nextLine();
				System.out.print("�й�: ");
				s.setId(scanner.nextLine());

				System.out.print("�̸�: ");
				s.setName(scanner.nextLine());

				s.setKorean(validateScore("����", scanner));
				s.setEnglish(validateScore("����", scanner));
				s.setMath(validateScore("����", scanner));
			} else if (userChoice == 2) {
				if (s.getName() == null) {
					System.out.println("���� �Էµ� ������ �����ϴ�.");
				} else {
					System.out.println(s);
				}

			} else if (userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}

		}
		scanner.close();
	}

	public static int validateScore(String testName, Scanner scanner) {
		System.out.print(testName + " ����: ");
		int score = scanner.nextInt();
		while (score < 0 || score > 100) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(testName + " ����: ");
			score = scanner.nextInt();
		}
		return score;
	}
}
