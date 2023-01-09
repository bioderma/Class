package utilex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * 순서를 유지하고, 중복을 허용하는 List type  의 대표적 클래스인 ArrayList에 대해서 알아봄
 * */


public class ArrayListEx1 {

	static void print(ArrayList list1, ArrayList list2 ) {
		System.out.println("list1-->" + list1);
		System.out.println("list2-->" + list2);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		//다형성 이용한 ArrayList 생성하는법
		//List list1 = new ArrayList(); //arrayList인스턴스의 list타입 ! list가 부모이기 떄문임
		ArrayList list2 = new ArrayList();
		//Collcation list3 = new ArrayList(); 컬렉션 타입으로 list3인 어레이리스트 객체 만들기
		
		
		//list2.add(Integer.vlueof(1)); 이건 밑에와 같음
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(1);
		list2.add(5);
		list2.add(2);
		list2.add("1");
		
		//list2 의 일정부분을 분리해서 새로운 ArrayList를 생성해 봅니다.
		//ArrayList list3 = (ArrayList)list2.subList(1, 4);
		
		//어레이리스트로 캐스팅 안하고 생성자만들기
		ArrayList list3 = new ArrayList(list2.subList(1, 4));
		
		print(list2, list3);
		
		//add() 를 이용해서 추가를 해볼게요
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list2, list3);
		
		//set
		list2.set(3, "KK");
		print(list2, list3);
		
		
		//retainAll --> 겹치는 부분만 남기고 삭제 (list2와 list3 의 교집합 부분 빼고 삭제)
		list2.retainAll(list3);
		print(list2, list3);
		
		
		//정렬을 시켜볼게요 기본적으로 Collections 클래스에는 
		//이런 Collection 하위 타입에 대한 지원 메서드가 많이 있습니다.
		//이걸 이용해서 정렬 시켜볼게요
		Collections.sort(list2);
		Collections.sort(list3);
		print(list2, list3);
		
		//특정 list 가 값으로 존재하는지 알아봅니다.
		System.out.println(list2.containsAll(list3)); //list2에 list3이 있는지
		
		//특정 객체가 존재 하는지 알아보기
		System.out.println(list2.contains(2)); //list2에 2가 있는지 확인
		System.out.println(list2.indexOf(2)); //있다면 몇번째 인덱스에있니?? 라는 뜻 없으면 음수로출력됨
		
		
		//get(), remove()를 이용해서 Element 삭제하기
		for (int i = list3.size()-1;  i>=0; i-- ) {
			if (list2.contains(list3.get(i))) {
				list2.remove(i); 
			}
			
		}
		print(list2,list3);
		
		
		
	}

}
