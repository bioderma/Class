package oopEx2;

public class Ghost extends Terran implements GhostAbility{
	private String name;// 마린의 이름
	private String rank;// 계급
	private int hp;// 피통
	private int damage;
	
	
	
	public Ghost(String name, String rank, int hp, int damage) {
		super("고스트");
		this.name = name;
		this.rank = rank;
		this.hp = hp;
		this.damage = damage;
	}

	public String toString() {
		return super.toString() + "이름은 " + this.name + " 계급은 " + this.rank + " HP : " + this.hp + " 공격력 : " + this.damage;
	}

	// 이동하는 기능인 move 메서드를 정의 합니다.
	public void move(int x, int y) {
		System.out.println(this.name + " 이 " + "[" + x + "," + y + "]로 이동했습니다.");
	}
	
	@Override
	public void sound() {

		System.out.println("Ghost says: Theres No One here!");
	}

	@Override
	public void attack(String taget) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nuclearLaunch(int x, int y) {
		System.out.println("핵폭탄 발사됨.. 좌표는[" + x + "," + y + "]");
		
	}

//	@Override
//	public void attack(String taget) {
//		System.out.println(super.getTheUnit() + "이 권총으로" +taget + "을 공격합니다.");
//		
//	}

}
