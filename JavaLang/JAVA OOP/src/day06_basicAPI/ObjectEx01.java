package day06_basicAPI;

public class ObjectEx01 {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		//1. Object클래스의 toString메소드 사용하기
		//   -> 클래스명@해시코드의 16진수값
		//2. Computer클래스의 toString메소드 실행하기
		//   -> 멤버변수의 내용 출력
		System.out.println("toString메소드 결과:" + com1.toString());
		
		//1. Object클래스의 equals메소드 사용하기
		//   -> 객체의 주소값 비교
		Computer com2 = new Computer();
		System.out.println("equals메소드 결과:" + com1.equals(com2));
		
		//Object클래스의 clone메소드 사용하기
		// ;Computer클래스에서 미리 구현해야 할 내용
		// 1. Cloneable인터페이스를 상속해야 함
		// 2. clone메소드를 메소드 오버라이딩해야 함
		try {
			
			Computer com3 = (Computer)com2.clone();
			System.out.println("복사된 Computer객체-" + com3);
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
	
	//멤버변수의 내용이 같은지를 비교하도록 Object클래스의 equals메소드를
	//메소드 오버라이딩하시오.
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		//obj로 입력되는 값이 null값이 아닌지와 Computer클래스
		//객체인지를 먼저 확인하다
		if((obj!=null)  && (obj instanceof Computer)) {
			//obj로 업캐스팅되어잔 참조변수를 다시 다운캐스팅해주어야
			//Computer클래스의 멤버변수에 접근할 수 있다.
			//그래서 obj를 다시 Computer클래스형으로 다운캐스팅해야 함.
			Computer com = (Computer)obj;
			if(model.equals(com.model) && (price == com.price))
				result = true;
		}
		
		return result;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
