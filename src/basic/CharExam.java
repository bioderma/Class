package basic;

public class CharExam {

	public static void main(String[] args) {
		char c = 'a'; //싱글쿼트로 문자 하나를 표현하면 됩니다.
		
		System.out.println(++c + 1); 
		//c는 char 지만 산술연산자 와 1이 만나서 1은 int가 됌 원래는 1이 리터럴
		
		
		//char 의 기본값은 \u0000
		char c2 = '\u0000';
		System.out.println(c2);
		c2 = '노';
		System.out.println((int)c2);
		
		c2 = 45432;
		System.out.println(c2);
		
		short s = (short)c2;
		
		System.out.println(Integer.toHexString(45432));
		
		//위 16진수 값을 유진코드로 변수 myLastName 에 담아보세요
		
		 
		char myLastName = '\ub178'; //유진코드로 변환
		System.out.println(myLastName); 
		
		//자바의 escape 문자열
		//escape   란 출력시 특정 기호를 사용하여 탭, 라인변경, 줄바꿈 등을 할 수 있는 문자입니다.
		//사용법은 반드시 문자열 내에 \(escape 문자)를 사용해야 합니다.
		//n(라인변경), t(탭), /n/r(엔터), //(역슬래시), ' 싱글쿼트
		System.out.print("1\n\r\'" + "A" + "\'\\");  //엔터와, 탭 동시에 쓸수있음
		System.out.print("2");
		
		
		//문자와 문자도 비교가능 정수로 바꾸기때문에
		if('a' > 'b') { 
			System.out.println("a가 b보다 큽니다.");
		}
		
		
	}	

}
