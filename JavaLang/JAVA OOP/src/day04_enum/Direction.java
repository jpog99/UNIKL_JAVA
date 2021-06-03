package day04_enum;

public enum Direction {
	EAST("동쪽", 90 ),
	WEST("서쪽", 270),
	SOUTH("남쪽", 180),
	NORTH("북쪽", 0);
	
	String kor;
	int val;
	Direction(String kor, int val) { //접근지정자 private 쓸 수 있는데 생략했다
		this.kor = kor ;
		this.val = val;
	}
}
