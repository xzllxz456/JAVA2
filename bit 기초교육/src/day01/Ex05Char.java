package day01;
// char �� character �� ���Ӹ��ν�
// ���� 1���� �����Ѵ�.
// ���ڴ� �翬�� ���ĺ�, ����, �⺻ Ư������ ������ �ش��Ѵ�.
// char�� 2���� ���ڸ� �ϳ� ������ �ְ�
// �� ���ڿ� �����Ǵ� ���ڸ� ȭ�鿡 ����ϰų� ���꿡 ����Ѵ�.
// ����-���� ����ǥ�� ASCII ���̺��̶� �ڵ����̺��� ����Ѵ�.

public class Ex05Char {
	public static void main(String[] args) {
		char myChar = 'A';
		System.out.println("myChar�� ���簪: "+myChar);
		myChar = (char)(myChar + 32);
		System.out.println("myChar�� ���簪: "+myChar);
		
		// char�� ����
		// 1. �ƽ�Ű ���̺��� �ִ� ���� �ٷ� �� �ִ�.
		// 2. ���� �Ѱ��� �ٷ� �� �ִ�.
		myChar = '��';
		System.out.println("myChar�� ���簪: "+myChar);
	}
}














