package day07_io;

import java.io.*;

public class FileEx02 {

	public static void main(String[] args) {
		//File클래스 -> File 객체 : 디렉터리(parent), 파일
		//java.io.File클래스를 API에서 참고하여 kor 디렉터리를
		//현재 프로젝터 폴더에 만드시오.
		File f01 = new File ("kor\\data");
		f01.mkdirs();
		
		System.out.println("실행 완료");

	}

}
