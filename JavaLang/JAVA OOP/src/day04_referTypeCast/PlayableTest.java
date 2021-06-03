package day04_referTypeCast;

public class PlayableTest {
	
	public static void playTest(Playable p) {
		p.play();
		/*레퍼런스 변수 p를 다운케스팅을 하지 않고 그냥 쓴 이유:
		 * play() 메소드는 메소드 오버라이딩된 메소드이기 때문
		 * 즉, 메소드 오버라이딩된 메소드의 호출은 레퍼런스형변환의
		 * 영향을 받지 않으므로 다운캐스팅 없이 호출함
		 */
	}

	public static void main(String[] args) {
		SoccerPlayer sp = new SoccerPlayer();
		Playable p1 = sp; //업캐스팅
		p1.play();
		playTest(sp);

		BasketballPlayer bp = new BasketballPlayer();
		playTest(bp);

	}

}
