package day01;
// ��������
// �������ڴ� 2���� boolean���� ���� ������ �Ѵ�.
// &&: AND ����. 2���� ��� true�϶��� true�� ���´�.
// ||: OR ����. 2�� �� �ϳ��� true�̸� true�� ���´�.
// !: ����(����) ����. true�� false�� false�� true�� �����Ѵ�.

//  | I l 1
//  |: shift+\
//     \�� �ѱ� Ű���忡�� ��ȭ ǥ�ÿ� ��ġ�� �齽���� ��� Ű�Է��̴�.
//     ������ ��ȭǥ�ö�� ���� ���� �齽���� Ȥ�� ����������� �ҷ�����
//  I: �빮�� i
//  l: �ҹ��� l
//  1: ���� 1

public class Ex10Operator04 {
	public static void main(String[] args) {
		// &&(AND) ����
		System.out.println("true && true: "+(true && true));
		System.out.println("true && false: "+(true && false));
		System.out.println("false && true: "+(false && true));
		System.out.println("false && false: "+(false && false));
		
		// ||(OR) ����
		System.out.println("true || true: "+(true || true));
		System.out.println("true || false: "+(true || false));
		System.out.println("false || true: "+(false || true));
		System.out.println("false || false: "+(false || false));
		
		// ! ����
		System.out.println("!true: "+(!true));
		System.out.println("!false: "+(!false));
	}
}













