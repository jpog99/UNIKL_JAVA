package day02_class;

public class PersonTest {

	public static void main(String[] args) {
		//Person클래스 객체를 생성하시오.
		Person p = new Person();
		
		p.setName("이순신");
		p.setAge(20);
		
		//Person클래스의 printInfo메소드를 호출하시오.
		Person.printInfo(p);
		p.printInfo(p);

	}

}
