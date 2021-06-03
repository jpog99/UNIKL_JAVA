package day6_basicAPI;

public class StringEx04 {
	public static void main(String[] args) {
		//After make String class's object, it never change!
		//If you syso s1, the original s1 will output.
		String s1 = "Hello";
		String s2 = s1.concat(", Holiday");
		String s3 = s1.replace("l", "L");
		System.out.println(s1);
		
		
	}

}
