package day06_basicAPI;

public class Computer implements Cloneable{
	//같은 패키지 내에서 접근 가능하고 String형인 인스턴스변수 model과
	//int형인인스턴스변수 price를 정의하시오.
	String model;
	int price;
	
	//생성자는 내용이 없는 기본생성자와 매개변수가 있는 생성자를 정의하되,
	//매개변수는 String형의 model과 int형의 price이고 이 매개변수로
	//멤버변수를 초기화하도록 정의하시오
	
	public Computer( ){
		//클래스 내에 있는 다른 생성자를 호출해서 model은 "m0001"로
		//price는 1500으로 초기화하시오.
		this("M0001", 1500);
	}
	
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	//멤버변수의 내용을 출력하도록 Object클래스 toString메소드를
	//메소드 오버라이딩하시오.
	@Override                                                   //toString(then ctrl+space)
	public String toString() {
		return model + ": " + price;
	}

}
