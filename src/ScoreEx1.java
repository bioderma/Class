

import java.util.Iterator;

import javax.swing.JOptionPane;

public class ScoreEx1 {
	public static void main(String[] args) {
		/*
		 * 클래스 명은 ScoreEx1 으로 하시고
		 * 
		 * 학생의 성적을 입력 받아 출력하는 프로그램입니다.
		 * 1.과목은 국,영,수 이고
		 * 2.각 과목의 점수는 0~100 사이여야 합니다.
		 * 3.만약 올바르지 않은 점수가 들어오면, 재입력 받도록 하세요.
		 * 즉 다음 과목의 점수를 입력받는 로직으로 넘어가면 안됩니다.
		 * 4.모든 과목이 올바르게 입력되면 아래처럼 출력합니다.
		 * 5.총점 : 몇점, 평균 : ?.? 학점 : A.B,C or F
		 * 6.학점의 기준은 90 이상은 A, 80~89 까지 B, 70~79까지 C, 나머진 F
		 * 7.참고로 위의 학점을 계산하려면 평점을 구해서 하는게 편할겁니다.
		 * 8. 평점은 평균을 10으로 나눠서 계산하시면됩니다.
		 * 
		 * */
		//int eng = Integer.parseInt(JOptionPane.showInputDialog("영어점수를 입력하세요."));	
		//int math = Integer.parseInt(JOptionPane.showInputDialog("수학점수를 입력하세요."));
		
	
		int kor,eng,math;
		double avg; 
		char grade = 'F';
		
		do {
			kor = Integer.parseInt(JOptionPane.showInputDialog("국어점수를 입력하세요."));
		} while (kor < 0 || kor > 100);
			
		do {
			eng = Integer.parseInt(JOptionPane.showInputDialog("영어점수를 입력하세요."));		
		} while (eng < 0 || eng > 100);
		
		do {
			math = Integer.parseInt(JOptionPane.showInputDialog("수학점수를 입력하세요."));		
		} while (math < 0 || math > 100);
		
		int sum = kor+eng+math;
		avg = sum / 3.0;
		
		switch ((int)(avg/10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		}
		
		
		
		System.out.println("\n총점 :" + sum + "\n평균 :" + avg + "\n학점 :" + grade);
		
		
	

		
			
		}

}
