package day03;

// ���ǹ� �ι�°
// switch
// ����ġ�� ��� ���ǹ�������
// Ư���ϰԵ� ���ǽ��� �ƴ϶�
// ���� Ȥ�� ���� �� ��ȭ�ϴ� ������� ����
// ����� �ڵ尡 �����ȴٴ� ���� �ٸ���.
public class Ex01Switch01 {
	public static void main(String[] args) {
		int number = 2;

		// ����ġ��
		// switch(��ȭ ������ ���� Ȥ�� ������ �����ڸ� �߰���) {
		// case Ư����:
		// ������ �ڵ�
		// ....
		// break;
		// case Ư����:
		// ������ �ڵ�
		// ....
		// break;
		// default:
		// ������ �ڵ�
		// ....
		// break;
		// }

		switch (number) {
		case 1:
			System.out.println("case 1 ����");
			System.out.println("number�� ���簪: " + number);
			break;
		case 2:
			System.out.println("case 2 ����");
			System.out.println("number�� ���簪: " + number);
			break;
		case 3:
			System.out.println("case 3 ����");
			System.out.println("number�� ���簪: " + number);
			break;
		default:
			System.out.println("default ����");
			System.out.println("number�� ���簪: " + number);
			break;
		}
		// switch�� ��� case�ȿ�
		// break ��� ���� �����Ѵ�.
		// break�� ��� �ش� �ڵ� ����� �� ��������
		// ���� ��Ų��.
		// ���� switch�� case �ȿ� 
		// break�� ������
		// break�� ���ö������� ��� �ڵ带 �� �����Ų��.
		// ��, switch�� ������ ��ġ�ϴ� ���� �ش��ϴ� ���̽�����.
		
	}
}














