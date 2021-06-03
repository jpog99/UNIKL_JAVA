package day06_basicAPI;

public class MathEx01 {

	public static void main(String[] args) {
		int i = Math.abs(-10); //절대값
		System.out.println(i);
		
		double d = Math.ceil(10.1); //올림
		System.out.println(d);
		//Returns the smallest (closest to negative infinity) double value that is greater 
		//than or equal to the argument and is equal to a mathematical integer.
		
		double d2 = Math.floor(10.8); //버림
		System.out.println(d2);
		//Returns the largest (closest to positive infinity) double value that is less 
		//than or equal to the argument and is equal to a mathematical integer.
		
		double d3 = Math.max(3.5, 4.5); //큰 값
		System.out.println(d3);
		
		int i2 = Math.max(5, 7); //작은 값
		System.out.println(i2);
		
		double d4 = Math.random(); //난수
		System.out.println(d4);
		//Returns a double value with a positive sign, greater than or equal to 0.0 
		//and less than 1.0. (1.0>value>=0.0)
		
		long l = Math.round(5.55); //반올림
		System.out.println(l);
		//Returns the closest long to the argument, with ties rounding to positive infinity.

	}

}
