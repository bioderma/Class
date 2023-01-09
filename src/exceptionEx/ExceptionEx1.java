package langEx.exceptionEx;

import javax.swing.JOptionPane;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

/*
 * 예외를 일부러 발생시켜서, 예외 객체자 JVM 에서 던져지는걸(throw) 확인하고
 * 예외 타입을 알아봅니다, 또한 콜 스택에서 예외가 어떻게 전파 되어지는지도 확인합니다.
 * 
 * 예외의 최고 대빵 클래스는 Exception이고 이 클래스는 부모(Throable) 로부터
 * 모든걸 상속받고 있습니다. 해서 최고 클래스를 Exception 으로 생각하시면 됩니다.
 * 
 * 또 Exception 하위에는 각 예외내용별로 클래스가 정의 되어잇는데, 이중 RuntimeException
 * 을 기준으로 구분해야 합니다. 이 말은 RuntimeException 은 실행 예외를 정의한 클래스로
 * 하위에 있는 모든 예외는 실행이 되어야만 발생할 수 있는 예외 입니다.
 * 즉 컴파일러가 알수 없다는 말입니다. 그래서 위 예외의 하위 타입들은 컴파일시에 여러분이
 * 예외 핸들링을 하지 않아도 컴파일러가 관여하지 않습니다. 하지만 위 예외와 같은 계층이거나
 * 상위에 있는 예외들은 알려진 예외로 컴파일러가 관여를 하기에 여러분이 이런 API 를 사용할떄는
 * 예외를 핸들링 (try~catch), 전파선언 (throws), 중 하나를 하지 않으면 컴파일 에러가 발생합니다.
 * throw 는 던짐 
 * throws 는 전가 
 * 
 * 
 * */

//예외는 객체임
// ArithmaticExceprion 객체
//트라이안에 있는 구절을 던지면 catch 로 넘어감
// ArithmaticExceprion 로 받겠다는 타입을 써주고 변수를 써야함
//예외는 catch 문 안에서 끝나기 때문에 밑으로 안내려가서 예외가 더이상 발생하지않음


public class ExceptionEx1 {

	static void c() {
		String input = JOptionPane.showInputDialog("나눌 숫자값입력");
		
		int d = 3;
		
		try { //예외 핸들링
		System.out.println(3/Integer.parseInt(input));
		System.out.println("여긴 try 구문의 예외 발생후에 코드입니다.");
		}catch(ArithmeticException ae) { //ae 는 변수임
			System.out.println("계산사의 예외 발생함..");
			System.out.println("원인 :" + ae.getMessage());
			//어떠한 예외가 발생했는지 알려주는 메소드 getMessage()
			
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("여긴 예외절 이후의 c() 의 나머지 구문.");
	}
	
	static void b() {
		c();
	}
	
	public static void main(String[] args) {
		b();
		

	}

}
