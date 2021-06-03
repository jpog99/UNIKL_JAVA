package day06_basicAPI;

public class Wrapper {

	public static void main(String[] args) {
		//Wrapper클래스 : 기본데이터형에 대한 클래스
		//JDK5 이전에는 auto-boxing and auto-unboxing이 지원되지 않음
		int i = 100;
		Integer i2 = new Integer(i);
		int i3 = i2.intValue();
		
		//JDK5 이후 auto-boxing, auto-unboxing이 지원됨
		int i4 = 200;
		Integer i5 = i4; //auto-boxing
		int i6 = i5; //auto-unboxing

	}
}
