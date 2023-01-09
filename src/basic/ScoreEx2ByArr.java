package basic;
import java.util.Iterator;

import javax.swing.JOptionPane;

/*
 * 오전에 작성한 Score.java 를 배열을 이용해서 구현하는 겁니다.
 * 국영수 세점수를 받는건 같고, 다른 점수시 해당 과목에 대한 입력이 반복 출력되야 합니다.
 * 모두 정상적이면, 출력결과는 아까와 같게 하시면 됩니다.
 * 
 * */

public class ScoreEx2ByArr {

	public static void main(String[] args) {
		int score[] = new int[4] ; //이 배열에는 각 과목의 점수와 총점도 int라
		//총점 까지 넣도록 배열을 생성 했습니다.
		
		float avg = 0;
		
		//아래 배열은 메세지 출력시 과목명을 출력토록 한겁니다.
		String theMsg[] = {"국어","영어","수학"};
	
		do {
			score[0] = Integer.parseInt(JOptionPane.showInputDialog("국어점수를 입력하세요."));
		} while (score[0]<0 || score[0]>100);
			
		do {
			score[1] = Integer.parseInt(JOptionPane.showInputDialog("영어점수를 입력하세요."));		
		} while (score[1]<0 || score[1]>100);
		
		do {
			score[2] = Integer.parseInt(JOptionPane.showInputDialog("수학점수를 입력하세요."));		
		} while (score[2]<0 || score[2]>100);
		
		
	
		score[3] = score[0]+score[1]+score[2];
		
		avg = score[3]/3.0f;
		
		
		JOptionPane.showMessageDialog(null, "총점은 : " + score[3]+"평균은 : " + avg);
		
		
		
		
		
		
		
		
		
		//위 두개의 배열을 구현해보세요. //총점과 평균을 출력해보세요.
	}

}
