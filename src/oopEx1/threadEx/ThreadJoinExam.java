package oopEx1.threadEx;

/*
 * join() 호출한 스레드는 호출된 스레드에게 CPU 점유권을 양보 하고 끝날때 까지 기다린다.
 * 스레드 자체의 메서드로 스래드를 제어하는데 사용되는 대표적 메서드이다.
 * 
 * 참고로 스레드 자체의 메서드로 제어를 시키는데 사용되는 메서드는 아래와 같다.
 * 
 * sleep(), join(), yield() 나머지 메서드는 resume() 등 모두 deprecated
 * 되었기 때문에 사용되지 않는다.
 * 
 * */

class ThreadB extends Thread{
	
	//연산 결과값 변수 선언..
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <=100; i++) {
			sum += i;
		}
	}
	
}

public class ThreadJoinExam {

	public static void main(String[] args) {
		/*
		 * 이 메인 스레드 에서는 위의 join 스레드를 start() 시킨후
		 * 1~100 까지의 연산 합을 리턴받을 예정입니다.
		 * join() 을 호출 하기 전에는 연산이 완료 되기 전에 호출이 되어서
		 * 완전한 값을 get 하지 못합니다.
		 * 이후 join() 호출, 완전한 값을 얻게될텐데, 그 차이점을 이해 하시면 됩니다.
		 * */

		/*
		 * 현재 CPU에 탑재된 즉 연산중이 Thread 객체를 리턴받는 메서드
		 * Thread.currentThread()
		 * */
		
		System.out.println(Thread.currentThread().getName()); //메인스레드 이름 얻어내기
		System.out.println("메인의 우선순위 값 :" + Thread.currentThread().getPriority());
		
		ThreadB threadB = new ThreadB();
//		threadB.setPriority(10);
		threadB.start();
		
		try {
			
			//join() 을 호출한 애는 main 스레드이고,호출당한 애는 threadB 입니다.
			//따라서 threadB 가 run() 을 모두 완료할때까지 main 스래드는
			//기다리는 상태가 됩니다. 정확히는 sleep() 을 호출한 것과 같습니다.
			//이때 main 스레드는 누가 꺠워주지 않으면, 계속 실행대기 영역에서
			//머무르게 되기 때문에 문제가 발생합니다. 따라서 내부적으로 InterruptedException : (자동으로 발생시킴)
			//을 발생시켜 main 스래드를 깨워, Runnable 상태로 다시 갈 수 있도록 만드는 겁니다.
			
			threadB.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("ThreadB 가 연산한 1~100 까지의 합 : " + threadB.getSum());
	}

}
