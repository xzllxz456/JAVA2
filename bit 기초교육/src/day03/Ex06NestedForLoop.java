package day03;
// ���� for loop
// for �� �ȿ� for���� �� �ְ�
// �ٱ� �� for ���� �ѹ� �ݺ��� ����,
// ���� for���� ó������ ������ �ݺ��ȴ�.
public class Ex06NestedForLoop {
	public static void main(String[] args) {
		//���������� for���� ���� ������ 
		//i > j > k ... ������ ������
		//�����е��� �˱� ���� ������ ���� �����ϴ�.
		for(int i = 1; i <= 3; i++) {
			for(int j = 11; j <= 13; j++) {
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
	}
}
