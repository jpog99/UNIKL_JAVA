package day03_control_loop;

public class ForMultipleTable {

	public static void main(String[] args) {
		//12*12단을 새로로 출력하는 프로그램을 작성하시오.
		for (int i = 1; i<12; i++)
			for(int j = 1; j<12; j++)
				System.out.println("\n" + (i +" * "+ j +" = "+(i * j)));
		System.out.println( );

	}

}
