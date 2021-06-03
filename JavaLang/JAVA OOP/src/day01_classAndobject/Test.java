package day01_classAndobject;

public class Test {
	public static void main(String[] args) {
		//Smartphone클래스 객체 생성하기
		Smartphone s1 = new Smartphone();
		s1.color="black";
		s1.price=3000.0;
		Smartphone.name="S9";
		s1.powerOn();
		s1.runApp();
		s1.powerOff();
		
		Smartphone.printInfo(s1);
		Smartphone.name="i10";
		Smartphone s2 = new Smartphone();
		s2.color = "red";
		s2.price = 1500 ;
		Smartphone.printInfo(s2);
		s2.powerOn();
		s2.runApp();
		s2.powerOff();

	}

}
