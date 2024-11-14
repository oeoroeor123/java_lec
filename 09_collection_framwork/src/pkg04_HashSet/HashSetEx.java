package pkg04_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

  public static void main(String[] args) {

    // HashSet 인스턴스 선언 (Set 인터페이스 타입 사용)
    Set<String> set;
    
    // HashSet 인스턴스 생성
    set = new HashSet<String>();
    
    /* 특징
    1. 인덱스가 없다. (== 순서 없음)
    2. 중복 저장이 불가능하다.
    */
    
    // 요소 추가 (중복 저장 가능 여부 확인 > 불가)
    set.add("봄");
    set.add("봄");
    set.add("봄");
    set.add("여름");
    set.add("가을");
    set.add("겨울");

    // 전체 요소 확인 (저장 순서가 유지되는지 확인 > 인덱스가 따로 없어 저장 순서 유지 x)
    System.out.println(set);
    
    // 요소 순회 for 문 (Advenced for 문)
    for(String item : set) {
      System.out.println(item);
    }
    
    // 요소 개수 확인
    System.out.println(set.size());
  
        
    
  }

}
