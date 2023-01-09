package ioex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class MakeMyData {

	public static void main(String[] args) throws IOException {
		
		String fileName = "sun-95.txt";
		File file = null;
		FileOutputStream fos = null;
		 
		try {
			
			
			file = new File(fileName);
			fos = new FileOutputStream(file);
			
			
			writer.write("win");
			writer.write("loss");
			writer.write("mins");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
