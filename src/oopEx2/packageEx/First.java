package oopEx2.packageEx;

import oopEx2.*;

	public class First{
	
	//스태틱 없고 클래스밑에있으면 맴버필드
	//맴버메서드는 객체안에잇음
	public String name;
	protected String addr;
	String password;
	
	
	//이 생성자는 public 이기에 다른 패키지에서도 호출 가능함
	/*public First() { //생성자생성
		
	}*/
	
	//이 생성자는 protected 이기에 같은 패키지에서는 호출 가능, 다른 패키지에선
	//오로지 자식 클래스만 호출 가능함
	protected First(String name) { 
		this.name = name ;
	}
	
	//이 생성자는 default 이기에, 같은 패키지에서만 호출 가능.. 다른 패키지에선 호출 불가
	First(String addr, String password) { //public,protected 등 안써있는게 default 임
		this.addr = addr ;
		this.password = password ;
	}
	
	public void setName(String name) { //메소드들 정의
		this.name = name ;
	}
	public void setAddr(String addr) {
		this.addr = addr ;
	}
	void setPassword(String password) {
		this.password = password ;
	}
	
	
	
	private static void main() {

		
	}	
	
	
	/*
	 * 접근제어자 (AccessModifier) : 접근제어자는 public > protected > default > private
	 * 순으로 사용 할 수 있습니다. 사용 범위는 클래스(public or default)
	 * 필드, 생성자, 메서드 (4개 모두)
	 * 
	 * 접근제어자를 선언하지 않을시 컴파일러는 기본적으로 default (이름없는) 접근제어자를 넣어줍니다.
	 * 
	 * public 은 패키지 구분없이 모두에게 참조 가능한 형태를 뜻하며
	 * protected 는 같은 패키지내에선 접근 가능, 다른 패키지에서는 상속받은 자식 클래스만 가능
	 * default 는 같은 패키지에서만 가능
	 * private 은 오로지 자신 클래스에서만 가능
	 * 
	 * */
	

		
		
	
}

	
	

