package basic;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ForExam {

	public static void main(String[] args) {
		/*main() 의 파라미터인 String[] 에 값을 주고 시작해 봅니다.*/
		/*
		for(int i =0; i<args.length; i++) {
			
			String str = args[i];
			
			System.out.println(args[i]);
		}
		
		
		
		//향상된 for.. jdk 1.5부터 지원됨.. 특정 그룹데이터의 전체를 다 루프할때 요긴함
		//자바스크립트의 for in 과 거의 유사함..
		//str은 string 인 변수를 받아낸거임 6,7번줄
		for(String str : args)
			System.out.println(str); //8번줄이랑 똑같은건데 17번줄이 향상됨
		
		
		
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println((int)ch);
		}
		
		//위와 똑같이 나오게 int 를 이용해서 해보기.
		for (int i = 65; i <=90; i++) {
			System.out.println((char)i);
		}
		
		
		
		//구구단 전체 돌기.
		//자바에서만 존재 하는 Label loop
		//loop 에 이름 (Lavel:다른 이름도 상관없음)을 주고 호출하여 제어하는 방법
		
		outer:for(int i = 2; i<=9; i++) {
			//if(i%2 == 0) //짝수단은 건너뛰기..
				//continue;
			System.out.println(i+"단 시작");
			inner:for(int j = 1; j <= 9; j++) {
				if(i%2 == 0)
					break outer;
				
				int sum = i*j;
				System.out.println(i + "*" + "j" + "=" +sum);
			}
				System.out.println(i + "단 끝");
		}
		
		
		//중첩 for 에서 초기화 변수를 재활용 할때 발생하는 로직을 작성해봅니다.
		for (char a = 'A'; a <= 'Z'; a++) {
			for(char b = a; b<='Z'; b++) {
				System.out.println(b);
			}
			System.out.println();
		}
		
		*/
		//FindNum.java
		/*
		 * 두수를 입력을 받으세요(값의 크기는 상관없음..100, 4, 4, 100)
		 * 두수의 차이 (100, 4를 받았을 경우, 96입니다.)
		 * 이 차이의 누적합을 구해서 출력하세요.
		 * */
		
		
			int fir = Integer.parseInt(JOptionPane.showInputDialog("첫번째 수 입력 : "));
			int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째 수 입력 : "));
			int temp;
			
			if(fir >= sec) {
				temp = fir;
				fir = sec;
				sec = temp;
			} 
			
			int sum = 0; //sum을 초기화 했기때문에 sum+=i 가 그수만큼 합쳐진거임;
			
			for (int i = fir; i <= sec; i++) {
					sum += i;	
							}
			System.out.println(fir + "와" + sec + "의 합은" + sum + "입니다.");
		
		
	
		
		
		
		
//		int[] intArr = {12,30,50,107,505}; //자바배열
//		
//		Arrays.sort(intArr);
//		
//		
//		for (int i= 0; i<intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
	}

}
