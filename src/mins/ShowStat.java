package mins;


public class ShowStat {
	
	public int win = 0;
	public int loss = 0;
	public int tie = 0;
	public int total = 0;
	
	
	

	
	public  void gameloss() {
			this.loss++;

	}
	public void gamewin() {
			this.win++;
	
	}
	public  void gametie() {
			this.tie++;
		
	}
	public  void gametotal() {
			this.total++;
			
	}
	public void PrintPoint() {
		System.out.println("승:" + win + " 무:" + tie + " 패:" + loss + "\n");
	}
	
	
	
	

}
