package day06_basicAPI;

public class StringEx01 {

	public static void main(String[] args) {
		// String클래스의 문자열값 중에서 특정 문자 추출하기
		//"Demonstrate the understanding of object-oriented
		//programming principles" 문자열값을 가지는 String형의
		//변수 s1을 정의하시오.\
		
		String s1 = " Demonstrate the understanding of object-oriented programming principles ";
		
		//1. 이 문자열값의 길이를 String클래스의 메소드를 이용해서
		//   구하시오.
		System.out.println("s1의 길이:" + s1.length());
		
		//2. 이 문자열값 앞뒤에 있는 whitespace를 String클래스의
		//메소드를 이용해서 지우시오.
		
		System.out.println("앞뒤 공백문자 없앤 후 s1의 길이: " + s1.trim().length());
			
		
		//3. 문자열값에서 String클래스의 메소드들을 이용해서
		//   "object"만 추출하시오.
		
		int o_idx=s1.indexOf("object");
		String ans = s1.substring(o_idx, (o_idx+6));
		System.out.println("s1에서 추출한 object: " + ans);
		
		//4. 문자열값에서 앞뒤공백을 없애고 공백을 기준으로
		//   문자열을 쪼개어서 문자열 배열로 만드시오.
		
		String[] words = null;
		String s2 = s1.trim();
		words = s2.split(" ");
		
		//배열 안에 저장된 값들을 하나씩 출력하기
		//확장 for문 이용 : for(데이터형 변수 : 배열변수)
		
		for(String word : words)
			System.out.println(word);
		}

	}
