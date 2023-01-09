package langEx;
public class StringBuilerEx {

	   public static void main(String[] args) {


	      StringBuilder sb = new StringBuilder("Hello");
	      System.out.println(sb.length());
	      System.out.println(sb.capacity());
	      
	      sb = sb.append(new String(" Java World...졸려도 일어나세요").toCharArray());
	      System.out.println(sb.capacity());
	      System.out.println(sb);
	      
	      System.out.println(sb.delete(0,5));//hello지우기
	      sb.ensureCapacity(200);
	      System.out.println(sb.capacity());
	      
	      System.out.println(sb);
	      //18번 인덱스
	      
	      //sb 결과를 insert 를이용해서 addmsg를 일어나세요 앞에추가해보기
	      
	      char[] addMsg = "기지개좀켜고".toCharArray();
	      
	      sb.insert(sb.indexOf("일어"),addMsg);
	      System.out.println(sb);
	      
	      
	      sb.setCharAt(0,'k');
	      System.out.println(sb);
	      
	      //sb 객체를 그대로 String 객체로 변환 해보세요.
	     // System.out.println(sb.toString());
	      
	      

	   }

	}