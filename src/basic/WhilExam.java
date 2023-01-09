package basic;
import javax.swing.JOptionPane;

public class WhilExam {

   public static void main(String[] args) {
      
      boolean flag = false;//a값은 지역변수로 들어갓음
      int a = 1;
      Outer:while(a <= 5) {
         a++;
         System.out.println("현재 위 변수가 false라 이건 실행안됨");
         inner:while(true) {
            int y =JOptionPane.showConfirmDialog(null, "계속 돌릴래?");
            	if(y ==1 || y==2){
            		System.out.println("Label을 이용해서 while 을 끝냅니다.");
            		break Outer;
            }
         }
      }
      System.out.println("현재 a의값은 "+ a);
   }

}