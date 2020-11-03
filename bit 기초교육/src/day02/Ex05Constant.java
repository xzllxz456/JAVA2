package day02;
// ���(Constant)
// ����� �ѹ� ���� �Ҵ�Ǹ� ���̻� ������ �Ұ����� ������
// ������ �Ѵ�.

// ����� �Ϲ� ����ó�� ����������
// ���� �տ� final �̶�� Ű���带 �ٿ��ش�.
// ����: final double PI = 3.141592;

// static
// ����ƽ�̶� ������ζ�� �޼ҵ� Ȥ�� ����, ������� 
// �׻� Ŭ���� ����(=��ü)�� ���� �� �ȿ��� ȣ���ؾ�������
// static�� �ٿ��ָ� Ŭ���� ������ �� ���� ��� �����ϴ�.
// ��!!!!!!! ���� static �� ���� �޼ҵ尡 �ٸ� �޼ҵ峪 ����, ����� ����ҷ���
// �� �ٸ� �޼ҵ�, ����, ������� �ݵ�� static�� �ٿ��־�� �Ѵ�!

public class Ex05Constant {
	//����� �ַ� Ŭ���� �����ٿ� ����� �ʱ�ȭ�� �Ѵ�.
	final static int NUMBER_OF_SUBJECTS = 4;
	public static void main(String[] args) {
		//���� ����� �츮�� ���� �޼ҵ忡�� ����ϱ� ���ؼ���
		//�ݵ�� static�� �ٿ��־�� �Ѵ�.
		//�ֳ��ϸ� �츮�� ���� �޼ҵ尡 static Ű���尡 �پ��ֱ� �����̴�!!!
		System.out.println("���� ��: "+NUMBER_OF_SUBJECTS);
		int korean = 45;
		int english = 50;
		int math = 60;
		int sum = korean + english + math;
		//magic �ѹ��� ����Ѵٸ�?
		double average = sum / 3;
		
		//����� �̿��Ѵٸ�?
		System.out.println(average);
		average = sum / (double)NUMBER_OF_SUBJECTS;
	}
}














