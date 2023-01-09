package utilex;

import java.util.ArrayList;
import java.util.Iterator;

public class IterExam {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.add("6");
		
		
		/*
		 * 밑에 와일 구문과 같음
		collection<String> cl = myList;
		Iterable<String> ib = cl;
		Iterable<String> ir = ib.iterator();
		*/
		
		Iterator<String> ir = myList.iterator();
		
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
