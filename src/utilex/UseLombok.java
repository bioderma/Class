package utilex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//https://projectlombok.org/download 에서 최신
//lombok.jar 를 C:\ 아닌 다른 /루트 드라이브에 다운받으세요
//cdm java -jar lombok.jar
//설치할 이클립스 선택 화면 -> 이클립스 리부팅 -> 프로젝트 우클릭 -> new folder
//lib 폴더 만들기 lombok jar 넣기 빌드패스 -> add to build path

// @Data : 이 어노테이션은 getter, setter, toString, hashcode, equals() 를 자동으로
//생성해줍니다.


@Data //클래스 전역에 어노테이션이 적용됌 필드만 선언하면됌
class Student{
	private String id;
	private String name;
	private int age;
}

/*
 * 롬복 Annotaion 설정 정보
 
@NoArgsConstructor //기본 생성자를 포함시킨다.
@AllArgsConstructor //필드초기화 생성자를 포함시킨다.
@RequiredArgsConstructor // 기본적으로 생성자라 포함, 만약 final 또는 @NonNULL
//이 붙은 필드가 있다면 이 필드만 초기화 하는 생성자 포함
@Getter //Getter 포함
@EqualsAndHashCode //equals(), hashCode() 포함
@ToString //toString() 포함
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
class Student2{
	private String id;
	private String name;
	private int age;
	
}

@Data
class Student3{
	private final String id = "jason"; //final 은 반드시 초기화가 되어야함
	@NonNull private String name; //@NonNull : null데이터가 오면 절대 안된다는뜻
	private int age;
	
}


public class UseLombok {

	public static void main(String[] args) {

		Student stu1 = new Student();
		Student3 stu3 = new Student3("Jason");
	
	}

}
