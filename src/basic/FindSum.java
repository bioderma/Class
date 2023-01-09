package basic;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FindSum {
//두수를 입력을 받으세요  값의크기는 상관없음..
   //두수의 차이
   //이차이의 누적합을 구해서 출력하세요
   public static void main(String[] args) {
       
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("첫수입력"));
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("두번째수입력"));
      
      
      /*   Scanner key = new Scanner(System.in); 
           System.out.print("첫번째 정수 입력 : "); 
           int num1 = key.nextInt(); 
           System.out.print("두번째 정수 입력 : "); 
           int num2 = key.nextInt(); 
           System.out.println(num1-num2);
         */  
           
           if(num1 >= num2) {
           int   temp = num1;// 거꾸로나올경우 대비해서 넣어놈
              num1 = num2;
              num2 = temp;   
          }
           int sum = 0;
      
           for(int i =num1; i<=num2;i++) {
              sum += i;
              
           }
           System.out.println(num1+"에서"+num2+"까지의합은"+sum+"입니다.");
   }

}