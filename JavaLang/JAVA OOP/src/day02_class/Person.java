package day02_class;

public class Person {
	private String name;
	private int age;
	
	//
	
	//이 클래스를 통해서 만들어지는 객체에 멤버변수의
	//기본 값으로 name은 "홍길동"으로 저장하고
	//age는 19로 저장하도록 기본생성자를 정의하시오.
	
	public Person() {
		name = "홍길동";
		age = 19;
	}
	
	//이 클래스를 통해 생성된 객체의 멤버변수 값을
	//클래스 이름만으로 접근해서 사용하는 printInfo메소드를
	//정의하시오.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void printInfo (Person p) {
		System.out.println("이름은 " + p.name + "이고, 나이는 " + p.age + "입니다.");
	}

}
