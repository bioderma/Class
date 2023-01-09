package mins;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MemberDTO {

	private String mem_Email;
	Scanner sc = new Scanner(System.in);
	GawiGame gawiGame;
	
	public MemberDTO() {
		inputEmail();
		
	}
	// 메서드 리턴을 void로 했는데 ,예시 끝난후 로직상 변경해야 할겁니다.
	private void inputEmail() {
		System.out.println("Email 을 입력 바랍니다.");
		this.mem_Email = sc.next();
		new GawiGame();
	}

	public String getMem_Email() {
		return mem_Email;
	}
}