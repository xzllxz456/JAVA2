package day01;
// Scanner
// Scanner�� �ڹٰ� �⺻������ �������ִ� ���̺귯���� �����ϴ�
// �Է��� ����ϴ� Ŭ�����̴�.
// �� �츮 ��Ű���� �������� �����Ƿ�
// import��� ��ɾ ���ؼ� �ε��� �ؾ��Ѵ�.
import java.util.Scanner;
public class Ex11Scanner {
	public static void main(String[] args) {
		//Ŭ���� ���� �����ϱ�
		//Ŭ�����̸� �����̸� = new Ŭ�����̸�();
		//�� ��ĳ�ʴ� ��� �Է��� �������� ()�ȿ� �־��־�� �Ѵ�.
		Scanner scanner = new Scanner(System.in);
		
		//���� int�� �Է¹޾ƾ� �Ѵٸ�
		//nextInt() �޼ҵ带 �����ϸ� �ȴ�.
		System.out.print("������ �Է����ּ���: ");
		int myNumber = scanner.nextInt();
		System.out.println("����ڰ� �Է��� ����: "+myNumber);
		
		//���� double�� �Է¹޾ƾ� �Ѵٸ�
		//nextDouble() �޼ҵ带 �����ϸ� �ȴ�.
		System.out.print("�Ǽ��� �Է����ּ���: ");
		double myDouble = scanner.nextDouble();
		System.out.println("����ڰ� �Է��� �Ǽ�: "+myDouble);
		

		//Scanner ���� ��������
		//1. ���� nextInt�� ���� �Ǽ��� ���ڸ� �Է��ϸ�...? ����
		//2. ���� nextDouble�� ���� ���ڸ� �Է��ϸ�...? ����
		//3. ��ĳ�� ����
		//   ��ĳ���� ��� nextInt(), nextDouble()���� ���ڸ� �Է��ϴ�
		//   �޼ҵ带 �����ϰ� ������ ���۸޸𸮿� �Է� ���Ḧ ���ϴ� ���� ���ڰ�
		//   �����ִ�.
		//   ���� nextInt(), nextDouble() ���Ŀ� ��Ʈ�� �Է��� ���ؼ�
		//   nextLine()�� �����ϸ�, ��ĳ�ʴ� ���۸޸𸮿� �����ִ�
		//   ����Ű�� ���� �Է��� �����Ų��.
		//   ���� �ش� ���׸� �ذ��ϱ� ���ؼ���, 
		//   String �Է� ���� nextLine()�� �ѹ� �� �ָ� �ȴ�.
		
		System.out.print("�̸��� �Է����ּ���: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("����ڰ� �Է��� �̸�: "+name);
		System.out.println("���α׷� ����");
		
		//���� Scanner �� ���� �޸𸮸� �д� Ŭ������ ������
		//�׻� ���� ������ �ٿ�
		//close()��� �޼ҵ带 ȣ���ؼ�
		//'�ݾ�'�ָ� �޸� ������ �߻����� �ʰ� �ȴ�.
		scanner.close();
	}
}














