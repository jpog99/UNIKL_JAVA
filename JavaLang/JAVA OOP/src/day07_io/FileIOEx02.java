package day07_io;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileIOEx02 {

	public static void main(String[] args) {
		// kor 폴더 내에 있는 test2.txt 파일에 있는 내용을
		//입력받아서 화면에 출력하시오.
		
		try(
		FileReader fr = new FileReader("kor\\test2.txt");
		BufferedReader br = BufferedReader(fr);
		){
			System.out.println(br.readLine());
			
		}catch (Exception e) {}
		
		System.out.println("실행 완료");

	}

}
