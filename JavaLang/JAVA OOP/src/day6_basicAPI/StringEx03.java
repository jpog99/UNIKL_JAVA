package day6_basicAPI;

public class StringEx03 {
	public static void main(String[] args) {
		String s1 = "Wan";
		String s2 = "Wan";
		String s3 = new String ("Wan");
		String s4 = new String ("Wan");
		
		//1.In Object class, method .equal used to compare reference value.
		//  In String, we use (==).
		boolean b1 = (s1==s2);
		boolean b2 = (s3==s4);
		System.out.println(b1+"."+b2);
		//b2 is false because the "new" constructor. Both are different object.
	}

}
