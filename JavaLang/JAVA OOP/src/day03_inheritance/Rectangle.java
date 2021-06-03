package day03_inheritance;

public class Rectangle extends Shape {
	
	public Rectangle() {
		//super("직사각형");
	}
	
	public Rectangle( String name, int width, int height) {
		//super("직사각형");
		this.name= name;
		this.width = width;
		this.height = height;
	}
	public void calcArea() {
		area = (width*height);
		System.out.println(name + "의 넓이: " + area);
	}

}
