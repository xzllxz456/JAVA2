package day05;
// MVC ����

// MVC �����̶� 
// Ŭ������ ũ�� Model, View, Controller 3���� �з��� �����
// ������Ʈ�� ���������� ���� �ϴ� ���α׷��� ���� ����̴�.
// ��: ��Ʈ�ѷ��� ��û�� �����͸� �����ͺ��̽��κ��� �޾ƿͼ�
//      Ŭ������ ���·� ������ش�.
// ��: ����ڰ� ���� ȭ��. ����ڰ� ��û�� ������ �����̴�.
// ��Ʈ�ѷ�: ����ڰ� ���� ��û�� �޾Ƽ� �����͸� �����ϴ� �߰��ٸ�

public class ParkVO {
	// �� Ŭ����
	// ���� ��� �ַ� Value Object�� �ٿ��� VO��
	// Data Transfer Object�� �ٿ��� DTO ��� ���̻簡 �ٴ´�.
	// ���� ���� ��쿡�� �ʵ�, ����/����, java.lang.Object �޼ҵ带 �������̵���
	// �޼ҵ� ������ ���� �ſ� ������ ���°� �ȴ�.

	private String number;
	private int inTime;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public boolean equals(Object o) {
		if (o instanceof ParkVO) {
			ParkVO p = (ParkVO) o;
			if (this.number.equals(p.number)) {
				return true;
			}
		}

		return false;
	}
}
