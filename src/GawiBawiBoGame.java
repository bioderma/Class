import javax.swing.JOptionPane;

/*
		 * 가위바위보게임을 만드세요.
		 * 조건은 아래와 같습니다.
		 * 
		 * 1.프로그램 시작하면 게임 하실래요 (y/n)? 라고 묻고 y 입력시 게임 시작됩니다.
		 * 2.시작되면 사용자에게 값을 입력토록 하세요.(가위,바위,보 중 하나)
		 * 	2-1. 만약 위 값이 아닌 다른값이 들어오면 "틀린 값입니다." 출력 후 프로그램 종료.
		 * 3.만약 올바른 값이 입력되면, Math.random()을 이용해서 1~3까지 생성하세요.
		 * 4.생성된 값을 이용해서 사용자와 컴퓨터간의 게임을 진행후 아래처럼 출력시키세요.
		 * 5. 축 당신 승(컴: 보, 당신 : 가위 ) or ㅠㅠ 컴 승 (컴 : 주먹, 당신 : 가위)
		 * 6.위  메세지가 출력된 후 프로그램을 종료 하세요. 
		 * 
		 * */


public class GawiBawiBoGame {

	public static void main(String[] args) {
		
		
		int res = JOptionPane.showConfirmDialog(null, "yes/no?");
		System.out.println(res);
		
		String choice = JOptionPane.showInputDialog("가위, 바위, 보 중 하나 입력하세요.");
		
		switch (key) {
		case value:
			
			break;

		default:
			break;
		}
		
		
	}

}
