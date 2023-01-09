import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class SwitchExam {
	/*
	 * 자바에서는 switch~case 구문의 조건값으로는 int 이하만 됩니다.
	 * 반드시 기억하세요
	 * */
	
	/*
	 * 두수와 연산자를 입력해서 결과를 출력하도록 switch 문을 이용해서 구현하세요.
	 * 첫수 1 연산자* 두번째수 2 --> 결과 : 1*2 = 3
	 * 
	 * 출력문은 반드시 한번만 정의 하세요..
	 * 
	 * */
	
	
	public static void main(String[] args) {
	
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫수입력"));
		char yon = JOptionPane.showInputDialog("연산자입력").charAt(0);
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째수입력"));
		
		String msg =""; //사용자가 오바르지 않은 연산자를 입력시 처리할 메세지 변수, 초기화해준거임
		double result = 0;//결과값 선언 , 초기화 =0 해준거임
		
		

		switch (yon) {
		case '*':
			result = fir * sec;
			break;
		case '+':
			result = fir + sec;
			break;
		case '-':
			result = fir - sec;
			break;
		case '/':
			result = fir / sec;
			break;
		default:
			msg = "장난하지마라";
			break;
		}
		
		if(!msg.equals("")) {
			JOptionPane.showMessageDialog(null, msg);
			
			return; //if 는 main 안에 있기 때문에 결과값은 메인결과값도 같이 나와서 return 시킴
			
			// System.exit(0); 혹은 자바 프로그램을 명시적으로 완전종료 하는 API
		}
		
		
	
		System.out.println("결과 : "+fir + yon + sec + "=" + result );
	
	
	

	}
}
