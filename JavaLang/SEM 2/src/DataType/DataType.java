package DataType;

public class DataType {
	
	public static void main(String[]args) {

	/* 자바에는 두 가지 데이터형이 있다.
	 * 1. 기분 데이터형 : 문자, 숫자, 논리값
	 * - 숫자
	 *  -- 정수 (기분데이터형 : double): float, double
	 *  (예) 10 + 20.5
	 * - 문자 : char
	 * - 논리값 : boolean
	 * 2. 참조 데이터형 : 객체의 주소값
	 * - 배열, 클레스, 인터페이스, enum
	 * 
	 * 프로그램에서 데이터를 어디에 저장할 수 있습니까?
	 * 1. 변수
	 * 2. 상수
	 * 3. 배열
	 * 4. 컬렉션
	 * 
	 * 변수란 무엇인가?
	 * 1.개의 데이터/ 값을 저장할 수 있는 메모리 장소/공간
	 * - 이름이 있어야 하고, 크기가 정해져야 한다.
	 * - 변수 선언 : 데이터형 변수이름;
	 *   (예) 정수를 저장할 수 있는 num이라는 이름의 변수를 선언하시오.
	 *   int num;
	 * - 변수의 초기화 : 만들어진 변수에 초기값/처음값을 저장하는 것
	 *   (예) num = 100 ;
	 */
	
	// 문자를 저장할 수 있고 이름이 letter언 변수에 초기값으로 K를 저장하시오.
	// 문자를 저장할 수 있고 이름이 letter언 변수에 K로 초기화하시오.
	char letter='K'; // 문자 데이터형은 작은 따옴표 (single quotation mark)을 해야 함
	
	// 실수를 저장할 수 있고 이름이 price언 변수에 초기값으로 3.5를 저장하시오.
	double price=3.5;
	float price2=5.5F;//실수값을 float형으로 표현할 때는 숫자 뒤에 f/F를 붙여야 한다.
	
	// 정수를 저장할 수 있고 이름이 distance언 변수에 초기값으로 10,000을 저장하시오.
	short distance=10000;
	int distance1=10000;
	long distance2=10000L;//보통 어떤 값이 long형의 값이면 그 값 뒤에 L를 붙인다.
	
	/*기분 데이터형의 데이터형 변환
	 *1. 자동 형변환 [묵리적 형변환] : 데이터형의 크기가 작은 데이터형이 큰 데이터형으로 변환될
	 *  (예) int num_i=100;
	 *       double num_d = num_i;
	 *2. 강제 형변환 [명시적 형변환] : 데이터형의 크기가 큰 데이터형이 작은 데이터형으로 변환될
	 *  (예) double num_d = 100.0;
	 *       int num_i = (int) num_d;// ()-형변환 연산자
	 */
	int num_i=100;
	double num_d=num_i;
	System.out.println(num_d);
	
	double num_d2=200.0;
	int num_i2= (int)num_d2;
	System.out.println(num_i2);
	//
	//문자형의 숫자 '0'은 실제 프로그램에서 어떤 값을 가질까요?
	char ch01 = '0';
	System.out.println((int)ch01);
	
	int num01 = 48;
	System.out.println((char)num01);
	}	
}
