
public class mainClass {
	public static void main(String[] args) {
		/*
		  operator
		  +, -, *, /, %
		  / : 몫  		9/2 -> 4
		  % : 나눈 나머지 	9%2 -> 1
		 */
		
		int num1, num2;
		int result;		//결과
		
		num1 = 25;
		num2 = 7;
		
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		System.out.println(num1 + " + " + num2 + "=" + result);
		// "\     "hello" \ "world"
		System.out.println("\"hello\" \\ \"world\"");
		
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + "=" + result);
		//주의점
		// /, %
//		num2 = 0;
		result = num1 / num2;		// 2 / 0 안됨
		System.out.println(num1 + " / " + num2 + "=" + result);
		
		result = num1 % num2;		// 2 % 0 안됨
		System.out.println(num1 + " % " + num2 + "=" + result);
		
			// 연산 중 1위
		int n = 0;
		n = n + 1; // 자기 자신(n)을 갱신
		System.out.println("n = " + n);
		n += 1;
		System.out.println("n = " + n);
		
		// increment(증가), decrement(감소)
		n = 0;
		
		n++;	// == n = n + 1
		System.out.println("n = " + n);
		++n;	// == n = n + 1
		System.out.println("n = " + n);
		
		n--;	// == n = n - 1
		System.out.println("n = " + n);
		--n;	// == n = n - 1
		System.out.println("n = " + n);
		
		int num;
		num = 1;
		
		int tag;
		
		System.out.println("========n++");
		tag = num++; 	//tag = (num++)와 동일
		System.out.println("tag = " + tag);
		System.out.println("num = " + num);
		System.out.println("========++n");
		num = 1;
		tag = ++num;
		System.out.println("tag = " + tag);
		System.out.println("num = " + num);
		
		num = 1;
//		int num9;
//		num9=num;
		tag = (num++) + (--num);
		System.out.println("tag = " + tag);
		System.out.println("num = " + num);
	}
	
}
