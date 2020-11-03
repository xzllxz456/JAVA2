package day03;
// ����ڷ� ���� �̸�, ����, ����, ���� ������ �Է� �޾Ƽ�
// ����ϴ� ���α׷��� �ۼ��ϼ���
// �䱸���� 1.
//   ���� ������ �̿��ؼ� �޴��� �����
//   ����ڰ� �Է�, ����� ���� ������ �� �ְ�
//   ���Ḧ ������ �ÿ��� ���α׷��� ����ǰ� ���弼��.
// �䱸���� 2.
//   ����ڰ� �߸��� ������ �Է��ϸ� �ùٸ� ������ �Էµɶ����� �Էµǰ� ������ּ���
// �䱸���� 3.
//   ���� ��½ÿ� ��տ� ���߾�
//     A, B, C, D, F�� �߰������� ��µǰ� ������ּ���.
// ������� 1.
//   ���� ����ڰ� �ƹ��� �Է¾��� ����� ������ ���� �Էµ� ���� ���ٰ�
//   ��µǰ� ��������

// ���ȭ��:
//   �̸�: ���翵
//   ����: 080�� ����: 081�� ����: 081��
//   ����: 242�� ���: 80.66��(B) (50�б���)
import java.util.Scanner;
public class Ex15GradeBook2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = new String();
		int korean = -1;
		int english = 0;
		int math = 0;
		
		while(true) {
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.print("> ");
			
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
				//���� �Է��ϴ� �ڵ�
				System.out.print("�̸�: ");
				scanner.nextLine();
				name = scanner.nextLine();
				
				System.out.print("����: ");
				korean = scanner.nextInt();
				while(korean < 0 || korean > 100) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.print("����: ");
					korean = scanner.nextInt();
				}
				
				System.out.print("����: ");
				english = scanner.nextInt();
				while(english < 0 || english > 100) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.print("����: ");
					english = scanner.nextInt();
				}
				
				System.out.print("����: ");
				math = scanner.nextInt();
				while(math < 0 || math > 100) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.print("����: ");
					math = scanner.nextInt();
				}
			}else if(userChoice == 2) {
				//���� ����ϴ� �ڵ�
				if(korean == -1) {
					//���� ���� �Է��� �ȵ� �����̹Ƿ� ���޽����� ���
					System.out.println("���� �Էµ� ������ �����ϴ�.");
				}else {
					//���� �Է��� �Ǿ����Ƿ� ����ϴ� �ڵ� ����
					System.out.printf("�̸�: %s\n", name);
					System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n", 
							korean, english, math);
					int sum = korean + english + math;
					double average = sum / 3.0;
					String letterGrade = new String();
					switch(sum / 30) {
					case 10:
					case 9:
						letterGrade = "A";
						break;
					case 8:
						letterGrade = "B";
						break;
					case 7:
						letterGrade = "C";
						break;
					case 6:
						letterGrade = "D";
						break;
					default:
						letterGrade = "F";
						break;
					}
					
					System.out.printf("����: %03d�� ���: %.2f��(%s)\n", 
							sum, average, letterGrade);
				}
				
			}else if(userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
		
		scanner.close();
	}
}










