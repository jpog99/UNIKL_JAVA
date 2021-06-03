package day02_class;

public class Bicycle {
	
	public String color;
	public int gear;
	
	public Bicycle(){
		this ("white", 1);
	}
	
	public Bicycle(String color, int gear) {
		this.color=color;
		this.gear=gear;
	}
	
	public void breakBi() {
		System.out.println("자전거에 브레이크를 걸었습니다.");
	}
	
	public void controlSpeed(int speed) {
		System.out.println("속도를 " + speed + "로 조정합니다.");
	}
	
	public static void printInfo(Bicycle bi) {
		System.out.println("자전거의 색깔은 " + bi.color + "기어는 " + bi.gear + "입니다");
	}

}
