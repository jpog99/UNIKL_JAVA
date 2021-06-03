package day03_inheritance;

public abstract class Shape {//추상클래스
	protected String name;
	protected double width;  //originally int
	protected double height; //originally int
	protected double area;
	
	public Shape() {}
	
	public Shape(String name) {
		this.name = name;
	}
	//자식클래스에서 같은 이름의 메소드를 사용하도록 강제함.
	//:추상메소드를 정의해 줌
	public abstract void calcArea();
}
