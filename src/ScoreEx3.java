//import java.util.Iterator;

import javax.swing.JOptionPane;

/*
 * 배열을 이용해서 3명의 성적관리 프로그램을 만듭니다.
 * 전체적인 조건은 다 같게하고, 한명당 모든 성적입력이 올바르지 않을 경우엔
 * 다음사람의 성적이 입력되면 안됩니다.
 * 
 * 출력시 첫번째 사람은 철수, 다음은 영희, 다음은 순애로 지정하여
 * 예시처럼 출력 시킵니다. 철수님의 총점 : ? 평균 : ?
 * 단 이름값은 입력받지 아니합니다.
 * 
 * */


	public class ScoreEx3 {
	public static void main(String[] args) {
		
		
		int[][] scores = new int [3][4]; //성적담는 배열
		float [] avgs = new float [scores.length]; //평균담는 배열
		String stu_name[] = {"철수","영희","순애"};
		String sub_name[] = {"국어","영어","수학"};
		
		//사용자의 점수를 입력 받아서, 해당 점수를 검증하고, 문제가 있다면
		//다시 점수입력 하도록 하고 싶습니다.
		//만약 한사용자의 점수가 모두 입력이 되었다면, 해당 점수에 대해
		//총점, 평균도 한번에 처리 되도록 할 예정입니다.
		
		for (int i = 0; i < scores.length; i++) {
			//이 영역은 어떤 처리를 해야 하는 영역 일까요??
			for (int j = 0; j < scores[i].length-1; j++) { //3과목이 들어가야해서 -1처리가됌
				//철수의 국어,영어,수학 점수를 입력 받고, 검증도 할겁니다.
				do {
				
				scores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(sub_name[j] + "점수입력"));
				
				}while(scores[i][j] < 0 || scores[i][j] >100);
				//i 인 학생의 총점을 여기서 넣어줍니다.
				scores[i][scores.length] += scores[i][j];
 			}//inner for 끝났다는 의미는?? 한사람의 총점까지가 완료됐다는 뜻
			
			avgs[i] = (float)(scores[i][scores.length] / 3.0); //평균값
			
		}// 이 루프가 다 끝났다는 의미는 모든 학생의 점수 및 총점, 평균까지 완료되었단 뜻
		
		
		
		
		//출력 부분
		for (int i = 0; i < scores.length; i++) {
			System.out.println();
			System.out.println(stu_name[i] + "님의 성적: 총점:"+ "" +scores[i][scores.length] + ",평균 : " + avgs[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
