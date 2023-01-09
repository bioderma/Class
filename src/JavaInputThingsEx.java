import java.io.IOException;

public class JavaInputThingsEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		System.out.println("수나 문자 하나를 입력해보세요.");
		//아래는 콘솔을 이용해서 사용자가 입력한 값 "하나" 를 프로그램내부로 return 시키는
		//메서드입니다.
		char input = (char)System.in.read();
		System.out.println("입력한 값은" + input);
		
		//엔터를 처리하기 위한 코드입니다.
		System.in.read();
		System.in.read();
		
		
		//숫자를 입력 받을겁니다.
		int digit = System.in.read() - 48;
		System.out.println("입력한 수" + digit);*/
		
		
		System.out.println("첫수를 입력해보세요");
		
		int fir = (int)System.in.read()-48;
		System.in.read();
		System.in.read();
		
		System.out.println("+를 입력하세요");
		char yon = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.println("두번째수를 입력하세요");
		int sec = (int)System.in.read()-48;
		System.in.read();
		System.in.read();
		
		
		int res = fir + sec;
	
		System.out.println("" +fir + yon + sec + "=" + res);
		System.in.read();
		System.in.read();
		
		
	}

}
