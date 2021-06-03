package day07_io;

import java.io.*;

public class FileEx04 {

	public static void main(String[] args) {
		//File클래스 -> File 객체 : 디렉터리(parent), 파일
		//java.io.File클래스를 API에서 참고하여 현재 프로젝터 폴더의
		//kor 폴더 내에 있는 모든 파일들의 이름만을 출력하시오.
		//File f02 = new File ("kor","test02.txt");
		
		File f = new File("kor");
		//list, listFiles 메소드
		File [] files = f.listFiles();
		//배열의 원소값을 하나씩 출력하고자 할 때 확장for문을 사용할
		//수 있다.
		for(File file : files) {
			if(file.isDirectory())
				System.out.println(file.getName());
		}
		
		System.out.println("실행 완료");

	}

}
