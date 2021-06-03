package day06_basicAPI;

public class WrapperEx02 {
	
	public static boolean checkNumber(Object obj) {
		return obj instanceof Number;
	}

	public static void main(String[] args) {
		//매개변수로 들어온 값이 숫자인지를 판별하는
		//클래스메소드 checkNumber를 정의하되 잔환형은 boolean이고
		//이 메소드는 매개변수로 Object형의 obj를 가진다.
		//checkNumber메소드를 작성하시오.
		
		System.out.println(checkNumber('a'));
		System.out.println(checkNumber(100));
		System.out.println(checkNumber(true));

	}

}
