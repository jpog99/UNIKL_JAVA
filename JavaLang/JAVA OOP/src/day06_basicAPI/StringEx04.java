package day06_basicAPI;

public class StringEx04 {

	public static void main(String[] args) {
		// String클래스 객체는 한번 생성되면 ㅈㄹ대 불변 !
		String s1 = "Hello";
		String s2 = s1.concat(", Holiday");
		String s3 = s1.replace("l", "L");
		System.out.println(s1);

	}

}
