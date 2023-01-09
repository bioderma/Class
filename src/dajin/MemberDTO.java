package dajin;
import javax.swing.JOptionPane;

public class MemberDTO {
	public String mem_Email;
	GBW GBW;
	JOptionPane input;
	
	
	public MemberDTO() {
		inputEmail();
	}
	
	

	// 메서드 리턴을 void로 했는데, 예시 끝난후 로직상 변경해야 함.
	private void inputEmail() {
		this.mem_Email = input.showInputDialog("이메일 입력");
		//getMem_Email();
		GBW = new GBW();
		
		//return mem_Email;
		
		
		
		
	}
	public String getMem_Email() {
		return mem_Email;
	}
//
//	public String getMem_Email() {
//		return mem_Email;
//	}
}
