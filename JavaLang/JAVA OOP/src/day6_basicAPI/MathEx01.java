package day6_basicAPI;

public class MathEx01 {
	public static void main(String[] args) {
		
		int i = Math.abs(-10);  //absolute value modulus
		System.out.println(i);
		
		double d = Math.ceil(10.1);  //increase value to nearest high whole number
		System.out.println(d);
		
		double d2 = Math.floor(10.8);  //opposite with ceil
		System.out.println(d2);
		
		double d3 = Math.max(3.5, 4.5); //take higher value
		System.out.println(d3);
		
		int i2 = Math.min(5,7); //take lower value
		System.out.println(i);
		
		double d4 = Math.random();  //random vakue
		System.out.println(d4);
		
		long l = Math.round(5.55); //round off
		System.out.println(l);
	}
}
