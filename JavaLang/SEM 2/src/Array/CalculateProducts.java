package Array;

import java.util.Scanner;

public class CalculateProducts {

	public static void main(String[] args) {
		/* 다음과 같은 제품관리표가 있다
		 * 사용자가 프롬프트 창을 통해서 상품을 주문하면
		 * 제품관리표에서 주문한 만큼 상품 수량을 빼주고
		 * 사용자에게 주문한 상품과 수량, 가격을 출력해주고
		 * 변경된 제품관표도 출력하는 프로그램을 작성하시오.
		 * 
		 *  제품평  단가   수량
		 *  CPU     500    50
		 *  SSD     300    30
		 *  RAM     200    20
		 *  
		 *  (출력 예)
		 *  CPU
		 *  주문한 수량을 입력하시오:
		 *  2
		 *  
		 *  주문 내역입니다.
		 *  제품명 : CPU 단가: 500 수량:2 지불총액:1000
		 *  
		 *  제품평  단가   수량
		 *  CPU     500    48
		 *  SSD     300    30
		 *  RAM     200    20
		 */
		
		
		String [] names = {"CPU","SSD","RAM"} ;
		int [] [] nums = {{500,50},{300,30},{200,20}};
		System.out.println("Product\tPrice\tAmount");
		for(int r=0; r<nums.length; r++) {
			System.out.print(names[r]+"\t");
			for(int c=0; c<nums[r].length; c++) {
				System.out.print(+nums[r][c]+"\t");
		}
		System.out.println();
		}
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the name of ordered product");
		String name = input.next();
		System.out.println("Enter the amount to be reduced");
		int num= input.nextInt();
		
		int price=0;
		for(int i=0; i<names.length; i++)
			if(names[i].equals(name)) {
				nums[i][1] -= num;
				price = nums [i][0];
			}
		System.out.println("Order statement");
		
		System.out.println("Product:"+name+" Price:"+price+" Amount:"+num+" Total:"+(price*num));
		
		System.out.println("\nProduct\tPrice\tAmount");
		for(int r=0; r<nums.length; r++) {
			System.out.print(names[r]+"\t");
		
		for(int c=0; c<nums[r].length; c++) {
			System.out.print(+nums[r][c]+"\t");
			}
		System.out.println();
	
		}
	}
}
		
		
		
		
		
		
		