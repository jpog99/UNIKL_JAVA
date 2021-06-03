package day07_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteIOEx3 {

	public static void main(String[] args) {
		System.out.println("데이터를 입력하시오.");
		// 키보드를 통해서 byte 단위로 데이터를 입력받되 입력된 값이
		// 없을 때까지 데이터 입력을 받는 입력객체를 정의하시오.
		//반복문을 이용하서 정의하시오.
		
		//모니터로 byte 단위로 데이터를 출력할 수 있는
		// 출력객체를 정의하시오.
		
		try (InputStream  is = System.in;
			 OutputStream os = System.out){
			
			byte [] data = new byte [1024];
			is.read(data);
			os.write(data);
			
			System.out.println("\n실행완료");
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
