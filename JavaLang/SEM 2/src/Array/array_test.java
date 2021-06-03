package Array;

public class array_test {

	public static void main(String[] args) {
		//int[][]scores = new int [3][3];
		int[][]scores = { {90,90,95},{80,100,90},{70,80,80} };
		
		int eng_tot=0, math_tot=0, sci_tot=0;
		//double eng_avg, math_avg, sci_avg;
		
		for (int row=0; row< scores.length; row++) {
			for (int col=0; col<scores[row].length; col++) {
				switch(col) {
				case 0 : eng_tot += scores[row][col]; break;
				case 1 : math_tot += scores[row][col]; break;
				case 2 : sci_tot += scores[row][col]; break;
				}
			}
		}
		//System.out.println(eng_avg+", "+math_avg+", "+sci_avg);
		System.out.println(eng_tot/(scores.length+0.0)+", "
						  +math_tot/(scores.length+0.0)+", "
				          +sci_tot/(scores.length+0.0));

	}

}
