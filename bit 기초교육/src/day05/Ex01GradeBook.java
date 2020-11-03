package day05;
import java.util.ArrayList;
import java.util.Scanner;

// ArrayList�� ����� �л� ��ü ���� ���α׷�
import day04.Student;

public class Ex01GradeBook {
	//Student ��ü�� ����� ���ؼ���
	//�츮�� �ٸ� ��Ű���� �ִ� Student Ŭ������
	//import �ؿ;� �Ѵ�.
	
	//�� import�� �������� ���� �ش� Ŭ������ ��Ű���� �ȴ�.
	//import�� �� ������ �ش� Ŭ���� �̸��� ����
	//ctrl+space ������ �ҷ��� �� �ִ�.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		while(true) {
			System.out.println("1. �Է� 2. ��� 3. ����");
			int userChoice = scanner.nextInt();
			
			if(userChoice == 1) {
				// �л� ��ü�� �����
				// ������ �Է��ؼ�
				// ����Ʈ�� �߰�
				
				//������ ���� �л� ��ü ����
				Student s = new Student();
				
				scanner.nextLine();
				System.out.print("�̸�: ");
				s.setName(scanner.nextLine());
				
				System.out.print("�й�: ");
				s.setId(scanner.nextLine());
				
				s.setKorean(day04.StudentEx01.validateScore("����", scanner));    
				s.setEnglish(day04.StudentEx01.validateScore("����", scanner));
				s.setMath(day04.StudentEx01.validateScore("����", scanner));
				
				list.add(s);
				
			}else if(userChoice == 2) {
				// ����Ʈ ��ü ���
				// ���� �Ѹ� �Էµ��� �ʾ����� "�Էµ� ������ ����" �� ������ְ�
				// �Է��� ������ ���
				if(list.size() == 0) {
					//�Ѹ� �Է� �ȉ����Ƿ� ��� �޽��� ���
					System.out.println("�Էµ� �л��� �������� �ʽ��ϴ�.");
				}else {
					for(int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
				}
			}else if(userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
			
		}
		
		
		scanner.close();
	}
}
















