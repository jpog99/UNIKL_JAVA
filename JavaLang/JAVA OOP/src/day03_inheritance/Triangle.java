package day03_inheritance;

public class Triangle extends Shape {
	//객체 생성시 width와 height값을 저장하고자 함
	//어떻게 하면 될까요?
	//매개변수가 있는 생성자를 정의함
	public Triangle (){
		//super("삼각형");//상속관계에서 부모클래스의 기본생성자를 가리킴
	}
	public Triangle (String name, int width, int height){
		//super("삼각형");
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	public void calcArea() {
		area = (width*height)*0.5;
		System.out.println(name + "의 넓이: " + area);
	}
	
}
