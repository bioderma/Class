package ioex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * Data InputStream 을 이용해서 Data 를 읽을때 주의할점 !
 * 
 * 1. 반드시 쓰인 순서 그대로 읽어야함 
 * 즉, int, double, float 으로 썼으면, 읽을때도 같은순으로 읽는다
 * 
 * 2.read...(); 을 루프등을 이용해서 사용할때, 데이터의 끝은 -1 이 아니라 
 * E0FException 을 발생시켜 끝을 나타낸다. 따라서 예외를 사용하여 적절희 읽는 일의 끝을 처리해야한다.
 * 
 * */

public class DataInputEx {

	public static void main(String[] args) {
		
		/*
		
		
			
			DataInputStream dis = new DataInputStream(new FileInputStream(new File("sample.dat")));
					
					
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
					
			dis.close();
		*/
		
			try {
				
				int[] score = {100,85,63,95,86,58};
				
				DataOutputStream dos = new DataOutputStream
						(new FileOutputStream(new File("sample.dat")));
				
				for (int i = 0; i < score.length; i++) {
					dos.writeInt(score[i]);
				}
				dos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		}
		
		
		
	}
