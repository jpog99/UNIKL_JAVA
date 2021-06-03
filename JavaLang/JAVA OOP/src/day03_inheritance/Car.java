package day03_inheritance;

public abstract class Car {
	protected String name;
	protected String type;
	protected int price;
	
	public abstract void printInfo();
	
//	public Car getInstance() {
//		return this;
//	}
}

//Car클래스의 자식클래스로 taxi클래스와 Bus클래스를
//작성하고 각각의 클래스 객체를 생성할 때 멤버변수가
//초기화 될 수 있도록 하고 printInfo() 메소드를 통해
//객체의 정보를 출력하도록 프로그램을 작성하시오.
