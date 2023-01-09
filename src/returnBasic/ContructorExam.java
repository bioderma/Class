package returnBasic;

/* 이렇게 중복으로 할수는 있지만 안함
class A{
	
}
class B{
	
}
*/

//부모 클래스가 될 기본 클래스 정의 해봅니다.
class Parent extends Object{ 
	private String myName; //이름 멤버 변수    멤버필드
	private int age ; //나이멤버변수
	
	public Parent() { //기본생성자
		super();//Object 의 기본생성자를 호출한거임
		this.age = age;
		this.myName = myName;
	}
	
	public void myjob() {
		System.out.println("Parent 클래스의 직업은 어부");
	}
	
}

//	public String getMyName() {
//		return myName;
//	}
//
//	public void setMyName(String myName) {
//		this.myName = myName;
//	}
//
//	public int getAge() {
//		return age; //get 멤버필드를 넘겨줌
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	


class Son extends Parent{
	private String myjob;
	
	public Son() {
		super(); // Parent 기본 생성자 호출한거임
		
	}
	
	public void myjob() {
		System.out.println("Son 클래스의 직업은 자바프로그래머");
		super.myjob();
	}
}







class UserEmail{
	
	private String email; //중요한애들은 private 로 묶을거임, 내 클래스 안에서만 접근가능 
	
	public UserEmail(String email) { // UserEmail 의 생성자 만듬
		this.email = email;
	}
	
	//email 값을 리턴하는 getter 만들기,
	//쉽게 말해서 email 이 private로 되어있기떄문에 가져와서 쓸수있도록
	//속성을 리턴해줌
	public String getEmail() {
		return email;
	}
	
	}

public class ContructorExam {
	
	UserEmail email;
	
	
	
	public static void main(String[] args) {
		
		// = 기준으로 왼쪽은 객체 오른쪽은 인스턴스
		Son son = new Son(); //Son 기본 인스턴스 생성
		Object object = son; //Ref 를 복사해서 넘겨준다.
		Parent parent = (Parent)object; //Object Ref 하는 참조값을 parnet 에게 넘겨준다.
		Parent p2 = new Son(); //페어런트타입으로 son을 만든거임
		
		/*
		parent = null; //여기서 몹쓸 인스턴스는 참조를 잃어버리면 몹쓸객체임
		p2 = null; //얘가 몹쓸객체
		*/
		
		//System.out.println(object);
		
		
		System.out.println(object.equals(son)); //equals 같은인스턴스니?
		System.out.println(parent.equals(p2));
		((Parent)object).myjob(); //son의 마이잡을 먼저 찾기때문에 son의 직업이나옴
								//부모가 은닉되어있는거를 풀려면 자식클래스에 마이잡
								//super.myjob(); 를 넣으면 보일수잇음
		
		
		
		
		
		
		
		
		if( parent == p2) { //주소값이 다르기때문에 틀림
			//rtype 에서 == 연산자를 쓰면, 같은 객체니? 라고 묻는것입니다.
			//즉 Reference 값이 같니??
			System.out.println("두 객체는 같은 객체입니다.");
			System.out.println(son);
			System.out.println(object);
			
		}
		
		
		
		
		System.out.println("이메일 입력해주세요");
		String email = "sun-y95@naver.com";
		
		ContructorExam play = new ContructorExam();
		
		play.email = new UserEmail(email);
		
		System.out.println(play.email.getEmail());
	}

}
