package langEx;

import java.io.UnsupportedEncodingException;
import java.net.MulticastSocket;
import java.nio.charset.Charset;
import java.util.*;

import javax.swing.JOptionPane;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;



public class StringExam {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//"" 을 이용해서 생성된 문자열은 모두 String pool 에 저장되고
		//새로운 리터럴을 생성할시엔, 먼저 pool 내에 같은 값이 있는 객체가 존재하는지
		//만약 있다면 해당 Ref 를 리턴합니다. 이 조건은 오직 ""(리터럴) String 객체에만 적용됩니다.
		
		String a ="abc";
		String b ="abC";
		
		String c = new String();
		String d = new String();

		if (d == b) {
			System.out.println("같은 객체니 값도 당연히 같음");
		}else {
			System.out.println("틀린 객체이고, 값이 같은지는 모르겠음.");
		}
		
		
		//String 의 override 된 equals 사용. 두 문자열 객체가 같은 값이면
		//true 아님 false 리턴.
		if(d.equals(b)) {
			System.out.println("다른 문자열 객체지만 값은 같음");
		}else {
			System.out.println("다른 문자열 객체며 값도 틀림");
		}
		
		if(d.equalsIgnoreCase(b)) {
			System.out.println("다른 문자열 객체지만 대소문자 구분없이 값은 같음");
		}else {
			System.out.println("다른 문자열 객체며 값도 틀림");
		}
		
		byte[] bArr = {65,66,67,68,69};
		
		bArr = "안녕하세요".getBytes();
		//앞으로 배열내부의 값을 문자열로 확인 하고 싶으면 아래의 API 이용하세요
		System.out.println(Arrays.toString(bArr));
		
		String bStr = new String(bArr,2,6);
		System.out.println(bStr);
		
		
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.availableCharsets());
		
		char[] chArr = {'오','늘','하','루','고','생','함'};
		String chStr = new String(chArr);
		System.out.println(chStr);
		
		char[] uniCodes = chStr.toCharArray();
		int[] converUni = new int[uniCodes.length];
		for (int i = 0; i < converUni.length; i++) {
			converUni[i] = uniCodes[i];
		}
		System.out.println(Arrays.toString(converUni));
		
		String uniStr = new String(converUni,0,converUni.length);
		System.out.println(uniStr);
		
		/*
		 *아래의 퀴즈를 풀어보세요.
		 *
		 * String myMsg = "오늘의 자바는 문자열 객체 까지 했습니다.";
		 * 
		 * 위 myMsg 를 byte[]배열로 리턴하는 메서드가 있습니다. 리턴 타입이 byte[] 입니다.
		 * 
		 * 얘를 호출해서 바이트 배열로 변환후 배열의 모든 값을 다시 새로운
		 * 문자열로 생성하는데, 단 문자열의 캐릭터셋을 IS088591 로 되어진 애로 변환해서 출력해보세요.
		 * 
		 * 
		 * */
		
		byte[] myMsg =  "오늘의 자바는 문자열 객체 까지 했습니다.".getBytes();
		
		//String newStr = new String(myMsg, 0, myMsg.length, "ISO-8859-1");
		
		String newStr = new String(myMsg, 0, myMsg.length);
		
		System.out.println(newStr);
		
		
//		System.out.println(newStr.length());
//		//newStr 의 전체를 돌면서 문자(char) 를 리턴받는다.
//		
//		for (int i = 0; i < myMsg.length; i++) {
//			char ch = newStr.charAt(i);
//			System.out.print(ch);
//		}
		
		//System.out.println(newStr.charAt(newStr.length()));
		
		
		System.out.println(Integer.toHexString(newStr.codePointAt(0)) );
		
