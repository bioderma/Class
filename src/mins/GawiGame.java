package mins;

import java.util.Scanner;

public class GawiGame {
	static Scanner sc = new Scanner(System.in);

	ShowStat stat = new ShowStat();
	String userinput;
	String com;
	int win;
	int loss;
	int tie;
	int total;
	int choice;

	public void StartGame() throws Exception {
		
		com = RandomCom();
		StartGame();
		

		do {
			System.out.print("\n1가위,2바위,3보 중 입력 후 Enter : ");
			userinput = sc.next();
		} while (!userinput.equals("1") && !userinput.equals("2") && !userinput.equals("3"));
		if (this.userinput.equals("1")) {
			

		} else if (this.userinput.equals("2")) {
			this.userinput = "바위";

		} else if (this.userinput.equals("3")) {
			this.userinput = "보";

		} else {
			System.out.println("잘못된 값입니다. 재입력 바랍니다.");
			
			System.out.println("당신:" + userinput + " 컴:" + com);
			System.out.println(" --" + whoWin() + "\n");
			
			
			
		}
		
		stat.gametotal();
		whoWin();
		
		
	}

	public String RandomCom() {
		switch ((int) (Math.random() * 2)) {
		case 0:
			return "가위";
		case 1:
			return "바위";
		case 2:
			return "보";
		default:
			return "";

		}

	}

	public String whoWin() {
		
	

		if (userinput.equals(RandomCom())) {
			stat.gametie();
//			stat.total++;
			return "비겼습니다!";
		} else if ((userinput.equals("가위") && com.equals("보")) || (userinput.equals("바위") && com.equals("가위")) ||
				(userinput.equals("보") && com.equals("바위"))) {
			stat.gamewin();
//			stat.total++;
			return "이겼습니다!";
		} else {
			stat.gameloss();
//			stat.gametotal();
			return "졌습니다!";

		}
	}


	public void PrintPoint() {
		System.out.println("승:" + win + " 무:" + tie + " 패:" + loss + "\n");
	}

}
