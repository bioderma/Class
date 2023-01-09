package oopEx1.threadEx;

import java.util.Iterator;



/*
 * 쓰레드를 생성하는 방법
 * 1.내 자신이 스레드를 상속받는 방법
 * 2.그냥 스래드 객체를 생성해서 run()을 구현하는 방법(익명클래스 정의법)
 * 3.Runnable type 으로 생성해서 Thread(Runnable) 에 탑재하는 방법
 * 
 * 위 3개중 뭐가 됐든 반드시 run() 을 오버라이드 해야 하고, Runnable 상태로 전이 되기
 * 위해선 반드시 start() 를 호출해야한다.
 * 
 * 스레드 마다 이름이 있음
 * 
 * */

class ThreadEx1_1 extends Thread { // 스레드를 상속했기에 이 클래스자체가 스레드다
	// 수행 로직을 run() 을 통해 구현한다.

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("스레드이름 : " + i);
		}

	}

}

class MyThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("이건 Runnable 타입의 스레드 내용입니다.");
		}

	}
}

class ThreadEx1_2 extends Thread { // 스레드를 상속했기에 이 클래스자체가 스레드다
	// 수행 로직을 run() 을 통해 구현한다.

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("스레드이름 : " + getName());
		}

	}

}

public class ThreadEx1 {

	public static void main(String[] args) {

		// 스레드 객체 생성
		ThreadEx1_1 t1 = new ThreadEx1_1();
		ThreadEx1_2 t2 = new ThreadEx1_2();
		
		/*67줄,68줄 한방코드
		 * Thread t3 = new Tread(new MyThread);
		 * */
		MyThread my = new MyThread();
		Thread t3 = new Thread(my);
		
		//익명클래스를 이용한 스레드 생성
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("여긴 main() 에서 수행된 스레드의 내용" + 
							Thread.currentThread().getName() + "입니다.");
				}
			}
		});
		t4.setName("T4 스레드");
		
		Thread t5 = new Thread() {
			public void run() {
				System.out.println("이건  t5스레드 입니다." + getName());
			}
		};
		
		

		// 스레드 시작
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		// 이 아래는 main 스레드의 수행 작업내용

		for (int i = 0; i < 5; i++) {
			System.out.println("main" + i);
		}

	}

}
