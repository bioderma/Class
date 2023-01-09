package oopEx1.threadEx;

public class DemonThreadEx implements Runnable {
   // run() 이 구현할 저장내용을 5초마다 확인할 flag 선언..
   static boolean autoSave = false;

   public static void main(String[] args) {
      Thread t = new Thread(new DemonThreadEx());

      t.setDaemon(true);
      t.start();

      for (int i = 0; i <= 20; i++) {
         try {
            Thread.sleep(2000);
         } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
         
         
         }
         System.out.println(i);
         if(i % 5 == 0)
         autoSave = true;
      }
      System.out.println("메인 종료됨.(부모쓰레드 종료)");
   }
   
   @Override
   public void run() {
      while(true) {
         try {
            Thread.sleep(2*1000);
         }catch (InterruptedException e) {

            e.printStackTrace();
         }if(autoSave == true)
         autoSave();

      }
      
   }
   private void autoSave() {
      System.out.println("작업내용 자동저장완료");
      
   }

}
