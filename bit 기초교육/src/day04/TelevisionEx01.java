package day04;

public class TelevisionEx01 {
	public static void main(String[] args) {
		// Television ��ü tv1�� ������
		Television tv1 = new Television("�Ķ����", 100, 100);
		// �ʱⰪ Ȯ��
		System.out.printf("ä��: %d, ���� %d, �ø��� ��ȣ: %s\n", tv1.getChannel(), tv1.getVolume(), tv1.getSerialNumber());
		System.out.println(tv1.getSerialNumber().equals(""));
		// ��ü�� �޼ҵ峪 �ʵ忡 �����Ҷ�
		// ��ü. ���� ������ �� �ִ�.

		// tv1 �ʵ忡 �����͸� �־��
		tv1.setChannel(9);
		tv1.setVolume(15);
		tv1.setSerialNumber("00�� 0000");

		// tv1�� ������ ����غ���
		// �츮�� Television Ŭ������
		// showInfo()��� ���� ������ String���� ���� �����ִ�
		// �޼ҵ尡 �����Ƿ�
		// System.out.println()�� �Ķ���Ϳ�
		// tv1.showInf()�� �־��ָ� �ȴ�.
		System.out.println("tv1: " + tv1.showInfo());

		// tv1�� ���� ���̱� ����� �����غ���
		tv1.increaseVolume();
		System.out.println("���� ���� ��");
		System.out.println("tv1: " + tv1.showInfo());

		// ä���� �ٲ㺸��
		tv1.changeChannel(6);
		System.out.println("ä�� ���� ��");
		System.out.println("tv1: " + tv1.showInfo());

		// ���ο� tv�� �������
		Television tv2 = new Television();
		tv2.setChannel(35);
		tv2.setVolume(100);
		tv2.setSerialNumber("11�� 1111");

		// tv2�� ������ ��������
		tv2.increaseVolume();
		System.out.println("tv2 ���� ����");
		System.out.println("tv1: " + tv1.showInfo());
		System.out.println("tv2: " + tv2.showInfo());
		
		// ��ü�� ��
		System.out.println("tv1.equals(tv2): "+tv1.equals(tv2));
		
		Television tv3 = new Television("99Ÿ 9999", 0, 0);
		Television tv4 = new Television("99Ÿ 9999", 0, 0);
		System.out.println("tv3.equals(tv4): "+tv3.equals(tv4));
		
		//System.out.println()�� �Ķ���ͷ� ��ü�� �ָ� �������� �߻��ұ�?
		System.out.println(tv3);
		//System.out.println()�� �Ķ���ͷ� ��ü�� �Ѱ��ָ�
		//�ش� �޼ҵ尡 �Ķ���ͷ� �Ѿ�� ��ü�� toString() �޼ҵ��� �������
		//ȭ�鿡 ����ϰ� �Ѵ�.
		//������ �츮�� toString()�� �������̵� ���� ���� �����̸�
		//java.lang.Object�� �����س���
		//��Ű��.Ŭ�����̸�@�޸��ּ� �� ��µǹǷ�
		//�츮�� ���ϴ� ����� �ƴϴ�.
		//���� ȭ�鿡 ���ϰ� ����ϱ� ���ؼ���
		//toString() �޼ҵ带 Ŭ������ �������̵� �ؾ��Ѵ�.
	}
}













