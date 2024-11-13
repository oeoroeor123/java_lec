package pkg03_ArrayList;

// import java.util.* ; (모든 util 클래스 사용)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ArrayList을 사용하기 위해 class 외부에 import 지정 필요 (java.lang을 제외한 나머지 언어는 import 필요)
// 필요한 클래스 기능 일부 작성 후 자동 완성으로 완성
// import 자동 생성/삭제 : 컨트롤 쉬프트 O(영문)

public class ArrayListEx {

  /**
   * Mutable 객체
   * 저장된 요소의 개수를 변경할 수 있다.
   * 크기는 자동으로 조정된다.
   */
  public static void a() {
    // ArrayList 선언 : 타입은 List 인터페이스 타입 사용
    List<String> members;
    
    // ArrayList 생성 : 제네릭 타입은 생략 가능
    members = new ArrayList<String>(); // == members = new ArrayList<>(); 기본 요소 크기 10
    
    // 요소 추가하기 (인덱스 0부터 순차적으로 추가)
    members.add("제니");
    members.add("지수");
    members.add("태양");
    members.add("로제");
    members.add("리사");
    
    // 요소 삭제하기 (삭제된 요소 자리로 이후 요소들이 이동한다.)
    members.remove(2);
    
    // 요소 수정하기
    members.set(0, "jenny");
    members.set(1, "jisu");
    members.set(2, "lisa");
    members.set(3, "rose");
    
    // 요소 전체 확인
    System.out.println(members);
    
    // 요소 개별 확인
    System.out.println(members.get(0));
    System.out.println(members.get(1));
    System.out.println(members.get(2));
    System.out.println(members.get(3));
    
    // 요소 개수
    System.out.println(members.size());
  }
  /**
   * Immutable 객체
   * 저장된 요소의 개수를 변경할 수 없다.
   */
    
  public static void b() {
    
    // (배열) 초기화를 이용한 ArrayList 생성
    List<Integer> numbers =  Arrays.asList(10, 20, 30, 40, 50, 60, 70);
    
    // 요소 추가하기 (추가 불가능)
    // numbers.add(80);
    
    // 요소 삭제하기 (삭제 불가능)
    // numbers.remove(0);
    
    // 요소 수정하기
    numbers.set(0, 100);
    numbers.set(1, 200);
 
    // 전체 요소 확인
    System.out.println(numbers);
  }
  
  public static void c() {
    
    String[] words = {"봄", "여름", "가을", "겨울"};
    List<String> seasons = Arrays.asList(words);
    
    // length 필드는 변수이므로 여러번 참조해도 괜찮다.
    for(int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }
    
    // size() 메소드는 한 번만 호출할 수 있도록 초기화 영역에서 변수로 처리한다.
    for(int i = 0, size = seasons.size(); i < size; i++) {
      System.out.println(seasons.get(i));
    }
    
  }
  public static void main(String[] args) {
    a();
  }
  

}
