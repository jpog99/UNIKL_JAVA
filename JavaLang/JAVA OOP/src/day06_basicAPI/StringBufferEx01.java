package day06_basicAPI;

public class StringBufferEx01 {

	public static void main(String[] args) {
		// 긴 텍스트를 가지고 작업을 할 때 유용함
		//file을 복사하거나 네트워크를 통해서 텍스트 데이터
		//작업을 할 때 융용하게 사용할 수 있음
		StringBuffer sb = new StringBuffer();
		sb.append("A thread-safe, mutable sequence of characters. A string buffer is like a String, but can");
		sb.append("\nbe modified. At any point in time it contains some particular sequence of characters, but ");
		sb.append("\nthe length and content of the sequence can be changed through certain method calls.");
		
		System.out.println(sb.toString());
	}

}
