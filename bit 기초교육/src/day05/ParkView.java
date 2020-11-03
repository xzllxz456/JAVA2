package day05;
// ��� ����ڰ� ���� ȭ���� ��Ī�Ѵ�.
// ���� �츮�� �����α׷����� �Ѵٸ�
// html Ȥ�� ���������� �䰡 �ȴ�.
// ������ �츮�� �ֿܼ��� ���α׷����ϹǷ�
// �ϳ��� Ŭ������ �ȴ�.

import java.util.Scanner;

public class ParkView {
	private ParkController controller;
	private Scanner scanner;
	private final int SIZE = 5;
	private final int UNIT_MINUTE = 10;
	private final int UNIT_PRICE = 1000;
	public ParkView() {
		controller = new ParkController();
		scanner = new Scanner(System.in);
		showMenu();
		scanner.close();
	}
	
	// �޴��� ����ϴ� showMenu() �޼ҵ�
	private void showMenu() {
		while(true) {
			System.out.println("��Ʈ ������ ���� ���α׷�");
			System.out.println("        1. ����");
			System.out.println("        2. ����");
			System.out.println("        3. ����");
			System.out.print("> ");
			int choice = scanner.nextInt();
			if(choice == 1) {
				//������ ����ϴ� �޼ҵ� ����
				insertParkVO();
			}else if(choice == 2) {
				//������ ����ϴ� �޼ҵ� ����
				deleteParkVO();
			}else if(choice == 3) {
				//�޽��� ����� break
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
		}
	}
	
	//������ ����ϴ� �޼ҵ�
	private void insertParkVO() {
		//1. �����忡 ���������� �ִ��� Ȯ��
		if(controller.size() < SIZE) {
			// ������ �����Ƿ� ���� ����
			
			// �����͸� ���� ParkVO ��ü ����
			ParkVO p = new ParkVO();
			
			// ���� ��ȣ�� �Է��ϴ� �޼ҵ� ����
			validateNumber(p);
			
			// �ð��� �Է��ϴ� �޼ҵ� ����
			p.setInTime(validateTime());
			// controller�� p�� �߰��Ѵ�.
			controller.add(p);
		}else {
			// ������ �����Ƿ� ���޽��� ���
			System.out.println("���� ������ �����ϴ�.");
		}
	}
	
	private void validateNumber(ParkVO p) {
		System.out.print("���� ��ȣ: ");
		scanner.nextLine();
		p.setNumber(scanner.nextLine());
		while(controller.contains(p)) {
			System.out.println("�̹� ������ ��ȣ�Դϴ�.");
			System.out.print("���� ��ȣ: ");
			p.setNumber(scanner.nextLine());
		}
	}
	
	private int validateTime() {
		System.out.print("�����ð�: ");
		int inTime = scanner.nextInt();
		while(controller.validateTime(inTime)) {
			System.out.println("�߸��� �ð� �����Դϴ�.");
			System.out.print("�����ð�: ");
			inTime = scanner.nextInt();
		}
		return inTime;
	}
	
	//������ ����ϴ� �޼ҵ�
	private void deleteParkVO() {
		//���� ������ ������ �����ϴ��� üũ�Ѵ�.
		if(controller.size() != 0) {
			//������ ������ �����ϹǷ� ���� ����
			
			//ParkVO ��ü ����
			ParkVO p = new ParkVO();
			
			//���� ���� ��ȣ�� �Է¹޴´�.
			validateDeleteNumber(p);
			
			//�����ð��� �Է¹޴´�.
			int outTime = validateOutTime(p);
			
			//ParkVO ��ü�� outTime�� �̿��Ͽ�
			//��� ����� �Ѵ�.
			calculateRate(p, outTime);
			
			//�ش� ��ü�� �������ش�.
			controller.remove(p);
		}else {
			System.out.println("������ ������ �����ϴ�."); 
		}
	}
	
	private void validateDeleteNumber(ParkVO p) {
		scanner.nextLine();
		System.out.print("���� ��ȣ: ");
		p.setNumber(scanner.nextLine());
		while(!controller.contains(p)) {
			System.out.println("������ ����� ���� ��ȣ�Դϴ�.");
			System.out.print("���� ��ȣ: ");
			p.setNumber(scanner.nextLine());
		}
		controller.insertInTime(p);
	}
	
	private int validateOutTime(ParkVO p) {
		System.out.print("���� �ð�: ");
		int outTime = scanner.nextInt();
		while(controller.validateTime(outTime) ||
				p.getInTime() > outTime) {
			System.out.println("�߸��� �ð��Դϴ�.");
			System.out.print("���� �ð�: ");
			outTime = scanner.nextInt();
		}
		
		return outTime;
	}
	
	private void calculateRate(ParkVO p, int outTime) {
		//�ð��� ���� ���
		int hourDiff = outTime / 100 - p.getInTime() / 100;
		//���� ���� ���
		int minuteDiff = outTime % 100 - p.getInTime() % 100;
		//2���� �� ������ �ջ�
		int totalDiff = hourDiff * 60 + minuteDiff;
		//��� ���
		int rate = totalDiff / UNIT_MINUTE * UNIT_PRICE;
		
		System.out.println("���� ����� �� "+rate+"���Դϴ�.");
	}
}















