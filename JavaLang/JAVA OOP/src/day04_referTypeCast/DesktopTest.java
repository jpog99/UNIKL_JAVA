package day04_referTypeCast;

public class DesktopTest {

	public static void main(String[] args) {
		Desktop d1 = new Desktop();
		Computer c1 = d1;
		//System.out.println(c1.color);
		Desktop d2 = (Desktop) c1;
		System.out.println(d2.color);
		
		Computer c2 = new Computer(); 
		Desktop d3 = (Desktop) c2; //error
		//sebab dah create an object untuk c2 that has no relation to 
		//desktop so tak leh nak downcast or upcast
		System.out.println(d3.model);
	}

}
