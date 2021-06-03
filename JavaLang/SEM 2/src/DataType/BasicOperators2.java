package DataType;

public class BasicOperators2 {
	public static void main(String [] args) {
		
		//정수인 값 500, 1000을 저장하는 변수 a,b를 정의하고
		//두 변수의 '<'를 사용하여 두 변수의 크기를 비교해서
		//논리값을 저장하는 변수 c를 정의하시오.
		int a=500, b=1000;
		boolean c=(a<b);
		System.out.println(c);
		
		
		//(a>b) 라는 연산식과 (a<b)라는 연산식을 논리곱(logical AND)연산을
		// 해서 변수 d에 저장하시오.
		boolean d = (a>b)&&(a<b);//&&, ||:단축형 논리연산자
		System.out.println(d);
		
	}

}
