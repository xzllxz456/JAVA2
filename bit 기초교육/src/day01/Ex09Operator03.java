package day01;
// �񱳿�����
// �񱳿����ڴ� 2���� ���� ���Ѵ�
// > >= < <= == !=
// �񱳿����ڴ� ������� ������ boolean Ÿ���� ���´�
// "������ �����ʺ��� Ů�ϱ�?" true/false
public class Ex09Operator03 {
	public static void main(String[] args) {
		// 3�� 4���� Ů�ϱ�?
		System.out.println("3 > 4: "+ (3 > 4));
		// 3�� 4���� ũ�ų� �����ϱ�? 
		System.out.println("3 >= 4: "+ (3 >= 4));
		// 3�� 4���� �۽��ϱ�?
		System.out.println("3 < 4: "+ (3 < 4));
		// 3�� 4���� �۰ų� �����ϱ�?
		System.out.println("3 <= 4: "+ (3 <= 4));
		// 3�� 4�� �����ϱ�?
		System.out.println("3 == 4: "+ (3 == 4));
		// 3�� 4�� �ٸ��ϱ�?
		System.out.println("3 != 4: "+ (3 != 4));
		
		// ������ ���ų� �ٸ��ų��� ���� ������ 
		// �Ѱ��� ������ ���� �ִ�.
		// �ٷ� ������ ������ ��쿡�� �ش� �����ڷ� ���ϸ�
		// ��Ȯ���� ���� ���� ���� ���� �ִ� ���̴�.
		
		System.out.println("============������ �񱳿����� ���� ����=========");
		String string1 = new String("abc");
		String string2 = "abc";
		String string3 = string2;
		System.out.println("string1: "+string1);
		System.out.println("string2: "+string2);
		System.out.println("string3: "+string3);
		
		//������ �񱳿����ڸ� ����ؼ� �ش� String���� ��� ���� ������
		//Ȯ���ϸ� ����� �̻��ϴ�.
		System.out.println("===�񱳿����� ����===");
		System.out.println("string1 == string2: "+(string1 == string2));
		System.out.println("string1 == string3: "+(string1 == string3));
		System.out.println("string2 == string3: "+(string2 == string3));
		
		//�츮�� �񱳿����ڸ� ����� ����:
		//String 3���� ���� "abc"�� �� �����ϱ� 2���� ���ϸ� true�� ��������? ��
		//�ڹٰ� �񱳿����ڸ� ������:
		//�� �ּҰ��� ���غ��� 2�� 3�� �ּҰ��� ������ 1�� 2, 1�� 3�� �ٸ���?
		
		//����, ������ ������ ���� ������
		//�񱳿����ڰ� �ƴ϶� �ش� ������ equals()��� �޼ҵ带 �����ؼ� 
		//���ؾ��Ѵ�.
		System.out.println("string1.equals(string2): "+(string1.equals(string2)));
		System.out.println("string1.equals(string3): "+(string1.equals(string3)));
		System.out.println("string2.equals(string3): "+(string2.equals(string3)));
	}
}













