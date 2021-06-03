package Array;

public class array_question2 {
	
	public static void main (String[]args) {
		//성적을 저장하는 이타원 배열 선어 및 생성
		int[][]marks = { {92,80,76,72},
				         {75,72,84,96},
				         {88,80,92,96},
				         {56,55,76,68},
				         {80,96,88,84} 
				         };
		
		//학생들을 저장하는 일차원 배열 선어 및 생성
		String [] names= {"이퇴계","홍갈동","이순신","강감찬","안중근"};
		
		//총점을 저장하는 일차원 배열 선어 및 생성
		int [] tots = new int[5];
		
		//평균을 저장하는 일차원 배열 선어 및 생성
		double[] avgs = new double [5];
		
		for (int row=0; row<marks.length; row++) {
			
			
			
			
			for(int col=0; col<marks[row].length; col++)
				
				
				tots[row] += marks[row][col];
			    
				avgs[row] =  tots[row] / (marks[row].length+1);
			
		}
			for(int i=0; i<names.length; i++)
				System.out.println(names[i] + " 총점: "+ tots[i] +", 평균: "+ tots[i]/marks[0].length+0.0);
	}
  }