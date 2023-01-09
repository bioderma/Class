package oopEx1.threadEx;
/*
 * 공유 객체 내부에 동기화 메서드와 블럭이 여러개면 이 중 하나를 점유(실행)를 하면 다른 쓰레드는 해당 메서드와
 * 다른 동기화 블럭 메서드 또한 접근이 차단 된다.(객체에 lock 걸림)
 * 
 * 하지만 일반 메서드는 수행 가능하다.
 * 
 * 쓰레드가 동기화 메서드를 실행하는 즉시 객체엔 lock, 수행 후엔 lock 해제가 된다.
 * 이때 대기중인 쓰레드는 잘못하면 데드락(DeadLock) 상태에 빠질 수 있으며, 이땐 아무것도 하지 못하는
 * 상태가 될 수 있다.
 * 
 * 만약 메서드 전체에 동기화를 걸지 않고 일부만 적용하고 싶을때 동기화 블럭을 사용한다.
 * 형식 ==> void someMethod(){synchronized(공유객체){동기화 적용 로직}}
 */

// 아래의 클래스는 잔액을 계산하는 기능을 가진 클래스
// 각각의 메서드를 통해 하나는 금액을 set, 하나는 get 하도록 한다.
// 이 때 이 객체를 다중의 쓰레드가 접근하면서 각기 다른 메서드를 호출하면 오류인 값이 나오는데 이를 동기화 메서드와 블럭을 이용해서 적절히 제어한다.
class Calculator{
	
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public synchronized void setMoney() {
		this.money = money;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.money);
	}	// setMoney()의 끝
	
	// 동기화 블럭을 적용한 예
	public void setMoney2(int money) {
		synchronized (this) {	// 자신이 공유 객체임을 선언함
			this.money = money;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.money);
		}
	}	// setMoney2()의 끝
	
	
}	// Calculator class의 끝

// 아래는 공유객체인 calculator를 이용하는 쓰레드 정의
class User1Thread extends Thread{
	
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator cal) {
		this.calculator = cal;
	}

	@Override
	public void run() {
		calculator.setMoney2(100);
	}
	
}

class User2Thread extends Thread{
	
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCalculator(Calculator cal) {
		this.calculator = cal;
	}
	
	@Override
	public void run() {
		calculator.setMoney2(50);
	}
	
}


public class SynchExam2 {

	public static void main(String[] args) {
		// 공유객체를 생성한다.
		Calculator cal = new Calculator();
		
		// cal 객체를 각각의 쓰레드에 넘기면 공유가 된다. 이유는 ref가 같기 때문
		User1Thread u1 = new User1Thread();
		u1.setCalculator(cal);
		u1.start();
		User2Thread u2 = new User2Thread();
		u2.setCalculator(cal);
		u2.start();
		
	}	// main()의 끝

}	// synchExam2 class의 끝
