package DataType;

public class BasicOperators {
	
	public static void main(String[] args) {
		/* 연산자 (operator)
		 * 1. 단항 연산자 : 증감연산자 (++, --), 
		 *                  케이팅연산자 ('(데이터형)'), 
		 *                  논리부정연산자 (!)
		 * 
		 * 2. 이항 연산자 : 산술연산자 (+,-,*,/,%), 
		 *                  비교연산자 (>,<.>=,<=,==,!=), 
		 *                  논리연산자 (&,|,^,&&,||), 
		 *                  비트연산자 (&,|), 
		 *                  시프트연산자 (<<<,>>>) ,
		 *                  연결연산자 (+), 
		 *                  대입연산자 (=), 
		 *                  확장 대입 연산자 (+=,*=,,,)
		 * 
		 * 3. 삼항 연산자[조건 연산자] : (조건식)? (참일때 결과값) : (거짓이때 결과값)
		 *                                ((13%2) == 0)? "짝수" : "홀수"
		 * #연산자에의 최고 우선순위는 괄호()이다.
		 */
		
		//100과 200을 저장하는 변수로 num1과 num2를 정의하고 이에 대한
		//산술연산을 하여 sum, difference, product, quotient, remainder값을
		//각각 구하는 연산식을 작성하시오.
		int num1=100, num2=200;
		int sum=num1+num2;
		int difference=num1-num2;
		int product=num1*num2;
		double quotient=num1/(num2+0.0);//살수연산의 특징:기준은 int형이고 int형보다
		//작은 데이터형은 int형으로 변환시키고 int형보다 큰 데이터형이 있는 경우에는 그 데이터형
		//변환이 이루어진다.
		byte a=50;
		byte b=50;
		int c=a+b;
		
		int remainder=num1%num2;
		
		System.out.println(sum);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(quotient);
		System.out.println(remainder);
	}

}
