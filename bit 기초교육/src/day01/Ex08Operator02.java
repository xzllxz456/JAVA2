package day01;
// �Ҵ� ������
// �Ҵ� �����ڴ� ������ ����
// ���� ������ �����Ѵ�.
// = += -= *= /= %=
// ���� �ִ�.
public class Ex08Operator02 {
	public static void main(String[] args) {
		//������ 30�̶� int ����
		//int ���� myInt�� ����(�Ҵ�)�ض�
		int myInt = 30;
		System.out.println("myInt�� ���簪: "+myInt);
		
		//myInt�� ����� ���� ������ 10�� ���ؼ�
		//�ٽ� myInt�� �Ҵ��ض�
		myInt += 10;
		System.out.println("myInt�� ���簪: "+myInt);
		
		//myInt�� ����� ���� ������ �� 5�� ����
		//�ٽ� myInt�� �Ҵ��ض�
		myInt -= 5;
		System.out.println("myInt�� ���簪: "+myInt);
		
		//myInt�� ����� ���� ������ �� 2�� ���ؼ�
		//�ٽ� myInt�� �Ҵ��ض�
		myInt *= 2;
		System.out.println("myInt�� ���簪: "+myInt);
		
		//myInt�� ����� ���� ������ �� 3�� ���� ����
		//�ٽ� myInt�� �Ҵ��ض�
		myInt /= 3;
		System.out.println("myInt�� ���簪: "+myInt);
		
		//myInt�� ����� ���� ������ �� 3�� ���� ��������
		//�ٽ� myInt�� �Ҵ��ض�
		myInt %= 3;
		System.out.println("myInt�� ���簪: "+myInt);
		
		//����������
		//���������ڴ� ��������ڿ� �Ҵ翬���ڰ� ���յ� ���·ν�
		//���� ������ ����� ���� 1 ���� ��Ű�ų� 1 ���� ��Ų��.
		//��, ������ �տ� �ٳ� �ڿ� �ٳĿ� ���� �ǹ̰� ��¦ �޶����� �ȴ�!
		
		//++ Ȥ�� --�� �ڿ� �ٴ� ��츦
		//���� ���������ڶ�� �ϸ�
		//�ش� �ٿ��� ���� ������ ������ ������ �ȴ�.
		//�� System.out.println("myInt++: "+ myInt++) �� ���
		// 1: "myInt++: " �̶� ������ ���� ���ڿ�(=String)�� ����
		// 2: "myInt++: " �ڿ� myInt�� ���簪�� �̾���δ�.
		// 3: "myInt++: 2" ��� ���ڿ��� System.out.println()�� ����Ѵ�.
		// 4: myInt�� ���� 1 ���� ��Ų��.
		System.out.println("===����������===");
		System.out.println("myInt�� ���簪: "+myInt);
		System.out.println("myInt++: " + myInt++);
		System.out.println("myInt�� ���簪: "+myInt);
		
		//�ݴ�� ++ Ȥ�� --�� �տ� �ٴ� ��츦
		//���� ���������ڶ�� �ϸ�
		//�ش� �ٿ��� ���� ���� ������ �ȴ�.
		//�� System.out.println("--myInt: "+ --myInt) �� ���
		// 1: --myInt�� ����Ǿ� myInt�� ���� 1 �����Ѵ�.
		// 2: "--myInt: " �̶� ������ ���� ��Ʈ���� �����ȴ�.
		// 3: "--myInt: " ��Ʈ�� �ڿ� myInt�� ���簪�� �̾�����.
		// 4: "--myInt: 2" ��� ���ڿ��� System.out.println()�� ����Ѵ�.
		System.out.println("--myInt: "+ --myInt);
		System.out.println("myInt�� ���簪: "+myInt);
	}
}













