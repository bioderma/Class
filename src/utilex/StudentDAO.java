package utilex;
/*
 * 이 클래스는 DB에 접근해서 데이터를 select(조회), insert(삽입), update(갱신),delete(삭제)
 * 를 하는 기능의 DAO 입니다.
 * 기본적으로 Singleton 방식으로 정의할 예정입니다.
 * 따라서 생성자는 private 으로 정의하고, static 메서드를 이용해서
 * 외부 객체가 instance 를 사용할 수 있도록 정의합니다. 꼭 기억하세요.
 * */

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentDAO {
	//그래서 밑에 return this 를 못써서 자기자신을 스태틱을 만들어줌
	private static StudentDAO instance = new StudentDAO();
	
	private StudentDAO() {
		
	}
	
	//인스턴스를 얻을수 있는법 
	//딱 하나의 인스턴스만을 리턴하도록 메서드를 정의해서 이 메서드만을 통해, 사용토록 합니다.
	//클래스꺼로 만들어줘야함 ! 그래서 static
	//static 안에는 non-static 을 못쓰기 때문에 this를 사용하지 못함
	public static StudentDAO getInstance() {
		return instance;
	}	
		
	//넘겨받은 DTO를 DB 에 insert 한다라고 가정하고 출력하도록 하는 메서드 정의합니다.
		public void putDtos(ArrayList<StudentDTO> list) {
			
			for (int i = 0; i < list.size(); i++) {
				
				StudentDTO dto = list.get(i);
				System.out.println(dto.getTel());
				System.out.println(dto.getGroup());
				System.out.println(dto.getName());
				System.out.println(dto.getNumber());
				
			}
			
		
	}
	
}
