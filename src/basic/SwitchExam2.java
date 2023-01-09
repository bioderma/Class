package basic;


import javax.swing.JOptionPane;


public class SwitchExam2 {
	public static void main(String[] args) {
	
	/*
	 * 자바에서는 switch~case 구문의 조건값으로는 int 이하만 됩니다.
	 * 반드시 기억하세요
	 * 
	 * 계산기를 시작하면 아래의 메세지를 띄우세요.
	 * 계산기를 실행 하시겠습니다? 확인을 누르실에만 계산기가 작동합니다. 
	 * (즉 수를 입력받기를 시작합니다. 만약 cancel, no 를 입력하면 좋은 하루 되세요!
	 * 출력후 프로그램 종료)
	 * 계산이 끝난후 사용자에게 더 계산할지 물어봅니다. y or n
	 * 만약 y 가 입려되면, 첫수를 다시 입력받도록 하고, 즉 계산기가 재 실행되게 합니다.
	 * n 입력시 좋은 하루되세요 ! 메세지 출력 후 종료! 
	 * */
	
	
			
			int y = JOptionPane.showConfirmDialog(null, "계산기를 실행 하시겠습니까?");
	while(true) {
			
			if(y ==1 || y==2) {
			
			JOptionPane.showMessageDialog(null, "좋은 하루 되세요!");
			break;}
			
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
}
	
	
	

