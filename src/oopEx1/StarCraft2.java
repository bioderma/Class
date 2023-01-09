package oopEx1;

public class StarCraft2 {

	public static void main(String[] args) {
		// 마린 클래스를 정의 했기 때문에 객체를 만들고 싶은 만큼 생성할 수 있습니다.
		//객체 생성 코드는 ClassName ref 변수 = new Class(); 처럼 할수 있습니다.
		
		//테란 유닛은 실제 없지만, 객체 테스트 용으로 만들어봄.
		//Terran terran = new Terran();
		
		
		Marine m1 = new Marine("Jason","이등병",40,60);//Instance 화 하는 단계, 즉 객체를 생성하는 코드입니다.
		FireBet f1 = new FireBet("불추장","상병",60,80);	
		Medic md1 = new Medic("간호사","하사",60,0);
		
		System.out.println(m1.theUnit);
		System.out.println(f1);
		System.out.println(md1);
		
	}

}
