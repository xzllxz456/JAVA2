package day01;
// ������(operator)

// �����ڶ�, Ư�� ��ȣ�� ���α׷���������
// � ����� �϶�� ���ǵǾ��ִ� ��ȣ���� �����ڶ�� �θ���.
// �����ڿ���
// ���, �Ҵ�, ��, ��, ��Ʈ 5���� �����ڰ� �����Ѵ�.

// ���: + - * / %
public class Ex07Operator {
	public static void main(String[] args) {
		int myNumber1 = 300;
		int myNumber2 = 40;
		System.out.println("myNumber1 + myNumber2: " + (myNumber1 + myNumber2));
		System.out.println("myNumber1 - myNumber2: " + (myNumber1 - myNumber2));
		System.out.println("myNumber1 * myNumber2: " + (myNumber1 * myNumber2));
		System.out.println("myNumber1 / myNumber2: " + (myNumber1 / myNumber2));
		// %�� �տ� ���� ������ ���� ������ �������� ���ϴ�
		// ������ �������̴�.
		System.out.println("myNumber1 % myNumber2: " + (myNumber1 % myNumber2));

		// ����������� ���
		// ���������� ������ ������ ���´�.
		// �Ǽ������� ������ �Ǽ��� ���´�.
		// ������ �Ǽ��� ������ �Ǽ��� ���´�.

		double myDouble = 50;
		System.out.println("myNumber2 / myDouble: " + (myNumber2 / myDouble));

		// ���� ������ ������ ������ �������
		// �Ǽ��� Ȯ���ҷ���
		// �ݵ�� ����� ����ȯ�� ���ؼ� �� ���� �� �ϳ��� �Ǽ��� �ٲ��־�� �Ѵ�.
		System.out.println("3 / 4: " + (3 / 4));
		System.out.println("3 / (double)4: " + (3 / (double)4));
		
		
	}
}











