package day01_classAndobject;

class Smartphone {
	
	//멤버변수
	String color; //인스턴스변수
	double price;
	static String name; // 클래스변수 / static변수
	
	//메서드
	public void powerOn() {System.out.println(name + "(이)가 켜졌습니다.");}
	public void powerOff() {System.out.println(name + "(이)가 꺼졌습니다.");}
	public void runApp() {System.out.println(name + "(이)가 앱을 실행했습니다.");}
	//클래스메서드 / static 메서드
	public static void printInfo(Smartphone sp) {
		System.out.println(name + ":" + sp.color + ", "  + sp.price);
	}
	

}
