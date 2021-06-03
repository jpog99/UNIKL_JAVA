package day07_io;

import java.io.*;

public class DataIOEx02 {

	public static void main(String[] args) {
		//kor/data 폴더에 있는 test.dat파일에서
		//기본데이터형 그대로 입력하는 입력객체와 메서드를 정의하시오.
		File f = new File ("kor\\data\\test.dat");
		try (
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);
		) {
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			
		}catch (IOException e) {}
		System.out.println("실행 완료");
	}

}
