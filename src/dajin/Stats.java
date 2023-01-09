package dajin;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Stats {

	ShowStats stats;
	
	private void login() {

	}

	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fos = new FileOutputStream("stat.txt");
			
			//버퍼의 크기를 5로 지정한 스트림 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//파일에 데이터 쓰기
			
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
			
			//fos.close();
			bos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
	}

}
