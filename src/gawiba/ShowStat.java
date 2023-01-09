package gawiba;

import javax.swing.JOptionPane;

public class ShowStat {
	
	
	
	private static int win =0;
	private static int lose = 0;
	private static int tie = 0;
	private static int count = 0;

	
	
	public static void gameWin() {
		win++;
	}
	public static void gameLose() {
		lose++;
	}
	public static void gameTie() {
		tie++;
	}
	public static void gameCount() {
		count++;
	}

	
	public String showStatMethod(){
		return "전적 : " + count + "이긴 수 : " + win + "진 수 :" + lose + "비긴 수 :" + tie + "입니다";
	}

}
