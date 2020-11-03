package day05;
// ��Ʈ�ѷ� Ŭ������
// ��κ��� ���� ��û�� ���߾� 
// �޼ҵ带 �����ؼ� �����ͺ��̽��κ��� �����͸� �޾ƿͼ�
// ��� �����͸� �����ؼ� �����ش�.
// ������ �츮�� �����ͺ��̽��� ���� ������
// �������� �����͸� ������ �� �ִ�
// ��̸���Ʈ�� �ʵ�� �ϳ� ������ �ְ�
// �� �ʵ忡 �߰�, ����, �ҷ����� ���� ����� ��Ʈ�ѷ� �޼ҵ带 ���ؼ�
// ���������

import java.util.ArrayList;

public class ParkController {
	private ArrayList<ParkVO> list;
	
	//�����ڸ� ���� �� �����ڰ� 
	//ArrayList�� �����ڸ� �ҷ����� ������
	public ParkController() {
		list = new ArrayList<>();
	}
	
	//1. ���� ����Ʈ�� ũ�⸦ ��ȯ�ϴ� size() �޼ҵ�
	public int size() {
		return list.size();
	}
	
	//2. �Ķ���ͷ� �Ѿ�� ParkVO ��ü�� �����ϴ��� üũ�ϴ�
	//   contains() �޼ҵ�
	public boolean contains(ParkVO p) {
		return list.contains(p);
	}
	
	//3. �Ķ���ͷ� �Ѿ�� ParkVO ��ü�� ����Ʈ�� �߰��ϴ�
	//   add() �޼ҵ�
	public void add(ParkVO p) {
		list.add(p);
	}
	
	//4. �Էµ� �ð��� ��ȿ���� üũ�ϴ� 
	//   validateTime()
	public boolean validateTime(int time) {
		int hour = time / 100;
		int minute = time % 100;
		
		if(hour < 0 || hour > 23 || minute < 0 || minute > 59) {
			return true;
		}else {
			return false;
		}
	}
	
	//5. �Ķ���ͷ� �Ѿ�� ��ü��
	//   �ش� ��ü�� ��ġ�ϴ� ����Ʈ�� ��ü�� inTime��
	//   �Է��ϴ� insertInTime() �޼ҵ�
	public void insertInTime(ParkVO p) {
		// 1. list���� ���� ��ü�� ��ġ�ϴ� ��ü�� index�� ã�´�.
		int index = list.indexOf(p);
		// 2. �ش� ��ü�� inTime�� p�� inTime�� �ִ´�.
		p.setInTime(list.get(index).getInTime());
	}
	
	// 6. �Ķ���ͷ� �Ѿ�� ParkVO ��ü p��
	//    ����Ʈ���� �����ϴ� remove() �޼ҵ�
	public void remove(ParkVO p) {
		list.remove(p);
	}
}

















