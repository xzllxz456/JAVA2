package day01;
// �Ǽ��� ������Ÿ�� double

// �Ǽ���? �Ҽ����� �����ϴ� ����
// float�� double�� ����������
// �ڹٴ� �ڵ忡�� �Ǽ��� �߰��� �� double�� �ν��Ѵ�.

public class Ex04Double {
	public static void main(String[] args) {
		// �Ʒ� �ڵ�� ������ ����.
		// int myInt = 3.141592;
		// �ֳ��ϸ� 3.141592�� �Ҽ����� �����ϴ� �Ǽ��̰�
		// int�� �Ҽ����� �������� �ʴ� ������ ������Ÿ���̱� ������
		// .141592 �� �������(=�����ͼս��� �߻��ϱ�) �����̴�.
		
		int myInt = (int) 3.141592;
		System.out.println("myInt�� ���簪: " + myInt);
		
		// �Ʒ� �ڵ嵵 ������ ����.
		// float myFloat = 3.141592;
		// �ֳ��ϸ� 3.141592�� �ڹٿ��� double �� �ν��ϰ�
		// float�� double���� ���� ũ���� �ڷ����̱� ������
		// �����ͼս��� �Ͼ�� �ִٰ� �ڹٰ� �����ؼ�
		// ������ ����.
		// ���� float�� ����Ҷ����� ���� �ʱ�ȭ �Ҷ� 2���� �������
		// �ʱ�ȭ���� �� �ִ�.
		// 1. ����� ����ȯ
		float myFloat = (float)3.141592;
		System.out.println("myFloat�� ���簪: "+myFloat);
		// 2. �Ǽ��� float�̶�� ���� ����Ѵ�.
		myFloat = 1.234f;
		System.out.println("myFloat�� ���簪: "+myFloat);
		
		// ���:
		// �ڹٰ� ������ int, �Ǽ��� double�� �ν��Ѵ�.
		// ���� �츮�� ���̻� byte, short, float�� �� �������
		// �ʰ� �ȴ�.
		
	}
}












