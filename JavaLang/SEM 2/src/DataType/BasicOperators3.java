package DataType;

public class BasicOperators3 {

	public static void main(String[] args) {
		//증감연산자 : ++(1씩 증가), --(1씩 감소)
		//선행 증감연산자 (피연산자 앞에 증감연산자가 위치함) ,
		//후행 증감연산자 (피연산자 뒤에 증감연산자가 위치)
		int a = 10;
		int b = 5;
		a++;                             //후행 증감연산자 ~ a:11
		++b;                             //선행 증감연산자 ~ b:6
		int c = ++a; //c:12, a:12
		int d = b++; //d:6, b:7
		c = a++ + --d; //c:17, a:13, d:5
		System.out.println("a:"+a+",b:"+b+",c:"+c+",d:"+d);

	}

}
