
public class mainClass1 {
	public static void main(String[] args) {
		int num1; 	//local(지역) variable, auto 변수
		
		{
			int num2;   //local(지역) variable
			
			num1 = 23; 	// memory : stack, heap, static, sys
		}
		num1 = 24;
//		num2 = 23; // num2는 지역변수 외부 접근 불가
		
		// 변수
		// 숫자명
		byte b = 0;		//1byte
		short s = 0;	//2byte
		int i = 0; 		//4byte
		long l = 12342312413L;		//8byte
		
		float f = 123.4567F; //4byte
		double d = 123.412312;//8byte
		
		/*
		 * app(window) == web(브라우저) 표현방법만 다를뿐
		 * 
		 * 관리프로그램
		 * oracle <= java -> web
		 * 		백엔드 	|프론트   html, JS(JavaScript), css
		 * 					  JSP -> Vue, React
		 */
		//문자형
		char c = '한'; //2byte
		String str = "hello"; // wrapper class ,글자수 글자길이로 취급
		String str1 = new String("hello"); //str 과 동일
		str = str + "  world";// 빈문자 가능  연산자 사용 가능, 함수호출임
		str = str.concat("  world");
		
		//논리형
		boolean b1 = true;// 1
		b1 = false; 	  // 0
	}
}