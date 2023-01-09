package gawiba;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GawiGame {
	
	static Scanner sc = new Scanner(System.in);
	static ShowStat showstat = new ShowStat(); 
	
	JOptionPane thePane;
	String userinput;
	String com;
	int playCount;
	int win;
	int loss;
	String[] theMessage;
	boolean isCorrect;

	public GawiGame() {
		
		showMenu();
	}

	private void showMenu() {
		while(!isCorrect) {
			userinput = thePane.showInputDialog(theMessage[0]);
			playGame();
			isCorrect = true;
		}

	}

	static void playGame() {
		
		int newgame = 0;
		int num = (int)(Math.random()*3);
		
		String enter = JOptionPane.showInputDialog("가위, 바위, 보 중 입력하세요");
		
		
		switch(enter) {
		case "가위" :
			if(num==0) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("You : "+ enter);
				System.out.println("비겼습니다!");
				ShowStat.gameTie();ShowStat.gameCount();
			}else if(num==1) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("You: "+ enter);
				System.out.println("You Lose!");
				ShowStat.gameLose();ShowStat.gameCount();
			}else if(num==2) {
				System.out.println("컴퓨터 : 보");
				System.out.println("You : "+ enter);
				System.out.println("오늘은 치킨이닭");
				ShowStat.gameWin();ShowStat.gameCount();
			}
			break;
		case "바위" :
			if(num==0) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("You : "+ enter);
				System.out.println("오늘은 치킨이닭");
				ShowStat.gameWin();ShowStat.gameCount();
			} else if(num==1) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("You : "+ enter);
				System.out.println("비겼습니다!");
				ShowStat.gameTie();ShowStat.gameCount();
			}else if(num==2) {
				System.out.println("컴퓨터 : 보");
				System.out.println("You : "+ enter);
				System.out.println("You Lose!");
				ShowStat.gameLose(); ShowStat.gameCount();
			}
			break;
		case "보":
			if(num==0) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("You : "+ enter);
				System.out.println("오늘은 치킨이닭");
				ShowStat.gameWin();ShowStat.gameCount();
			} else if(num==1) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("You : "+ enter);
				System.out.println("You Lose!");
				ShowStat.gameLose();ShowStat.gameCount();
			}else if(num==2) {
				System.out.println("컴퓨터 : 보");
				System.out.println("You : "+ enter);
				System.out.println("비겼습니다!");
				ShowStat.gameTie();ShowStat.gameCount();
			}
				
			break;
		default : 
			System.out.println("틀린값입니다.");
			
			
			
		}//---스위치구문
		System.out.println("1.뉴게임 2.전적보기 3.게임종료");
		
		newgame = sc.nextInt();
		
		switch(newgame) {
		
		case 1 :
			
			GawiGame.playGame();
			break;
			
		case 2 : 
			System.out.println(showstat.showStatMethod());
		break;
		
		case 3 :
			System.exit(0);
		break;
		
	}
		
	}

}