package day06_basicAPI;

public class StringEx03 {

	public static void main(String[] args) {
		String s1 = "홍길동"; //직접 초기화에 의한 String객체 생성
		String s2 = "홍길동";
		String s3 = new String("홍길동"); // new 연산자에 의한 객체
		String s4 = new String("홍길동");
		
		//1. 직접 초기화에 의해 생성된 String클래스 객체는
		//   내용이 같은 객체가 있을 경우 새로 생성되지 않고
		//   기존의 객체를 참조한다.
		//Q. String클래스에서 객체의 주소값 비교는 어떻게 하는가?
		//A. 비교연산자 (==)을 이용한다.
		boolean b1 = (s1==s2);
		boolean b2 = (s3==s4);
		System.out.println("s1과 s2주소값 동일 여부: " + b1);
		System.out.println("s3과 s4주소값 동일 여부: " + b2);

	}

}
