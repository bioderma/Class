package langEx;

	class Value{
		
		int value;
		public Value(int value) { //value 값을 초기화
			this.value = value;
		}
		
		
	}

	class Person{
		long id; //주민번호 또는 사회보장번호 필드.
		public Person(long id) { //생성자 생성
			this.id = id;
		}
		
	//상속받은 equals() 오버라이드하기..
	@Override //언어테이션 "이건 오버라이드야!"
	public boolean equals(Object obj) {
		//두 객체의 특정 값이 같은지 비교해보자..
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;
		}else {
			return false;
		}
		
	}
		
		
	}
	

public class ObjectExam {
	
	
	public String toString() {
		return "이건 오버라이된 내용이 나옵니다";
	}
	

	public static void main(String[] args) {
		
		//equals(Object obj) :파라미터의 객체와 같은 객체인지를 판별하여 true/false 를 리턴하는 메서드 
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) { //같은 인스턴스로만 true 가 나옴
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 틀립니다.");
		}
		
		v1 = v2;
		
		if(v1.equals(v2)) { //같은 인스턴스로만 true 가 나옴
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 틀립니다.");
		}
		
		Person p1 = new Person(12345678);
		Person p2 = new Person(12345678);
		
		
		if(p1 == p2) {
			System.out.println("같은 사람입니다.");
		}else {
			System.out.println("다른사람입니다.");
		}
		
		if (p1.equals(p2)) {
			System.out.println("다른 사람이지만 주민번호는 같음");
		}else {
			System.err.println("다른 사람이고 주민번호 틀림");
		}
		
	
		
		//object 의 상속된 toString() 보기
		ObjectExam objex = new ObjectExam();
		
		System.out.println(objex);
		
		System.out.println(objex.getClass().getName());  //상속된 getClass() 호출 ..
		
		System.out.println(Integer.toHexString(objex.hashCode()) );
		
		System.out.println(
		objex.getClass().getName() + "@" + Integer.toHexString(objex.hashCode()) ) ;
	
		
		
		
		
	}

}
