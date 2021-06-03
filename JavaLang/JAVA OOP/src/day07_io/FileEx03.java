package day07_io;

import java.io.*;

public class FileEx03 {

	public static void main(String[] args) {
		//File클래스 -> File 객체 : 디렉터리(parent), 파일
		//java.io.File클래스를 API에서 참고하여 현재 프로젝터 폴더의
		//kor 폴더 내에 test02.txt 파일을 만드시오.
		//File f02 = new File ("kor","test02.txt");
		File f02 = new File ("kor\\test03.txt");
		try {
			
			f02.createNewFile();
			
		}catch(IOException e) {}
		
		System.out.println("실행 완료");

	}

}
