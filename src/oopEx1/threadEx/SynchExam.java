package oopEx1.threadEx;
/*
 * 자바동기화 (synchronized) : 하나 이상의 쓰래드가하나의 공유 객체에 접근해서
 * 공유된 멤버필드를 사용 할때 동기화가 되어지지 않으면, 올바른 값이 도출되지 않을수 있다.
 * 해서 자바에서는 동기화란 개념을 이해 하나의 쓰래드가 공유 객체를 점유 하는 순간 
 * 해당 객체에 lock 을 걸어서 다른 쓰래드가 접근을 할 수 없도록 한다. 점유한 쓰래드가 
 * 작업을 다 마칠때까지 다른 쓰르드는 대기 영역에서 머물게 되고 , lock 을 해제하는 순간
 * 객체에 접근 하여 run() 을 수행 한다.
 * 
 * 이렇게 동기화를 적용하는 방법은 두가지인데 , 하나는 멤버필드의 값을 조작하는 메서드 전체에
 * 동기화 선언을 하는 방법이고 , 다른 하나는 특정 메서드에서 동기화가 필요한 로직에 
 * 동기화 블럭을 선언 하는 방법이다.
 * 
 * 첫번째 방법에는 메서드 return type 선언 전에 synchronized 라는 키워드를 선언하면 되고
 * 두번째는 synchronized(공유객체명){동기화가 필요한 로직 구현} 으로 한다.
 */

//계좌클래스 정의 합니다. 속성으로는 잔액을 가지게 합니다.


class Account {
	int balance = 1000;// 잔액

	public synchronized void withdraw(int money) {
		if (this.balance >= money) {
			try {
				Thread.sleep(1000);
				this.balance -= money;
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

class ConThread implements Runnable {
	// 이 쓰레드가 위의 Account 객체 하나를 공유 하도록 하기 위해
	// 필드로 Account 객체를 생성 합니다.
	Account myAcc = new Account();

	@Override
	public void run() {
		while (myAcc.balance > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			myAcc.withdraw(money);
			System.out.println("잔액 : " + myAcc.balance);
		}

	}

}

public class SynchExam {

	public static void main(String[] args) {

		ConThread shared = new ConThread();
		Thread th1 = new Thread(shared);
		Thread th2 = new Thread(shared);
		// TODO Auto-generated method stub

		th1.start();
		th2.start();

	}

}