package day03_inheritance;

public class ShapeTest {
	public static void main (String[]args) {		
		Rectangle rect = new Rectangle("직사각형", 7, 9);
		rect.calcArea();
		
		Triangle tri = new Triangle("삼각형", 5, 15);
		tri.calcArea();
		
		//Shape클래스의 기본생성자를 주석처리하고 다시 실행해 보세요.
	}

}
