package day05_exception;

public class ExceptionEx04 {

	public static void main(String[] args) {
	try {	
		
		throw new InvalidIDException();
	
	}catch(InvalidIDException e){
		e.printStackTrace();
	}
		System.out.println("프로그램 종료");

	}

}