package day03;
// ���ѷ����� �̿��� �޴� ������

import java.util.Scanner;
public class Ex14Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("=======================");
			System.out.println("��Ʈ����б� �������� ���α׷�");
			System.out.println("=======================");
			System.out.println("        1. �Է�");
			System.out.println("        2. ���");
			System.out.println("        3. ����");
			System.out.println("-----------------------");
			System.out.print("> ");
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				//������ �Է��ϴ� �ڵ� ����
			}else if(userChoice == 2) {
				//������ ����ϴ� �ڵ� ����
			}else if(userChoice == 3) {
				//����޽��� ����� ���ѷ��� ����
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		
		
		scanner.close();
	}
}
