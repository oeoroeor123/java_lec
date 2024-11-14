package pkg05_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map 인터페이스
 * 1. 하나의 데이터가 쌍(key,value)으로 구성되어 있다.
 * 2. 인스턴스를 대체할 수 있다.
 * 3. 구성 요소
 *  1) Key : 데이터 요소의 식별자, Set 구조를 가지고 있다.(저장 순서가 없고, 중복 저장된 key가 없다.)
 *  2) Value : 데이터 자체 (중복 저장 가능)
 *  3) Entry : Key + Value를 합친 하나의 유닛이다.
 */

public class HashMapEx {
  
  /**
   * Mutable 객체
   */
  public static void a() {
    
    // HashMap 인스턴스 선언 (Map 인터페이스 타입 사용)
    Map<String, Object> map;
    
    // HashMap 인스턴스 생성
    map = new HashMap<String, Object>();
    
    // Entry 추가 (key, value의 추가)
    map.put("title", "어린 왕자");
    map.put("author", "생텍쥐베리");
    map.put("price", 10000);
    map.put("isBestSeller", true);
    
    // Key 중복 체크
    map.put("price", 20000); // 중복된 항목은 덮어쓰기를 수행 (가격을 20000원으로 수정한다.)
    
    // 전체 Entry 확인
    System.out.println(map);
    
    // 개별 Entry 확인 (key를 전달하면 해당 value를 확인할 수  있다.)
    System.out.println(map.get("title"));
    System.out.println(map.get("author"));
    System.out.println(map.get("price"));
    System.out.println(map.get("isBestSeller"));
    
    // value 타입은 object이다. > boolean 타입으로 형 변환 필요
    if((boolean)map.get("isBestSeller")) {
      System.out.println("베스트셀러");
    }else {
      System.out.println("일반서적");
    }
    
    // Entry 개수
    System.out.println(map.size());
    
    // Entry 삭제
    map.remove("author");
    System.out.println(map);
  }
  
  
  /**
   * Immutable 객체
   */
  public static void b() {
    
    Map<String, Object> map = Map.of("brand", "genesis", "model", "G80");
    
    // Entry 추가 (추가 불가)
    // map.put("price", 40000);
    
    // Entry 삭제 (삭제 불가)
    // map.remove("brand");
    
    // Entry 수정 (수정 불가)
    // map.put("brand", "bmw");
    // map.put("model", "dd");
    
    System.out.println(map);
  }
  
  
  /** 
   * 반복문
   */ 
  public static void c() {
    
    // Map 인스턴스 생성
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("title", "파묘");
    map.put("actors", Arrays.asList("김고은","최민식")); // 리스트 생성
    map.put("star", 9.0);
    
    // Key를 저장하는 Set 생성 (Map의 key 값과 동일하게 String으로 잡음)
    Set<String> keys = map.keySet();
    System.out.println(keys);
    
    // Set 순회하면서 Map의 Value 확인
    for(String key : keys) {
      System.out.println(map.get(key));
    }
  }
  
  
  /**
   * 반복문2 (Immutable 객체)
   */
  public static void d() {
   
    // Map 인스턴스 생성
    Map<String, Object> map = Map.of("soonbun", 1150,
                                     "bunho", new HashSet<Integer>(Arrays.asList(2,23,13,53,1,6))); // HashSet 초기화 : collection 밑에 list와 set이 구성된다.

    // Set에 모든 Entry 저장하기
    Set<Entry<String, Object>> entries = map.entrySet();

    // for 문 순회
    for(Entry<String,Object> entry : entries) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }    
  }
  

  public static void main(String[] args) {
    d();

   
    
    
    
    
    
    
    
  }

}
