package day03_control_loop;

public class ForMultipleTable2 {

	public static void main(String[] args) {
		//12*12단을 가로로 출력하는 프로그램을 작성하시오.
		for (int i=1; i<13; i++) {
			for(int j=1; j<13; j++)
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
		
			System.out.println( );

	}
  }
}