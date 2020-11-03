package day04;
// ArrayList

// �迭�� Ŭ����ȭ ���Ѽ� ����ϱ� ���ϰ� ����
// �ڹ��� util

import java.awt.List;
import java.util.ArrayList;

public class Ex03ArrayList01 {
	public static void main(String[] args) {
		// ArrayList�� �迭�� Ŭ����ȭ ���ѳ���
		// Ŭ�����ν�, ũ�Ⱑ �������̰�, �� ��������
		// ��Ҹ� �ٷ�µ� ������ �޼ҵ���� �����Ǿ��ִ�.

		// ArrayList<������Ÿ��> �̸� = new ArrayList<>();
		// ����ȿ� �ش� ��̸���Ʈ�� � Ŭ������ ���������� ����� �ϴµ�
		// �̶� ����ȿ��� Ŭ������ �� �� �ִ�!!!!
		// �׷��ٸ� �⺻�� ������Ÿ�� 8������...?
		// �� 8���� ������Ÿ���� Ŭ�������� �ƴϱ� ������
		// <>�ȿ� �� �� ����.
		// �׷��� java�� �ش� �⺻�� ������Ÿ�Ե��� Ŭ������ �ٲ����
		// wrapper Ŭ����(���� Ŭ����)�� �̸� �������Ҵ�.
		// int �� Integer, double �� Double ...
		// �׷��� �ʿ��ϴٸ� �ش� ���� Ŭ������ ������Ÿ������ ������ �ȴ�.

		ArrayList<Student> studentList = new ArrayList<>();

		// ��̸���Ʈ�� ũ�⸦ �˰� �ʹٸ�
		// size() �޼ҵ带 �����ϸ� �ȴ�!
		System.out.println("studentList.size(): " + studentList.size());

		Student s1 = new Student("1", "a");
		Student s2 = new Student("2", "b");
		Student s3 = new Student("3", "c");
		Student s4 = new Student("4", "d");
		Student s5 = new Student("5", "e");

		// ��̸���Ʈ�� ��Ҹ� �߰��Ҷ�����
		// add() �޼ҵ带 �����ϸ� �ȴ�!
		studentList.add(s1);
		System.out.println("studentList.size(): " + studentList.size());

		studentList.add(s2);
		System.out.println("studentList.size(): " + studentList.size());

		studentList.add(s3);
		System.out.println("studentList.size(): " + studentList.size());

		studentList.add(s4);
		System.out.println("studentList.size(): " + studentList.size());

		// �ش� �ε����� ��Ҹ� ȣ���Ҷ�����
		// get(�ε���) �޼ҵ带 ȣ���ϸ� �ȴ�.
		System.out.println("studentList.get(0): " + studentList.get(0));
		// �� �ε����� �迭ó�� 0~ũ��-1�����̴�.

		// ���� Ư�� ��Ұ� �ش� ����Ʈ�� �����ϴ���
		// Ȯ���ϰ� �ʹٸ� contains(���)�� �����ϸ� �ȴ�.
		// �� �̶���, �ش� Ŭ���� ���ο� equals()�޼ҵ尡 �����Ǿ��־�� �ϰ�
		// �׸��� ���� �Ȱ��� ��ü�� �ƴ϶� equals()�� true�� ������ ��ü����
		// �ȴ�.
		Student s11 = new Student("1", "a");
		System.out.println("list.contains(s1): " + studentList.contains(s1));
		System.out.println("list.contains(s5): " + studentList.contains(s5));
		System.out.println("list.contains(s11): " + studentList.contains(s11));

		// ���� � ��ü�� list�� ��� index�� �����ϴ���
		// Ȯ���ϰ� �ʹٸ�
		// indexOf()�� �����ϸ� �ȴ�.
		// ��, �ش� ��ü�� �������� �ʴ´ٸ�
		// -1�� ���´�.
		// contains�� ���������� equals()�� �ʿ�� �Ѵ�.
		System.out.println("list.indexOf(s1): " + studentList.indexOf(s1));
		System.out.println("list.indexOf(s5): " + studentList.indexOf(s5));
		System.out.println("list.indexOf(s11): " + studentList.indexOf(s11));

		// ���� Ư�� ��ġ�� ��Ҹ� �ٸ� ��ü�� �ٲٰ� �ʹٸ�
		// set(index, ��ü)�� �����ϸ� �ȴ�.
		System.out.println("list.get(0): " + studentList.get(0));
		studentList.set(0, s5);
		System.out.println("list.get(0): " + studentList.get(0));
		
		// ����Ʈ���� ��Ҹ� �����ϴ� ����� �ΰ����� �ִ�.
		// �Ѵ� remove��� �޼ҵ带 ���������
		// remove�� �ε����� ��ü�� ����
		// �����ε��� �Ǿ��ֱ� ������
		// �츮�� �ʿ��� �Ķ���͸� �Ѱ��ָ� �ȴ�.
		
		// 1. �ε��� ��ȣ�� �־
		//    �ش� �ε����� ����
		System.out.println("list.get(0): " + studentList.get(0));
		studentList.remove(0);
		System.out.println("list.get(0): " + studentList.get(0));
		
		// 2. ��ü�� �Ѱ��༭
		//    �ش� ��ü�� ��ġ�ϴ�(=equals�� true�� ������)
		//    ��Ҹ� ����
		
		
		Student s44 = new Student("4", "d");
		System.out.println("list.contains(s44): "+
						studentList.contains(s44));
		studentList.remove(s44);
		System.out.println("list.contains(s44): "+
				studentList.contains(s44));
	}
}











