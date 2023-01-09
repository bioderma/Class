package basic;
import java.util.Scanner;

import javax.swing.JOptionPane;

import gawiba.GawibawiboV2;
import jdk.javadoc.internal.tool.Start;

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


public class GawiBawiBoGame2 {
	
	static int gamestart;

	public static void main(String[] args) {
		
		//랜덤사용
		
		Scanner s = new Scanner(System.in); // 스캐너 사용
		
		
		gamestart =JOptionPane.showConfirmDialog(null, "게임 시작 하실래요?");
		
		String enter = JOptionPane.showInputDialog("가위, 바위, 보 중 입력하세요");
		int num = (int)(Math.random()*3);
		
		switch(enter) {
		case "가위" :
			if(num==0) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("You : "+ enter);
				System.out.println("비겼습니다!");
			}else if(num==1) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("You: "+ enter);
				System.out.println("You Lose!");
			}else if(num==2) {
				System.out.println("컴퓨터 : 보");
				System.out.println("You : "+ enter);
				System.out.println("오늘은 치킨이닭");
			}
			break;
		case "바위" :
			if(num==0) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("You : "+ enter);
				System.out.println("오늘은 치킨이닭");
			} else if(num==1) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("You : "+ enter);
				System.out.println("비겼습니다!");
			}else if(num==2) {
				System.out.println("컴퓨터 : 보");
				System.out.println("You : "+ enter);
				System.out.println("You Lose!");
			}
			break;
		case "보":
			if(num==0) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("You : "+ enter);
				System.out.println("오늘은 치킨이닭");
			} else if(num==1) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("You : "+ enter);
				System.out.println("You Lose!");
			}else if(num==2) {
				System.out.println("컴퓨터 : 보");
				System.out.println("You : "+ enter);
				System.out.println("비겼습니다!");
			}
				
			break;
		default : 
			System.out.println("틀린값입니다.");
}
	}
}
	
	
	
	
