package oopEx2;

/*인터페이스에 선언되는 필드에 대한 강의..
*필드로 선언 되는 모든것들은 자동으로 public static final 이 붙습니다.
*이말은 공유 필드로 선언되어진다는 말입니다.
*때문에 접근시에는 인스턴스가 아닌 인터페이스명. 필드가 되어야 합니다.
*이렇게 할 수 있게끔 만드는 키워드가 static 입니다.
*
*
*/

public interface StarUnitsProp {
	//모든 유닛이 죽어야 하는 HP 선언
	public static final int ALL_UNIT_DEATH_HP = 0;
	
	//각 유닛별 최대 HP 설정.
	//상수 공유필드 이기 때문에 항상 불변 ! FINAL
	//공유의 목적이기 떄문에 public static final 을 넣든 안넣든 무조건 들어감
	//객체입장에서 스태틱은 과거임 이미 일이 벌어짐 스태틱에서 객체를 보기에는 미래임
	//객체 입장에서 스태틱을 접근할수있음
	
	int MARINE_MAX_HP = 60;
	int FIREBET_MAX_HP = 40;
	int MEDIC_MAX_HP = 40;
	int HYDRARISK_MAX_HP = 40;
}
