package day02;
//��ø if��
// "if�� �ȿ� if��!"
import java.util.Scanner;
public class Ex11NestedIf {
	public static void main(String[] args) {
		//�ٱ��� if�� true�� ���;�
		//�� �ȿ� if�� ������ �ȴ�.
		
		//����ڷκ��� ����, ����, ��ü��޼����� �Է¹޾Ƽ�
		//����, ����, ������ ��µǴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է����ּ���(���ڴ� 1, ���ڴ� 2): ");
		int sex = scanner.nextInt();
		if(sex == 1) {
			//�����̹Ƿ� ���̸� �Է� �޴´�.
			System.out.print("���̸� �Է����ּ���: ");
			int age = scanner.nextInt();
			if(age >= 18) {
				//���� �����̹Ƿ� ��ü����� �Է¹޴´�.
				System.out.print("����� �Է����ּ���: ");
				int category = scanner.nextInt();
				if(category >= 1 && category <= 3) {
					System.out.println("����!"); 
				}else if(category == 4) {
					System.out.println("����!");
				}else {
					System.out.println("����!");
				}
			}else {
				System.out.println("���� �̼������Դϴ�.");
			}
		}else {
			//�����̹Ƿ� �޽����� ������ش�.
			System.out.println("�������Դ� ������ �ǹ��� �ο����� �ʽ��ϴ�.");
		}
		
		
		scanner.close();
	}
}
