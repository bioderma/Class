package langEx;

public class IntegerExam {

	public static void main(String[] args) {
		/*
		 * Wrraper 클래스 : 자바의 모든 Ptype 의 정보를 관리하는 클래스
		 *
		 */
		int i = Integer.valueOf(10).intValue();
		
		
		new Integer("10");
		
		//왼쪽에서 오른쪽 빼기
		System.out.println(Integer.compare(11, 12));
		
		String s = "10.0";
		Double.parseDouble (s);
		
		System.out.println(Integer.toHexString(i));
		
	}

}
