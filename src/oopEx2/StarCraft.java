package oopEx2;



public class StarCraft {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//테란 유닛은 실제 없지만, 객체 테스트 용으로 만들어봄..
		//Terran t = new Terran("이건 테란입니다."); 
		//Terran 은 추상이기에 자신을 인스턴스를 생성 할수없다. 
		
		// 마린 클래스를 정의 했기 때문에 객체를 만들고 싶은 만큼 생성할 수 있습니다.
				//객체 생성 코드는 ClassName ref 변수 = new Class(); 처럼 할수 있습니다.
				
				//Marine m1 = new Marine("Jason","이등병",40,60);//Instance 화 하는 단계,
				//즉 객체를 생성하는 코드입니다.
				//해서 정확한 문법적 표현은 Instantiation 이라고 합니다.
				//위에서 Marine() 이 호출된 이후엔 Marine 클래스의 인스턴스가 생성되고
				//해당 인스턴스는 JVM 이 관리하는 Heap 메모리 영역에 저장되어집니다.
				//
				
		/*
		 * 객체지향의 다형성 : 다형성이란, "상속" 관계에서 생성된 인스턴스를
		 * Ref 하는 형태가 다양하게 변경될 수 있다는 의미 입니다.
		 * 
		 * 이 말을 다시 풀어보면, 우리가 Ptype 에 배웠던 프로모션과 캐스팅과 같습니다.
		 * 상속관계에서 자식의 인스턴스를 생성 또는 이미 생성된 인스턴스를 Ref 할 때 부모타입으로
		 * 가능한데, 이 때 생성된 인스턴스는 해당 클래스의 생성자를 호출하여 생성되었기에
		 * 메모리에 사라지기 전까지는 인스턴스 타입은 불변입니다.(꼭 기억하세요)
		 * 
		 * 하지만 해당 인스턴스를 Ref 한 타입 변수는 부모 타입이기에 Ref 타입은 부모타입으로
		 * 변경되어지게 됩니다. (이부분을 많이 헷갈려 합니다.)
		 * 
		 * 이렇게 다형성으로 생성된 또는 Ref 된 인스턴스의 메서드 or 변수를 호출할떄는
		 * 무조건 오버라이드된 애들이 호출 되어집니다.
		 * 
		 * 하지만, 인스턴스에만 정의된 메서드를 호출하게 될시에는 컴파일 에러가 유발됩니다.
		 * 
		 * 이유는 Ref 하는 변수 타입에는 해당 내용이 없기 때문입니다.
		 * 
		 * 이렇게 다형성을 구현하는 이유는, 상속 관계에서 자식들이 상속받은 메서드를 자신의
		 * 목적에 맞게 오버라이드 했을경우, 어떤 타입이건 상관없이 동일하게 부모 타입으로
		 * Ref 해서 오버라이드된 메서드를 호출 할때, 즉 메서드명은 하나로 통일 하되, 내용부는
		 * 인스턴스에 적용된 내용이 나오도록 하는데 목적이 있습니다.
		 * 
		 * 꼭 기억해야 할 것은, 부모타입으로 Ref 하던, 인스턴스를 생성하던, 생성된 인스턴스의
		 * 타입은 절대 불변이라는 겁니다.
		 * 
		 * 
		 * 
		 * */
//		
//		Terran marine = new Marine("Jason", "이병", 60, 60); //인스턴스함
//		Terran firebet = new FireBet("불쏘시개", "상병", 40, 70); //인스턴스함
//		Terran medic = new Medic("쥴리아", "하사", 50, 0); //인스턴스함
//		
//		marine.sound();
//		firebet.sound();
//		medic.sound();
//		((Marine)marine).move(100,100);
//		
//		
//		//타입변경을 해봅니다. 즉, 마린인스턴스이 Ref 타입을 원형으로 변경해봅니다.
//		Marine ma = (Marine)marine;
//		Object obj = ma;
//		ma = (Marine) obj;
//		medic = (Medic)obj;
//  		
		
		
		
		Marine m1 = new Marine("Jason","이등병",40,60);//Instance 화 하는 단계 즉,인스턴스
		FireBet f1 = new FireBet("불추장", "상병", 60, 80);
		Medic md1 = new Medic("간호사","하사",60,0);
		Ghost go1 = new Ghost("고스트","중이병",60,0);
//		
//		System.out.println(m1.toString());
//		System.out.println(f1.toString());
//		System.out.println(md1.toString());
//		
//		m1.sound();
//		f1.sound();
//		md1.sound();
//		
//		md1.healing("마린");
//		
		Terran[] allUnit = {m1,f1,md1,go1};
		for(int i = 0; i<allUnit.length; i++) {
		Terran theUnit = allUnit[(int)(Math.random() * allUnit.length )];
			//리턴되는 유닛을 모두 300,300 지점으로 도망(이동)을 시켜보세요.
			//모든 유닛들을 sound()를 호출해보세요.
		
		//((Terran)theUnit).move(300,300);
		theUnit.sound();
		
		//만약 리턴되는 인스턴스가 메딕이라면, "마린"을 치료토록 해보세요
		//즉 healing("마린") 을 호출하세요
//		if(theUnit instanceof Medic) { //포괄적으로는 객체 여기서는 인스턴스는 컴파일이후(실행이후)에 검사함 jvm이 검사함 
//			((Medic)theUnit).healing("마린");
//		}
		
		if(theUnit instanceof Marine)  
			((Marine)theUnit).move(300,300);
		else if (theUnit instanceof FireBet) {
			((FireBet)theUnit).move(300,300);
		}else if(theUnit instanceof Medic){
			((Medic)theUnit).move(300,300);
		}else {
			((Ghost)theUnit).move(300,300);
		}
		
		}
		
		
		
	}

}
