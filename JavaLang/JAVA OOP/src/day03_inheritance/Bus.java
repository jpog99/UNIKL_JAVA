package day03_inheritance;

public class Bus extends Car {
	public Bus() {}
	
	public Bus (String name, String type, int price){
		this.name = name;
		this.type = type;
		this.price = price;
}
	@Override
	public void printInfo() {
		System.out.println(name+ ": "+type+","+ price + "원");
	}
}
