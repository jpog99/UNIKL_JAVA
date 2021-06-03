package soalan7;


public class check {
	static Object obj = new Object();
	public static boolean checkNum (Object obj) {
		return obj instanceof car;
	}
	
	public static void main(String[] args) {
		
	check c = new check();
    System.out.println(checkNum(c));
   
	}
}