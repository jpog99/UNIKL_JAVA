package day05_exception;

public class ExceptionEx01 {

	public static void main(String[] args) {
	try {	
		int x = 100/0;
	}
	catch(ArithmeticException ae){
		System.out.println("0으로 나눌 수 없음");
	}
		System.out.println("프로그램 종료");

	}

}