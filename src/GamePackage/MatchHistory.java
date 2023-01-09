package GamePackage;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class MatchHistory{
	
	int count = 0;
	int win = 0;
	int lose = 0;
	int draw = 0;
	
	public void countPlay() {	// 한 판이 끝나면 게임횟수 count를 추가해주는 메서드
		this.count++;
	}
	
	public void win() {		// 승리시 승리 횟수 추가해주는 메서드
		this.win++;
	}
	
	public void lose() {		// 패배시 패배 횟수 추가해주는 메서드
		this.lose++;
	}
	
	public void draw() {		// 무승부시 무승부 횟수 추가해주는 메서드
		this.draw++;
	}
	
	public void showHistory(){		// GameMain에서 전적보기(2) 입력시 호출되어 스코어보드 메세지를 보여주는 메서드
		JOptionPane.showMessageDialog(null, /*name +*/ "님의 현재 스코어\n 게임횟수 : " + count + "회\n 내 승리 수 : " + win + "회\n 컴 승리 수 : " + lose + "회\n 무승부 : " + draw + "회");
	}
	
	public void matchWin() {
		
		
	}
	
	
	
	
	
	
	
	
}
