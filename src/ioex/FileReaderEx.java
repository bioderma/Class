package ioex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class FileReaderEx {
	
	public static void main(String[] args) {
		
		
		//E:\full_Stack_Work\myjava\src\basic\ArrayExam.java
		
		//PrintWirter 이용해서 파일을 복사해서 ArrayExam.java.back 이라는 파일 생성하세요.
		
		File file = new File("E:\\full_Stack_Work\\myjava\\src\\basic\\ArrayExam.java");
		
		FileReader fr = null;
		BufferedReader br = null;
		LineNumberReader lr = null;
		PrintWriter ss = null;
		String msg = null;
		
		int readData;
		
		try {
			
			String dd = "ArrayExam.java.back";
			
			
			fr = new  FileReader(file);
			br = new BufferedReader(fr);
			lr = new LineNumberReader(br);
			
			
			
			
			String msg2; // = null;
			
			
			while ((msg2 = lr.readLine()) != null) {
				System.out.println(lr.getLineNumber() + " ");
				System.out.println(msg2);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		/*
		try {
			fr = new FileReader(file);
			
			while((readData = fr.read()) != -1) {
				System.out.print((char)readData);
				
			}
			
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
	}
}
