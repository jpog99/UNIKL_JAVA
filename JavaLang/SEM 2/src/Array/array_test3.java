package Array;

import java.util.Scanner;

public class array_test3 {

	public static void main(String[] args) {
		
		String[][] members = { {"Kim", "Lee", "Park", "Kang", "Hong"}, {"K123", "L234", "P345", "K456", "H567"} };
		 Scanner input = new Scanner(System.in);
		 System.out.println("아이디를 입력하시오:");
		 String id = input.next();
		 System.out.println("비밀번호를 입력하시오:");
		 String pw = input.next();
		 
		boolean result = false;
		for(int r = 0, c = 0; c<members[r].length;c++) {
			if(id.equals(members[r][c]) && pw.equals(members[r+1][c]))
				result = true;
		}
		if (result) {
			System.out.println("정상적으로 로그인되었습니다");
		}else {
			System.out.println("아이디와 비밀번호가 일치하지 않슴니다");}

	}

}
