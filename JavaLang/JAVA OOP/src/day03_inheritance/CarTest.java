package day03_inheritance;

public class CarTest {
	
	public static void main(String[]args) {
		Taxi taxi = new Taxi("택시","가솔린", 1000);
		taxi.printInfo();
		
		Bus bus = new Bus ("버스","디젤", 2000);
		bus.printInfo();
		
		//추상클래스인 Car클래스 객체 생성 테스트
		//Car c1 = new Car(); (x)
		
	}

}