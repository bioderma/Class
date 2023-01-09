package ioex;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputEx {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		BufferedOutputStream bos = null;

		try {
			
			
			fos = new FileOutputStream("sample.dat");
			
			//dos 는 생성자 파라미터로 outputstream 을 받는다
			dos = new DataOutputStream(fos);
			
			//bos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("sample.dat")));
			
			
			
			//아래에서 사용되는 메서드는 자바 데이터를 그대로 쓰기 때문에
			//쓰여진 (생성된) 파일의 크기를 확인 해보면 이해할 수 있다.
			
			dos.writeInt(0);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			dos.writeUTF("Hello");
			
			
			
			dos.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
