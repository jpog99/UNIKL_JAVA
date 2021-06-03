package day02_class;

public class BicycleTest {
	
	public static void main (String []args) {
		
		Bicycle bi01 = new Bicycle();
		
		bi01.breakBi();
		bi01.controlSpeed(50);
		
		Bicycle.printInfo(bi01);
		
		Bicycle bi02 = new Bicycle("blue",2);
		
		Bicycle.printInfo(bi02);
	}

}
