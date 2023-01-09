package oopEx2;

public class StaticExam {
	
		
	static final int a; //static final -> 공유 변수(상수) 선언..
	//스태틱 다음에 변수가 2순위
	
	int b ;; //멤버필드
	
	void showB() { //non스태틱이라서 객체꺼임
		System.out.println("멤버필든 b 값" + this.b);
	} 
	
	static void showA() { //non스태틱이라서 객체꺼임
		
	}
	
	
		static { //스태틱은 class꺼
		a = 10;
		System.out.println("static 블락 호출됨..");
		System.out.println("static 의 값 : " +  a );
	}

	
	
	public static void main(String[] args) {
		
		showA();
		// showB();
		System.out.println("메인 메서드 호출됨..");
		
	}

}
