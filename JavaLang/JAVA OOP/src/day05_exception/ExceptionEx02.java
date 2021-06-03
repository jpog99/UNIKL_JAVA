package day05_exception;

public class ExceptionEx02 {

	public static void main(String[] args) {
	try {	
		throw new ArithmeticException();
		
	}
	catch(ArithmeticException ae){
		System.out.println("산술적 예외 발생");
	}
		
		System.out.println("프로그램 종료");

	}

}