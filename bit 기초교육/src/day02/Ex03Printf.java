package day02;
// printf�� ���
// ()�ȿ� ""�� �����ְ�
// �츮�� ����ؾߵ� ������ ������ �������� �� �ִ�.

public class Ex03Printf {
	public static void main(String[] args) {
		//1. 10���� ����('d'ecimal)
		int number = 151;
		//-A. 10���� ������ �״�� ����ض�
		System.out.printf("1-A. %d\n", number);
		//-B. 10���� ������ ������ ���� 5�ڸ��� ����ض�
		System.out.printf("1-B. %5d\n", number);
		//-B2. �ڸ��� ������ ���, ����ؾ� �� ������ ������ �ڸ������� ������
		//     ���ð� �ȴ�.
		System.out.printf("1-B2. %5d\n", 1234567);
		//-C. 10���� ������ ���� ���� 5�ڸ��� ����ض�
		System.out.printf("1-C. %-5d(��)\n", number);
		//-D. 10���� ������ ������ �����ϰ� ���� ���ڸ��� 0���� ä���� 5�ڸ��� ����ض�
		System.out.printf("1-D. %05d\n", number);
		
		//2. 16����(he'x'adecimal)
		//   16������ �� �ڸ��� �� 16���� ���ڷ� �̷�����ְ�,
		//   �� �ڸ��� 16�� �����̴�.
		//   10~15�� ��� ���ĺ� a~e������ ǥ���Ѵ�.
		//A. ������ 16�������� ǥ���ϰ� ���ĺ��� �����ҽ� �ҹ��ڷ� ǥ���ض�
		number = 155;
		System.out.printf("2-A. %x\n", number);
		//B. ������ 16�������� ǥ���ϰ� ���ĺ��� �����ҽ� �빮�ڷ� ǥ���ض�
		System.out.printf("2-B. %X\n", number);
		//C. ������ �ҹ��� 16�������� ǥ���ϰ� ������ �����ؼ� 5�ڸ��� ǥ���ض�
		System.out.printf("2-C. %5x\n", number);
		//D. ������ �빮�� 16�������� ǥ���ϰ� ���� �����ؼ� 5�ڸ��� ǥ���ض�
		System.out.printf("2-D. %-5X(��)\n", number);
		//E. ������ �빮�� 16�������� ǥ���ϰ� ������ �����ؼ� ��ĭ�� 0���� ä���
		//   �� 8�ڸ��� ǥ���ض�
		System.out.printf("2-E. %08X\n", number);
		
		//3. �Ǽ�('f'loat)
		double myDouble = 123.45678;
		//A. �Ǽ��� �״�� ǥ���ض�
		System.out.printf("3-A. %f\n", myDouble);
		//B. �Ǽ��� �Ҽ��� 2��° �ڸ����� ǥ���ض�
		System.out.printf("3-B. %.2f\n", myDouble);
		//C. �Ǽ��� ������ ������ 7�ڸ��� ǥ���ϰ� �Ҽ����� 1�ڸ������� ǥ���ض�
		System.out.printf("3-C. %7.1f\n", myDouble);
		//D. �Ǽ��� ���� ������ 7�ڸ��� ǥ���ϰ� �Ҽ����� 7�ڸ������� ǥ���ض�
		System.out.printf("3-D. %-7.7f\n", myDouble);
		//E. �Ǽ��� ������ ������ 10�ڸ��� ǥ���ϰ� ���� ������� 0���� ä���
		//   �Ҽ����� 3�ڸ������� ǥ���ض�
		System.out.printf("3-E. %010.3f\n", myDouble);
		
		//4. ����ǥ���(e)
		//A. ���ڸ� ����ǥ������� ǥ���ض�
		System.out.printf("4-A. %e\n", myDouble);
		
		//5. ���ڿ�('S'tring)
		String myString = "abcDEFghi";
		//A. ���ڿ��� �״�� ǥ���ض�
		System.out.printf("5-A. %s\n", myString);
		//B. ���ڿ��� ǥ���ϵ� �ҹ��ڰ� ������ �빮�ڷ� ǥ���ض�
		System.out.printf("5-B. %S\n", myString);
		//C. ���ڿ��� 10�ڸ� ������ �����ؼ� �״�� ǥ���ض�
		System.out.printf("5-C. %10s\n", myString);
		//D. ���ڿ��� 8�ڸ� ���� �����ؼ� ��� �빮�ڷ� ǥ���ض�
		System.out.printf("5-D. %-8S\n", myString);

		//printf�� ������ ���̵� Ȱ���� �����ϴ�.
		int korean = 80;
		int english = 70;
		int math = 95;
		System.out.printf("����: %d��, ���: %.2f��\n", 
				(korean+english+math), 
				(korean+english+math)/3.0);
		
		//printf�� ����� �� ������ ��
		//1. �������� �ʴ� %���ڸ� ���� ������ ����.
		//System.out.printf("%z\n", myDouble);
		//2. %���ڿ� �Ҵ�Ǵ� ���� ������Ÿ���� �ٸ��� ������ ����.
		//System.out.printf("%d\n", myDouble);
		//3. �Ҵ�Ǵ� ���� ������ ��� ������ ���� %������ ������ �� ������
		//   ������ ����.
		System.out.printf("%d %d\n", 1, 2, 3, 4);
		System.out.printf("%d %d %d %d\n", 1, 2);
	}
}














