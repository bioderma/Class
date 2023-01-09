package basic;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Stu_Score1 {


	
	public static void main(String[] args) throws IOException  {
		//다음과 같은 프로그램을 만들어 보세요.
				/*
				 * 클래스 명은 Stu_Score1
				 * 1.프로그램이 시작하면 사람의 이름을 입력 받도록 띄우세요(콘솔 or GUI)
				 * 2.입력이 된후에 국어점수 입력 하세요 라는 메세지를 띄우고 값을 입력 받으세요.
				 * 3.다음엔 영어 점수 입력 하세요 후 2번과 동일
				 * 4.다음엔 수학 점수 입력 하세요 후 2번과 동일
				 * 5.출력 결과는 아래와 같이
				 * 박선영님 !!! 당신의 성적은 다음과 같습니다.
				 * 총점 : ~점
				 * 평균 : ~점
				 * */
		
		String name = JOptionPane.showInputDialog("이름을 적어주세요.");
		System.out.println(name);
		
	
		String guk = JOptionPane.showInputDialog("국어점수를 적어주세요.");
		int a_guk = (int)Double.parseDouble(guk);
		System.out.println(a_guk);
		
		String eng = JOptionPane.showInputDialog("수학점수를 적어주세요.");
		int a_eng = (int)Double.parseDouble(eng);
		System.out.println(a_eng);
		
		String su = JOptionPane.showInputDialog("영어점수를 적어주세요.");
		int a_su = (int)Double.parseDouble(su);
		System.out.println(a_su);
		
		int sum = (int)(a_guk + a_su + a_eng);
		int age = (int)(sum / 3) ;
		
		System.out.println(name + "님!!! 당신의 성적은 다음과 같습니다."  +
							"\n 총점 :" + sum + 
							"\n 평균 :"+ age
							 );
		
		

	}

}
