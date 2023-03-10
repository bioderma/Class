package utilex;
/*
 * 이전 트리기반 맵, 키와 밸류를 같이 저장하는건 같음.. 단 KEY 를 기준으로 자동 정렬됨
 * 검색관련 매서드는 해당 TreeMap 클래스에만 존재하기에, 이 메서드를 활용하기 위해선
 * 다형성으로 생성 불가.
 * 
 * MAP.ENTRY INNER 가 키와 벨류를 관리함
 * 
 * */

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;



public class TreeMapExam {
	
	
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer> ();
		treeMap.put("min", 90);
		treeMap.put("sun", 100);
		treeMap.put("j", 50);
		treeMap.put("jung", 50);
		
		//기본적으로 정렬된 트리 출력해보기
		Set<Entry<String,Integer>> entrySet = treeMap.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":"+ entry.getValue());
		}
		System.out.println();
		
		
		//특정 키에 대한 정보 얻어오기.
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();
		System.out.println(entry.getKey()+ ":" + entry.getValue());

		entry = treeMap.lastEntry();
		System.out.println(entry.getKey()+ ":" + entry.getValue());

		
		System.out.println("==============================");
		
		
		NavigableMap<String, Integer> descMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> descSet = descMap.entrySet();
		
		for(Entry<String, Integer> e : descSet) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
		
		
	}
	
	

}