//		char uniCar = '/uc624';
//		System.out.println(uniCar);
		
		String msg = "오늘";
		String msg2 = msg.concat("하루도 즐겁게");
		System.out.println(msg);
		
		
		//특정 문자열 찾는게 contains
		System.out.println(msg2.contains("즐겁게"));
		
		
		//배열생성식을이용한 char
		String hi = String.copyValueOf(new char[] {'h','e','l','l','o'});
		System.out.println(hi);
		
		//문자열의 끝과 처음 판별하기  처음을 찾으려면 : startWith
		String email = "sun-y95@naver.com";
		if(email.endsWith(".com") || email.endsWith("co.kr")) {
				System.out.println("올바른 서버명입니다.");}
		
		//format() : static 메소드 이면서, 문자열, 수치형등을 모두 특정 형식대로
		//포맷하여 설정 할 수 있습니다.
		
		
		
		
		
		
		/*
		 * 아래는 간단한 문법입니다.
		 * 
		 * %d(10진수 형식), %s(문자열 형식), %f(실수형 형식), Locale (날짜등의 형식)
		 * 기본적으로 포맷을 적용하면 우측 정렬이 적용됩니다. 만약 -표시를 하게 되면
		 * 왼쪽 정렬을 하게 됩니다.
		 * 
		 * */
		int i = 23;
		System.out.println(String.format("%d", i));
		System.out.println(String.format("%d_", i));
		System.out.println(String.format("%5d_", i)); //5자리 표현하기
		System.out.println(String.format("%-5d_", i)); //left 정렬
		System.out.println(String.format("%05d_", i)); //자리수가 맞지 않을때 공백을0으로 채우기
		
		
		//십진수 정수의 큰 값을 특정 포맷대로 출력시켜보기..
		int i2 = 123456789;
		// %뒤에 , 를 주면 자동으로 3자리수 마다 , 를 넣어줍니다.
		System.out.println(String.format("%,d", i2));
		System.out.println(String.format("%,015d", i2));
		
		//문자열 표시하기
		String str = "hello";
		System.out.println(String.format("%s_", str));
		System.out.println(String.format("%-12.2s", str));
		
		//실수형 표기 하기.. 키워드 f
		double n = 123.45678;
		System.out.println(String.format("%f_", 3.4));
		System.out.println(String.format("%f_", n));
		System.out.println(String.format("%.2f_", n));
		
		
		System.out.println(email);
		
		//이메일에 @ 여부 판단하기.. indexOf('@');
		int idx = email.indexOf('n',email.indexOf('n')+1);
		System.out.println(idx);
		
		//공백찾기
		if("".isEmpty()) {
			System.out.println("문자열의 값이 없습니다.");
		}
		
		//delimeter 는 문자열의 구분자를 뜻합니다. ",/"
		String deliStr = "Hello,My,Friend";
		deliStr = String.join(":","Hello","Java","World");
		System.out.println(deliStr);
		
		System.out.println(email.lastIndexOf('.'));
		
//		email = email.replace('@','a');
//		System.out.println(email);
		
		
		
		
		
		
		//★여러분의 이메일의 서버명, green.com 으로 변경해보세요.★
		
		//substring : 지정된곳까지
		//substring ( 여기부터,이곳까지를)
		String server = email.substring(email.indexOf('@') + 1);
		//index of 는 없으면 -1
		 
		//+1을 안하면 @까지가 포함이 안되서 @빠짐
		String id = email.substring(0, email.indexOf('@')+1);
		String newServer = server.replace(server, "green.com");
		
		String newEmail = id.concat(newServer); //붙이기
		System.out.println(newEmail);
		
		
		
		
		//trim
		String wSpace = "  h  ";
		System.out.println(wSpace.trim().length());
		
		
		//valueOf
		int aa = 11;
		String aaStr = String.valueOf(aa);
		System.out.println(aaStr + 1);
		
		/*
		 * 사용자의 이메일을 입력 받아서 아래의 조건에 맞게 출력해보세요
		 * 1.ID(Email) 입력하세요
		 * 2.입력 후 빈 문자열인지 검사 하세요.
		 * 3.빈 문자열이 아닌경우 아래처럼 검사하세요/
		 * 3-1. ID 와 서버로 분리하여 ID를 검증(idValidate()) 하시는데
		 * 길이는 8~12 자 사이여야 하고, 반드시 첫자는 대문자 여야 합니다.
		 * 또한 ID 중에는 반드시 숫자가 하나 이상 이어야 합니다.
		 * 만약 위의 조건이 틀린경우, 뭐가 틀렸는지 메세지를 띄우고, 모두 정상이면
		 * 사용자에게 로그인 되었습니다. 라고 출력시키세요
		 * 
		 * */
		
		
		
		String emails = JOptionPane.showInputDialog("이메일입력");
		String id = null, server = null;
		
		String invalidReason = null;
		
		while(true) {
			if(isEmail(email)) {
				id = email.substring(0, email.indexOf('@'));//0번부터 @전까지 포함
				server = email.substring(email.indexOf('@')+ 1, email.length());
			
				int upperChar =0; //대문자수의 카운트하는 변수
				int digit = 0; //숫자 카운트
			
			if(id.length() > 12 || id.length() < 6) {
				email = JOptionPane.showInputDialog("ID 길이가 맞지 않습니다.(6~12)");
				continue;//위로 다시 떨어지게
			}
			
			for (int j = 0; j < id.length(); j++) {
				char ch = id.charAt(j);
			
				if (ch >= 'A' && ch<= 'Z') {
					upperChar++;
				}
				
				if(ch >= (int) '0' && ch<= (int) '9') {
					digit++;
				}
			}
			
			if (upperChar == 0) {
				invalidReason = "대문자가 하나 이상 포함되어야 합니다.\n";
				email = JOptionPane.showInputDialog(invalidReason);
				continue;
			}
			if (digit == 0) {
				invalidReason = "숫자가 하나 이상 포함되어야 합니다.\n";
				email = JOptionPane.showInputDialog(invalidReason);
				continue;
			}
			
			server = server.replace(server, "itkorea.co.kr");
			email = id + "@" + server;
			JOptionPane.showMessageDialog(null, email + "님 회원가입 축하!!\n메일 서버 변경도 완료했습니다.");
			System.exit(0);

			} else {
			email = JOptionPane.showInputDialog("올바른 이메일 형식 아님. 재입력 바람");
			}
		}

	}
public static boolean isEmail(String email) {
	if (email.indexOf('@') == -1)
		return false;
	return true;
			
			
			}
		
	}


