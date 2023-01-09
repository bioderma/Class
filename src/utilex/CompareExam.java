package utilex;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	int score;
	String name;
	
	public Person (int score, String name){
		this.score = score;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		//0은 같을때만 0을줌
		if(this.score < o.score)return -1; 
		else if(this.score == o.score) return 0;
		else return 1;
	}
}


public class CompareExam {
	
	
	public static void main(String[] args) {
		
		Person sun = new Person(100, "선영");
		Person min = new Person(80, "철민");
		Person j = new Person(20, "제이");

		TreeSet<Person> tSet = new TreeSet<Person>();
		tSet.add(sun);
		tSet.add(min);
		tSet.add(j);
		
		for(Person p : tSet) {
			System.out.println(p.name + ":" + p.score);
		}
		
	}

}
