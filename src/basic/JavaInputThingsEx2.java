package basic;
import java.io.IOException;
import java.util.Scanner;




public class JavaInputThingsEx2 {
	
	//스캐너 객체를 클래스 변수로 초기화 함..
	//이렇게 하면 이 클래스 내부에 있는 메서드가 참조(ref) 가능합니다.
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) throws IOException {
		/*
		 * 사용자가 입력한 문자열을 프로그램으로 읽는 API 사용 예 2번째.
		 * */
		//Scanner 객체를 생성합니다.
		//sc.메서드()를 이용해서 사용자 입력값을 프로그램으로 가져옵니다.
		
		
		System.out.println("메세지 입력하세요.");
		//콘솔에 입력한 값을 문자열로 return 시키는 메서드 이용합니다.
		String value1 = sc.nextLine();
		System.out.println(value1);
		
		int fir = sc.nextInt();
		System.out.println(fir + 1);
		
		
		
		//	System.out.println("문자를 입력하세요");
		//	char input = (char)System.in.read();
		//	System.in.read();
		//	System.in.read();
		//	System.out.println("입력한 결과 :" + input);

	}
	
	static void doSome() {
		
		
		
	}
	
}
