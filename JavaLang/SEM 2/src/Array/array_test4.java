package Array;

public class array_test4 {

	public static void main(String[] args) {
			//성적을 저장하는 이타원 배열 선어 및 생성
			int[][]scores = { {92,80,76,72},
					          {75,72,84,96},
					          {88,80,92,96},
					          {56,55,76,68},
					          {80,96,88,84} 
					          };
			
			//학생들을 저장하는 일차원 배열 선어 및 생성
			String [] names= {"이퇴계","홍갈동","이순신","강감찬","안중근"};
			
			//총점을 저장하는 일차원 배열 선어 및 생성
			int [] tots = new int[5];
			
			
			int kor_tot=0, eng_tot=0,mat_tot=0,sci_tot=0;
			
			for (int row=0; row<scores.length; row++) {
				for(int col=0; col<scores.length; col++) {
					switch(col) {
					case 0: kor_tot += scores[row][col]; break;
					case 1: eng_tot += scores[row][col]; break;
					case 2: mat_tot += scores[row][col]; break;
					case 3: sci_tot += scores[row][col]; break;
					}
			}
		}
		System.out.println(kor_tot/(scores.length+0.0)+", "+eng_tot/(scores.length+0.0)+", "+mat_tot/(scores.length+0.0)+", "+sci_tot/(scores.length+0.0));
	}
}
