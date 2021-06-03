package day6_basicAPI;

public class WrapperEx01 {
	public static void main(String[] args) {
		//Wrapper class: Class which is about basic data type (int,char, boolean etc)
		//Integer,Short,Byte,Long,Double,Float are all under Number class. So they're upcasting.
		//Before JDK5, auto-boxing and auto-unboxing is not supported:
		int i = 100;
		Integer i2 = new Integer(i);
		int i3 = i2.intValue();
		
		//After JDK5, auto-boxing and auto-unboxing is supported:
		int i4 = 200;
		Integer i5 = i4;
		int i6 = i5;
	}

}
