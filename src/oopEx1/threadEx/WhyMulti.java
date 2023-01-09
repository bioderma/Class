package oopEx1.threadEx;

import javax.swing.JOptionPane;

/*
 * 멀티스레드를 왜 이용하는지에 대한 내용을 보여주기 위한 클래스 입니다.
 * 아래의 예제를 단위별로 실행 후 당위성을 생각해보세요
 *
 * */

public class WhyMulti {
	
	public static void main(String[] args) {
//		 아래는 main 스레드가 위의 입력을 기다리는 동안 블락킹 상태가 되어 아무것도 
//		 못하는것을 구현한 예제입니다.
//		 이를 극복하기 위해 카운트하는 스레드를 정의해서 각각 실행해 봅니다.
		  
		Thread countThread = new Thread() {
			@Override
			public void run() {
				for (int i = 10; i > 0; i--) {
					System.out.println(i);
					
					try {
						Thread.sleep(1000); // 1초동안
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
			}
			
		};
		
		
		countThread.start();
		String input = JOptionPane.showInputDialog("아무값이나 입력해");
		System.out.println("입력한 값은" + input + "입니다.");
		
		
		
		
		
		/* 
		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			// 아래의 스레드 메서드는 주어진 millis 만큼 실행중인 스레드를
			// 실행 대기 상태로 만들어주는 대표적인 메서드 입니다.
			// 알려진 예외가 throws 되었기에 반드시 핸들링 하세요

			try {
				Thread.sleep(1000); // 1초동안
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
	}

}
