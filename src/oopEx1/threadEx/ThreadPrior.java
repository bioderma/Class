package oopEx1.threadEx;

import java.util.Iterator;

class Pthread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			for (int x = 0; x < 100000; x++);
		}
	}
}

class Pthread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			for (int x = 0; x < 100000; x++) ;
		}
	}
}




public class ThreadPrior {

	public static void main(String[] args) {
		Pthread1 th1 = new Pthread1();
		Pthread2 th2 = new Pthread2();
		
		//우선 순위를 다르게 줘봅니다.
		th2.setPriority(8);
		th1.setPriority(3);
		
		
		//th1, 2 모두 스레드 자식 클래스 이므로, 아래의 메서드를 이용해서
		//이름과 우선순위 값을 출력해 봅니다.
		System.out.println(th1.getName()+ " 스레드의 우선순위" + th1.getPriority());
		System.out.println(th2.getName()+ " 스레드의 우선순위" + th2.getPriority());

		th1.start();
		th2.start();
		
	}

}
