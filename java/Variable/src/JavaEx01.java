
public class JavaEx01 {
	public static void main(String[] args) {
		String name = "홍길동";
		String name1 = "일지매";
		int age = 20;
		int age1 = 18;
		String pnum = "010-111-2222";
		String pnum1 = "02-123-4567";
		String a = "경기도";
		String b = "서울";
		
		System.out.println("=======================================");
		System.out.println("| 이름\t나이\t전화번호\t\t주소\t|");
		System.out.println("=======================================");
		System.out.println("| 홍길동\t20\t010-111-2222\t경기도\t|");
		System.out.println("| 일지메\t18\t02-123-4567\t서울\t|");
		System.out.println("=======================================");
		System.out.println("| 이름\t나이\t전화번호\t\t주소\t|");
		System.out.println("=======================================");
		System.out.print("|" + name + "\t" + age+ "\t" + pnum+ "\t" + a+ "\t|\n");
		System.out.print("|" + name1 + "\t" + age1+ "\t" + pnum1+ "\t" + b+"\t|\n");
		System.out.println("=======================================");
	}
}
