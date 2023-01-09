package utilex;

import java.util.ArrayList;

/*
 * 이 클래스는 필요한 DTO 객체를 필요한 만큼 생성해서 List Type 으로
 * DAO 에게 보내는 역할을 합니다.
 *
 * DAO 는 정보를 뺴올수도 넣을수도 있는 기능
 * 정보를 DB에 넣을때는 DTO의 정보를 넣음
 * 
 * 박스안에 정보가 들어감 DTO는
 * 
 * */

public class SendDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDTO dto1 = new StudentDTO();
		dto1.setGroup(1);
		dto1.setNumber(2);
		dto1.setName("강철민");
		dto1.setTel("01023133061");
		
		
		StudentDTO dto2 = new StudentDTO();
		dto2.setGroup(1);
		dto2.setNumber(3);
		dto2.setName("박선영");
		dto2.setTel("0100000000");
		
		
		StudentDTO dto3 = new StudentDTO();
		dto3.setGroup(1);
		dto3.setNumber(4);
		dto3.setName("박수빈");
		dto3.setTel("01022222222");
		
		
		//Generic 을 이용해서 Element type 을 제한 합니다.
		ArrayList<StudentDTO> members = new ArrayList<StudentDTO>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		
		//DAO 의 특정 메서드에 이 정보를 보냅니다.
		//메서드 이름은 putDtos(ArrayList<StudentDTO> list) 형태가 됩니다.
		StudentDAO dao = StudentDAO.getInstance(); //싱글톤생성
		dao.putDtos(members);
		
		
	}

}
