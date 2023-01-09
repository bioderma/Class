package langEx.exceptionEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class ExceptionEx2  {
	
	static void c(){
		FileInputStream fis = null; //초기화시키기 
		File f = null;
		f= new File("test.txt");
		
		try {
			fis = new FileInputStream(f);
			int data;
			
			while((data = fis.read()) != -1) {
				//FileInputStream 메소드 중에 read메소드를 찾아서
				System.out.print((char)data);
			}
			
		}catch(Exception io){
			//멀티캐치는 작은타입을 위부터 시작한다 같은 캐치를 쓰면안됌
			System.out.println("파일을 찾을수 없음.." + io.getMessage());
			io.printStackTrace(); //예외가 발생햇을때 어디 콜스택에서 예외가 떳는지 알려줌
			
			
		}finally {
			//이 블락은 예외 발생 여부와 상관없이 무조건 수행되는 블락입니다.
		
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	
	}
	static void b(){
		c();
	}
	
	static void a(){
		b();
	}
	
	public static void main(String[] args){
		// 생성한 파일에 접근, 파일의 내용을 읽어오는 API 사용함
		
		a();
		
	}

}
