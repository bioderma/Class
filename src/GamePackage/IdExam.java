package GamePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class IdExam {
	//
	private PlayerInfo player;
	private static String filePath = "C:\\Users\\k\\eclipse-workspace\\sun_95\\userData";
	private static File file = new File(filePath);
	private boolean flag;
	
	
	public IdExam() {

	}

	public IdExam(PlayerInfo player) {
		this.player = player;
	}
	public void checker(PlayerInfo player) {
		flag = true;
		File[] fileList = file.listFiles();
		String id = player.getuserId() + ".dat";
		String pw = null;
		System.out.println(id + " 아이디");
		
		File Player = null;
		
		for(int i = 0; i < fileList.length; i++) {
			Player = fileList[i];
			System.out.println(Player.getName() + " 플레이어");
			if(Player.getName().equals(id)) {
				System.out.println(Player.getName());
				flag = true;
				break;
			}
			if() {
				
			}
		}
		
}
}
