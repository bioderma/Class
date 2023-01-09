package basic;


public class ArrayExam {

	public static void main(String[] args) {
		/*
		 * 자바배열 (Array) : 자바에서는 String, 배열은 모두
		 * p type 이 아닌 R type 입니다. 즉 객체란 뜻이지요
		 * 때문에 지금껏 알고있던 P type 에 대한 개념과는 틀리니 잘 이해 바랍니다.
		 * 배열을 생성할 때는 반드시 new 라는 키워드를 이용해서 생성해야합니다.
		 * 또 배열은 객체라서 해당 객체를 REF 하는 변수 (reference 변수 ) 를 반드시
		 * 이용해서 뭔가를 해야합니다. 즉 ref 를 잃어버린 배열객체는 이후
		 * 더이상 사용 불가능하기 떄문입니다. (몹쓸객체가 됨)
		 * 
		 * 
		 * */
		
		//배열 생성식 1, 길이만 준다. length 만 있다면 new를 생성해야함
		
		int[] arr = new int[3];//자바에서는 빈배열(length)가 없는 배열은 생성불가 
		//같은타입을 줘야한다 예)int타입
		//따라서 length 는 줘야한다.
		//생성된 배열 객체의 hashcode 출력.
		System.out.println(arr.length);
		//배열은 값을 주지않고 생성하면(기본배열객체) 자동으로 기본값으로 초기화됩니다.(0)
		for(int a : arr)
			System.out.println(a);
		
		//배열객체는 모든 타입 (P AND R type)을 배열로 생성할 수 있습니다.
		
		
		
		//배열 생성식 2, 값을 주고 초기화 하기
		String strArr[] = {"Hello","world","Java"}; //int strArr[] = {1,2,3}; 왼쪽식이랑 같음
		//strArr[] = new int[3]; 이미 타입이 지정되었기 때문에 다른타입으로 생성 불가.
		
		for(String str : strArr)
			System.out.println(str);
			System.out.println(strArr);
		
		
		//배열 생성식 3, 위 두개를 합친형태.. length 만 빼준다.
		char[] stars = new char[] {'a','b','c'};
			System.out.println(stars);
			
			
		// 위 str 배열을 버리고 새로운 객체를 생성한다.
			strArr = new String[3];
			System.out.println(strArr);
			for(int i =0; i<strArr.length; i++) {
				String str = strArr[i];
				System.out.println(str);
			}
			
		for(String su : strArr) {
			System.out.println(su);
		}
			
			
			
		for(String str : strArr) {
			//이걸 새로 만듬으로써 위에 String strArr[] = {"Hello","world","Java"}; 는 몹쓸객체됌
				System.out.println(str);
			}
			
		char[] mych = new char [2] ;//char 5개의 length 의 배열 생성.
		//값은 있을까?...있음..뭘로? '\u0000' 값이 없는게 아니라 공백으로 보이는거임
			mych[0] = 'a';
			mych[1] = 'b';
			//mych[2] = 'c'; 예외 에러가 뜸
			
		System.out.println("----------------------");
		
		String[] com = {"가위","바위","보"};
		
		String comValue = com[(int)(Math.random()*com.length))];
		System.out.println(comValue);
		
		}
			
			
	}
	

}
