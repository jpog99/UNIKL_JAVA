package day06_basicAPI;

import java.util.Scanner;

public class StringEx02 {
	public static void main(String[] args) {
		// "Have a nice weekend!" 값을 가지는 String형 변수
		// s1을 정의하시오.
		String s1 = "Have a nice weekend!";
		
		//"a"의 인덱스값 String클래스의 메소드를 이용해서 출력하시오.
		int idx = s1.lastIndexOf("a");
		System.out.println("a의 인덱스값: " + idx);
		
		//"weekend"를 "holiday"로 String클래스의 메소드를
		//이용해서 바꾸고 바꾼 문자열을 출력하시오.
		System.out.println(s1.replace("weekend", "holiday"));
		
		//사용자로 하여금 "yes", "y", "YES", "Y", "no", "n", "NO", "N"
		//값들을 입력받을 때 먼저 모두 대문자로 만들고 첫번째 값만을 추출
		//해서 화면에 출력하시오.
		System.out.println("Enter your answer (yes or no)");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String input2 = input.toUpperCase();
		char ans = input2.charAt(0);
		System.out.println("입력된 대답: " + ans);

	}

}
