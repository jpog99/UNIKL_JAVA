package day04_enum;

public class DirectionTest {
	public static void main (String [] args) {
		System.out.println("동쪽의 영어명칭 :" + Direction.EAST);
		System.out.println("동서남북에서 동쪽의 순서 : " + Direction.EAST.ordinal()+1);
		
		System.out.println("동쪽의 각도: " + Direction.EAST.val);

}
}