package oopEx2.packageEx.sub1;

import oopEx2.Terran;
import oopEx2.packageEx.First; //컨트롤+쉬프트+o

public class Second extends First{ //생성받음 
	
	public Second() {
		super("노재현"); 
	}
	
	public static void main(String[] args) {
		//다른 패키지에 있는 First 의 생성자를 호출해 봅니다.
		//곧 생성자를 호출한다는건 인스턴스를 만든다는거임
	//	First f1 = new First(); //컨트롤마우스
		//First f2 = new First("박선영"); //접근제어자때문에 보이지않다.
	}
}
